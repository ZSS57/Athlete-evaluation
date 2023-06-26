# Athlete-evaluation


Once an athlete submits his or her symptoms through the application, sports medical practitioners should be able to review the symptoms and view the “risky condition indicator” for each athlete. “Risky condition” is defined as “a dramatic change in the athlete’s symptom severity in two successive games” (i.e. “very different” overall rating). The overall severity rating is used to confirm the risky condition in the athlete. Based on the “risky condition indicator,” the sport medical practitioners can advise each athlete as needed.

The symptom summary includes:
● Total number of symptoms
● Symptom severity score
● Overall rating (no difference, very different, unsure) - after comparing with the summary of the previous game
Criteria1 comparing the last two games’ symptom summaries

When athlete selects “Am I at Risk?” button...

  No difference:
total symptom difference < 3 && severity score < 10, display a green image
  Unsure:
total symptom difference < 3 && severity score ≥ 10, display a yellow image
  Very different:
total symptom difference ≥ 3 || severity score ≥ 15, display a red image
