package rk4;

/* loaded from: classes11.dex */
public abstract class k5 {
    public static final qk.ia a(jm4.g3 g3Var) {
        kotlin.jvm.internal.o.g(g3Var, "<this>");
        return qk.ia.f364169e.a(((jm4.h3) g3Var).i());
    }

    public static final bw5.lp0 b(jm4.g3 g3Var) {
        kotlin.jvm.internal.o.g(g3Var, "<this>");
        bw5.lp0 lp0Var = new bw5.lp0();
        byte[] UR_A3CD = urgen.ur_0025.UR_C8FE.UR_A3CD(((jm4.h3) g3Var).getCppPointer());
        if (UR_A3CD.length == 0) {
            d("playingItem is empty", "TingKt");
            return null;
        }
        try {
            lp0Var.parseFrom(UR_A3CD);
            return lp0Var;
        } catch (java.lang.Exception e17) {
            d(e17.toString(), null);
            return null;
        }
    }

    public static final void c(java.lang.String msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(msg, "msg");
        if (str == null) {
            return;
        }
        ".".concat(str);
    }

    public static final void d(java.lang.String msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.Ting");
        sb6.append(str == null ? "" : ".".concat(str));
        com.tencent.mars.xlog.Log.e(sb6.toString(), msg);
    }

    public static final void e(java.lang.String msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MicroMsg.Ting");
        sb6.append(str == null ? "" : ".".concat(str));
        com.tencent.mars.xlog.Log.i(sb6.toString(), msg);
    }

    public static final int f(int i17) {
        switch (i17) {
            case 1:
            case 7:
                return 11;
            case 2:
                return 9;
            case 3:
            case 8:
                return 0;
            case 4:
                return 7;
            case 5:
                return 3;
            case 6:
                return 1;
            case 9:
                return 12;
            case 10:
                return 8;
            case 11:
                return 2;
            case 12:
                return 4;
            case 13:
                return 10;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r3 != 4) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final b21.r g(bw5.lp0 r7) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.k5.g(bw5.lp0):b21.r");
    }
}
