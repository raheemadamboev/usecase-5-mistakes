# usecase-5-mistakes

This is top 5 Clean Architecture usecase mistakes that we must avoid.

1. The UseCase should have only single responsibility and one public function. [Link](https://github.com/raheemadamboev/usecase-5-mistakes/blob/main/app/src/main/java/xyz/teamgravity/usecase5mistakes/Mistake1.kt)

2. The UseCase should contain only business logic. It should not contain any other logics such as presentation logic. [Link](https://github.com/raheemadamboev/usecase-5-mistakes/blob/main/app/src/main/java/xyz/teamgravity/usecase5mistakes/Mistake2.kt)

3. The UseCase lives in Domain layer, so it should only contain pure language packages. The UseCase should not contain any third-party or framework related packages. [Link](https://github.com/raheemadamboev/usecase-5-mistakes/blob/main/app/src/main/java/xyz/teamgravity/usecase5mistakes/Mistake3.kt)

4. Abstraction is necessary when we intend to implement multiple versions of it. [Link](https://github.com/raheemadamboev/usecase-5-mistakes/blob/main/app/src/main/java/xyz/teamgravity/usecase5mistakes/Mistake4.kt)

5. Deciding what error message to display is responsibility of Presentation layer. [Link](https://github.com/raheemadamboev/usecase-5-mistakes/blob/main/app/src/main/java/xyz/teamgravity/usecase5mistakes/Mistake5.kt)
