package yr2;

/* loaded from: classes10.dex */
public abstract class l {
    public static final int a(r45.vf2 vf2Var) {
        kotlin.jvm.internal.o.g(vf2Var, "<this>");
        if (r26.i0.p(vf2Var.getString(3), "h266", true)) {
            return 3;
        }
        return r26.i0.p(vf2Var.getString(3), "h265", true) ? 2 : 1;
    }

    public static final java.lang.String b(r45.vf2 vf2Var) {
        kotlin.jvm.internal.o.g(vf2Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Spec[");
        sb6.append(vf2Var.getString(0));
        sb6.append(' ');
        sb6.append(kotlin.jvm.internal.o.b(vf2Var.getString(3), "h266") ? "6" : kotlin.jvm.internal.o.b(vf2Var.getString(3), "h264") ? "4" : "5");
        sb6.append("  ");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.f0(vf2Var.getInteger(1)));
        sb6.append(' ');
        sb6.append(vf2Var.getInteger(2));
        sb6.append("  ");
        sb6.append(vf2Var.getInteger(13));
        sb6.append(']');
        return sb6.toString();
    }

    public static final java.lang.String c(r45.vf2 vf2Var) {
        kotlin.jvm.internal.o.g(vf2Var, "<this>");
        return "Spec[" + vf2Var.getString(0) + ' ' + vf2Var.getString(3) + ' ' + com.tencent.mm.sdk.platformtools.t8.f0(vf2Var.getInteger(1)) + ' ' + vf2Var.getInteger(2) + ' ' + vf2Var.getInteger(6) + ' ' + vf2Var.getInteger(7) + ' ' + vf2Var.getInteger(13) + ']';
    }
}
