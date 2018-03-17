for /f "tokens=5" %%a in ('netstat -aon ^| find ":9090" ^| find "LISTENING"') do taskkill /f /pid %%a
call mvn spring-boot:run