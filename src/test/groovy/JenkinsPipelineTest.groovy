import com.lesfurets.jenkins.unit.BasePipelineTest
import groovy.util.logging.Slf4j
import org.junit.Before
import org.junit.Test

import static org.hamcrest.MatcherAssert.assertThat

@Slf4j
class JenkinsPipelineTest extends BasePipelineTest {
    @Override
    @Before
    void setUp() throws Exception {
        scriptRoots += 'src/test/jenkins'
        super.setUp()
    }

    @Test
    void shouldExecuteWithoutErrors() {
        def script = loadScript("Jenkinsfile.groovy")

        log.info("script : {}", script);

        printCallStack()

        assertJobStatusSuccess()
    }
}
