CREATE TABLE institution (
    institutionid INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(250) NULL,
    PRIMARY KEY (institutionid)
);


CREATE TABLE course (
    courseid INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    institution INT NOT NULL,
    PRIMARY KEY (courseid),
    CONSTRAINT institution FOREIGN KEY (institution) REFERENCES education.institution (institutionid)
);



CREATE TABLE student (
    studentid INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(250) NOT NULL,
    course INT NOT NULL,
    PRIMARY KEY (studentid),
    CONSTRAINT course FOREIGN KEY (course) REFERENCES education.course (courseid)
);


SELECT institution.name AS "INSTITUTION NAME", 
    course.name AS "COURSE NAME", 
    COUNT(studentid) AS "NUMBER OF STUDENTS" 
    FROM institution 
    JOIN course 
    ON course.institution = institution.institutionid 
    JOIN student 
    ON student.course = course.courseid 
    GROUP BY course;













