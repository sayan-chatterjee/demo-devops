taskkill /f /fi "WindowTitle eq demo-devops" /t
title demo-devops
call mvn spring-boot:run