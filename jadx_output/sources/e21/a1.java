package e21;

/* loaded from: classes11.dex */
public abstract class a1 {
    public static final java.lang.String a(xg3.q0 q0Var) {
        kotlin.jvm.internal.o.g(q0Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Op[id=");
        sb6.append(q0Var.f454423b);
        sb6.append(" cmdId=");
        sb6.append(q0Var.b());
        sb6.append(" insertTime=");
        sb6.append(q0Var.f454424c);
        sb6.append(" rev1=");
        sb6.append(q0Var.f454427f);
        sb6.append(" rev3=");
        sb6.append(q0Var.f454429h);
        sb6.append(" len=");
        byte[] a17 = q0Var.a();
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.length) : null);
        sb6.append(']');
        return sb6.toString();
    }

    public static final kotlinx.coroutines.flow.n2 b(xg3.o0 o0Var) {
        kotlin.jvm.internal.o.g(o0Var, "<this>");
        if (!(o0Var instanceof e21.z0)) {
            return null;
        }
        return e21.z0.f246613o;
    }
}
