package fo3;

/* loaded from: classes11.dex */
public abstract class l {
    public static java.lang.String a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (i17 == 1) {
            sb6.append("Register");
        } else if (i17 == 2) {
            sb6.append("Login");
        } else if (i17 == 3) {
            sb6.append("VerifyUser");
        } else if (i17 != 7) {
            sb6.append("Unknown");
        } else {
            sb6.append("PPK");
        }
        sb6.append("_");
        sb6.append(java.util.UUID.randomUUID().toString());
        return sb6.toString();
    }
}
