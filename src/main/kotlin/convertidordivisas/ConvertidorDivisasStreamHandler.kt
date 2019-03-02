package convertidordivisas

import com.amazon.ask.SkillStreamHandler
import convertidordivisas.dsl.handler
import convertidordivisas.dsl.skill
import convertidordivisas.handlers.*

class ConvertidorDivisasStreamHandler : SkillStreamHandler(skill {
    handler { CancelandStopIntentHandler() }
    handler { ConvertIntentHandler() }
    handler { HelpIntentHandler() }
    handler { LaunchRequestHandler() }
    handler { SessionEndedRequestHandler() }
})