# Athlete-evaluation


Sport Concussion Assessment System Project
Purpose:
Students will develop an application called “Sport Concussion Assessment System” that can help sport medical practitioners monitor athletes’ conditions for symptoms of concussion. Currently, one of the most commonly-used tools for assessing concussions is the SCAT2, a paper-based diagnostic tool. The app students develop aims to help sport medical practitioners make a more timely diagnosis of concussions and avoid subsequent issues that could put the athletes’ well-being at risk. Students developing the app will get hands-on experience with topics discussed in the unit, including actors, use cases, use-case diagrams, object identification, class diagram development, and Java implementation.
Objectives:
Students will be able to:
● Elicit requirements for a software system using user scenarios and diagrams.
● Identify objects from a given scenario.
● Develop class diagrams for identified objects.
● Properly apply UML notation to develop class diagrams and use-case diagrams.
● Implement an application using Java.
Technology Requirements:
● Astah ● Java
Project Overview:
Phase 1: Eliciting requirements using use cases, use-case diagrams, and CRC diagrams.
 
 Phase 2: Object identification and class diagram development. Phase 3: Implementation using Java
Project Description:
Develop a software system called "Sport Concussion Assessment System,” an app that helps sport medical practitioners receive and evaluate the conditions or symptoms of athletes after each game/training session for a possible concussion.
The system will have two groups of users: athletes and sport medical practitioners.
Athletes enter their health conditions or concerns based on well-defined symptoms * (Figure 1: SCAT2 Documentation) through the athlete application (ideally, this could be deployed on a smartphone or hand-held device), as well as their pain levels on a numerical scale from zero (no pain) to six (severe pain). The app should use the criteria in the table below to determine the difference in athlete symptoms between two successive games or practices and report on the athlete’s condition, which the sport medical practitioner may use to advise athletes as needed.
*All symptom information required for this project is available in the right column of the first page of the Sport Concussion Assessment System Submission Document.
Basic Operation: Input symptom evaluation (twenty-two factors) after each game. Your app should then store data for the five most recent games in a suitable data structure. Athletes can see the symptoms summary for each game by selecting a symptom summary button. The symptom summary includes:
● Total number of symptoms
● Symptom severity score
● Overall rating (no difference, very different, unsure) - after comparing with the summary
of the previous game
Once an athlete submits his or her symptoms through the application, sports medical practitioners should be able to review the symptoms and view the “risky condition indicator” for each athlete. “Risky condition” is defined as “a dramatic change in the athlete’s symptom severity in two successive games” (i.e. “very different” overall rating). The overall severity rating is used to confirm the risky condition in the athlete. Based on the “risky condition indicator,” the sport medical practitioners can advise each athlete as needed.
1 This is not the criteria doctors use. Do not use this for any actual diagnostic purposes.
   Overall Severity Rating
Criteria1 comparing the last two games’ symptom summaries
When athlete selects “Am I at Risk?” button...
No difference:
total symptom difference < 3 && severity score < 10
Display a green image
 2

Unsure:
total symptom difference < 3 && severity score ≥ 10
Display a yellow image
Very different:
total symptom difference ≥ 3 || severity score ≥ 15
Display a red image
