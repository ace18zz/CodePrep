# CodePrep – Coding Interview Preparation Platform

**CodePrep** is a full-stack platform designed to help users prepare for coding interviews through structured question banks, interactive explanations, personalized tracking, and performance analytics. Built for both web and mobile, it offers a seamless experience to support long-term interview preparation.

---

## 🚀 Features

### 🧠 Question Bank
- Browse questions by tags, topics, or difficulty (Easy, Medium, Hard)
- View full question details with syntax-highlighted descriptions
- Mark questions as completed, bookmarked, or wrong

### ✍️ Solution Center
- Write, save, and edit solutions using Markdown
- Like and view public solutions shared by others
- Tag and organize your solutions for better recall

### 📊 Progress Dashboard
- Visual charts for solved/unsolved/mistake distributions
- Weekly activity trends
- Personal statistics including accuracy and streaks

### 👤 User Management
- Register/login using JWT-based authentication
- Update profile, reset password, upload avatar
- Track individual learning progress

### 📱 Mobile App (UniApp)
- Cross-platform mobile interface built with UniApp
- Shared API logic with web platform
- Persistent sessions and seamless data syncing

---

## 🛠️ Tech Stack

| Layer        | Technology Used                                  |
|--------------|--------------------------------------------------|
| Frontend     | Vue 3, Vite, Element Plus, Pinia, Axios          |
| Backend      | Spring Boot, MyBatis, RESTful APIs, JWT, Redis   |
| Database     | MySQL                                            |
| Mobile       | UniApp                                           |
| Visualization| ECharts                                          |
| Tools        | Git, HBuilderX, VSCode, Postman                  |

---

## 📁 Project Structure



CodePrep/
├── backend/                # Spring Boot backend service
├── frontend-web/           # Web client built with Vue 3 + Vite
├── frontend-mobile/        # Mobile app powered by UniApp
├── README.md
└── ...


## 🧪 Getting Started

### Backend Setup

1. Install Java (JDK 17+) and MySQL
2. Clone the repo and navigate to `backend/`
3. Configure your MySQL database in `application.yml`
4. Start the server:

```bash
cd backend
mvn spring-boot:run
````

### Web Frontend Setup

1. Navigate to `frontend-web/`
2. Install dependencies and run the dev server:

```bash
cd frontend-web
npm install
npm run dev
```

### Mobile App Setup (UniApp)

1. Open `frontend-mobile/` in [HBuilderX](https://www.dcloud.io/hbuilderx.html)
2. Compile or preview on your desired platform (Web, WeChat Mini Program, iOS/Android)

---

## 🔐 Authentication & Security

* JWT-based login system
* Token stored in localStorage for session persistence
* API routes protected via interceptor-based access control

---

## 📌 Deployment Notes

* **Frontend**: Can be deployed via Vercel, Netlify, or nginx
* **Backend**: Deployable on Heroku, Railway, or any cloud VM (Ubuntu + MySQL)
* **Database**: Ensure MySQL and Redis are properly secured and persistent
* **Mobile**: Build via UniApp CLI or HBuilderX, then publish to app stores or WeChat platform

---

## 🧩 Possible Future Enhancements

* AI-powered solution hints (LLM integration)
* Collaborative coding/mocking room
* Interview scheduler and calendar sync
* Import/export progress via CSV or API
* Full test coverage and CI/CD integration

---

## 👩‍💻 Author

**Ziting (Ash) Zhao**
[GitHub – @ace18zz](https://github.com/ace18zz)
📍 Birmingham, UK
🎓 MSc Computer Science, University of Bath

Feel free to reach out if you'd like to collaborate or discuss technical interview prep tools!

---

## 📄 License

This project is licensed under the MIT License.

