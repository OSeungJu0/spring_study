package hello.core.web;

import hello.core.common.MyLogger;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private  final MyLogger myLoggers;

    public void logic(String id) {
        myLogger.log("service id = " + id);
    }
}
