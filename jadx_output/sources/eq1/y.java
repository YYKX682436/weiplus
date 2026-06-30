package eq1;

/* loaded from: classes11.dex */
public abstract class y {
    public static final com.tencent.wechat.mm.biz.s2 a(com.tencent.wechat.mm.biz.f1 f1Var) {
        com.tencent.wechat.mm.biz.t5 b17;
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        com.tencent.wechat.mm.biz.i1 b18 = f1Var.b();
        if (b18 != null && (b17 = b18.b()) != null) {
            com.tencent.wechat.mm.biz.j3 j3Var = b17.f218664w[62] ? b17.f218662u : new com.tencent.wechat.mm.biz.j3();
            if (j3Var != null) {
                com.tencent.wechat.mm.biz.t2 t2Var = j3Var.f218228e[1] ? j3Var.f218227d : new com.tencent.wechat.mm.biz.t2();
                if (t2Var != null) {
                    return t2Var.f218638e[1] ? t2Var.f218637d : new com.tencent.wechat.mm.biz.s2();
                }
            }
        }
        return null;
    }

    public static final java.lang.String b(com.tencent.wechat.mm.biz.f1 f1Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        if (h(f1Var)) {
            com.tencent.wechat.mm.biz.l2 d17 = d(f1Var);
            if (d17 == null) {
                return null;
            }
            if (d17.T[10]) {
                str = d17.f218288p;
                return str;
            }
            return "";
        }
        if (f(f1Var)) {
            com.tencent.wechat.mm.biz.s2 a17 = a(f1Var);
            if (a17 == null) {
                return null;
            }
            if (a17.B[7]) {
                str = a17.f218601m;
                return str;
            }
        }
        return "";
    }

    public static final int c(com.tencent.wechat.mm.biz.f1 f1Var) {
        int i17;
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        if (g(f1Var)) {
            return 0;
        }
        if (!h(f1Var)) {
            if (f(f1Var)) {
                return 5;
            }
            if (e(f1Var)) {
                return 4;
            }
            return i(f1Var) ? 11 : 0;
        }
        com.tencent.wechat.mm.biz.l2 d17 = d(f1Var);
        if (d17 == null || (i17 = d17.f218284i) == 0 || i17 == 3 || i17 == 5) {
            return 1;
        }
        switch (i17) {
            case 101:
            case 102:
            case 104:
            case 105:
                return 3;
            case 103:
                return 7;
            default:
                return 1;
        }
    }

    public static final com.tencent.wechat.mm.biz.l2 d(com.tencent.wechat.mm.biz.f1 f1Var) {
        com.tencent.wechat.mm.biz.t5 b17;
        com.tencent.wechat.mm.biz.u4 b18;
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        com.tencent.wechat.mm.biz.i1 b19 = f1Var.b();
        if (b19 != null && (b17 = b19.b()) != null && (b18 = b17.b()) != null) {
            com.tencent.wechat.mm.biz.r2 r2Var = b18.f218687e[1] ? b18.f218686d : new com.tencent.wechat.mm.biz.r2();
            if (r2Var != null) {
                return r2Var.f218520e[1] ? r2Var.f218519d : new com.tencent.wechat.mm.biz.l2();
            }
        }
        return null;
    }

    public static final boolean e(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return f1Var.f218011m == 4;
    }

    public static final boolean f(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return f1Var.f218011m == 3;
    }

    public static final boolean g(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return f1Var.f218011m == 0;
    }

    public static final boolean h(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return f1Var.f218011m == 2;
    }

    public static final boolean i(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return f1Var.f218011m == 7;
    }

    public static final boolean j(com.tencent.wechat.mm.biz.f1 f1Var) {
        kotlin.jvm.internal.o.g(f1Var, "<this>");
        return h(f1Var) || e(f1Var) || f(f1Var) || i(f1Var);
    }
}
