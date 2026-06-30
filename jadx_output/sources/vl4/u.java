package vl4;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final vl4.u f437904a = new vl4.u();

    public final jm4.n2 a() {
        jm4.u2 a17 = jm4.w2.f300435d.a();
        if (a17 == null) {
            return null;
        }
        return ((jm4.w2) a17).d(bw5.eq0.TingChatRoom);
    }

    public final boolean b(jm4.n2 n2Var) {
        jm4.g3 f17;
        if (n2Var == null) {
            n2Var = a();
        }
        jm4.d1 p17 = (n2Var == null || (f17 = ((jm4.p2) n2Var).f()) == null) ? null : ((jm4.h3) f17).p();
        bw5.o50 a17 = p17 != null ? ((jm4.e1) p17).a() : null;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TingChatRoomUtil", "gotoTingChatRoom: chatRoomCategoryId is null");
            pm0.v.X(vl4.t.f437903d);
            return false;
        }
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i(a17.c());
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qk.f9.a(aj6, context, o50Var, null, false, null, 28, null);
        return true;
    }

    public final boolean c(jm4.n2 n2Var) {
        jm4.z2 z2Var;
        jm4.k3 k3Var;
        if (n2Var == null) {
            return false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        jm4.g3 f17 = ((jm4.p2) n2Var).f();
        java.lang.String str = null;
        if (f17 != null && (z2Var = (jm4.z2) urgen.ur_0025.UR_C8FE.UR_97F8(((jm4.h3) f17).getCppPointer())) != null && (k3Var = (jm4.k3) urgen.ur_0025.UR_2801.UR_9AFC(((jm4.a3) z2Var).getCppPointer())) != null) {
            byte[] UR_14AE = urgen.ur_0025.UR_65C4.UR_14AE(((jm4.m3) k3Var).getCppPointer());
            bw5.p90 p90Var = UR_14AE != null ? (bw5.p90) jm4.r5.b(UR_14AE, new bw5.p90()) : null;
            if (p90Var != null) {
                bw5.mc0 mc0Var = p90Var.A[9] ? p90Var.f31515o : new bw5.mc0();
                if (mc0Var != null) {
                    str = mc0Var.getUsername();
                }
            }
        }
        return kotlin.jvm.internal.o.b(str, e17);
    }
}
