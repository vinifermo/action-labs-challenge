SELECT c.name, SUM(qs.score) as total_score
FROM candidate c
         JOIN question_score qs ON c.candidate_id = qs.candidate_id
         JOIN test t ON qs.test_id = t.test_id
WHERE t.name = 'Java backend'
GROUP BY c.candidate_id, c.name
ORDER BY total_score DESC;