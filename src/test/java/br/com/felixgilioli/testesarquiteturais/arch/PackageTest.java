package br.com.felixgilioli.testesarquiteturais.arch;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RestController;

import com.tngtech.archunit.core.importer.ImportOption.DoNotIncludeTests;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(
        packages = "br.com.felixgilioli.testesarquiteturais",
        importOptions = DoNotIncludeTests.class
)
public class PackageTest {

    @ArchTest
    public static final ArchRule classesAnotadasComEntityDevemFicarNoPacoteEntity = classes()
            .that().areAnnotatedWith(Entity.class)
            .should().resideInAPackage("..entity..")
            .as("Classes anotadas com @Entity devem ficar no pacote 'entity'.");

    @ArchTest
    public static final ArchRule classesAnotadasComRestControllerDevemFicarNoPacoteController = classes()
            .that().areAnnotatedWith(RestController.class)
            .should().resideInAPackage("..controller..")
            .as("Classes anotadas com @RestController devem ficar no pacote 'controller'.");

}
