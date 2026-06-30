package ft1;

/* loaded from: classes8.dex */
public abstract class k {
    public static final java.lang.String a(r45.mx6 mx6Var) {
        kotlin.jvm.internal.o.g(mx6Var, "<this>");
        return "direction:" + mx6Var.f380900d + " msgid:" + mx6Var.f380901e + " create_time:" + mx6Var.f380903g + " content:" + mx6Var.f380902f;
    }

    public static final java.lang.String b(r45.yx6 yx6Var) {
        kotlin.jvm.internal.o.g(yx6Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("status: ");
        sb6.append(yx6Var.f391482e);
        sb6.append(", version: ");
        sb6.append(yx6Var.f391484g);
        sb6.append(" VerifyMsg: ");
        sb6.append(yx6Var.f391483f.size());
        sb6.append(", username: ");
        sb6.append(yx6Var.f391481d);
        sb6.append(", lastRecvMsg:");
        r45.mx6 mx6Var = yx6Var.f391485h;
        sb6.append(mx6Var != null ? a(mx6Var) : null);
        return sb6.toString();
    }
}
