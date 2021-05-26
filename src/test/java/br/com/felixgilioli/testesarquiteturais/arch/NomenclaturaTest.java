package br.com.felixgilioli.testesarquiteturais.arch;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import javax.persistence.Entity;

import org.springframework.web.bind.annotation.RestController;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(
        packages = "br.com.felixgilioli.testesarquiteturais",
        importOptions = ImportOption.DoNotIncludeTests.class
)
public class NomenclaturaTest {

    @ArchTest
    public static final ArchRule classesAnotadasComEntityDevemTerminarComOSufixoEntity = classes()
            .that().areAnnotatedWith(Entity.class)
            .should().haveSimpleNameEndingWith("Entity")
            .as("Classes anotadas com @Entity devem ter o sufixo 'Entity'.");

    @ArchTest
    public static final ArchRule classesAnotadasComRestControllerDevemTerminarComOSufixoController = classes()
            .that().areAnnotatedWith(RestController.class)
            .should().haveSimpleNameEndingWith("Controller")
            .andShould().haveSimpleNameNotEndingWith("RestController")
            .as("Classes anotadas com @RestController devem ter o sufixo 'Controller'.");
}
