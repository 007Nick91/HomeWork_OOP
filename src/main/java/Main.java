public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Петр";
        post.patronymic = "Петрович";
        post.surename = "Петров";
        post.passport = "4444№55566677";
        post.phone = "+79997776655";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;




}

}
