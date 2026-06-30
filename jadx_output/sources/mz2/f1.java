package mz2;

/* loaded from: classes9.dex */
public class f1 implements pz2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mz2.g1 f333120a;

    public f1(mz2.g1 g1Var) {
        this.f333120a = g1Var;
    }

    @Override // pz2.c
    public void a(int i17, int i18, int i19, int i27) {
        mz2.g1 g1Var = this.f333120a;
        if (g1Var.f333124f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "hy: event already end. ignore");
            return;
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_SUCCESS");
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "onSuccess()");
            g1Var.f333124f = true;
            ((pz2.a) gm0.j1.s(pz2.a.class)).O(g1Var.f333123e, i18);
            if (g1Var.f333124f) {
                g1Var.f333123e = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onSuccess()");
            g1Var.f();
            return;
        }
        if (i17 != 2007) {
            if (i17 == 2009) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", java.lang.Integer.valueOf(i17));
                com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = g1Var.f333123e;
                if (openFingerPrintAuthEvent != null) {
                    openFingerPrintAuthEvent.f54595g.getClass();
                    re4.n.a(3, 0);
                }
                g1Var.f333124f = true;
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
                g1Var.f();
                g1Var.b(i17, string);
                return;
            }
            if (i17 != 10308 && i17 != 2004 && i17 != 2005) {
                switch (i17) {
                    case 2000:
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify timeout");
                        return;
                    case 2001:
                        g1Var.c(false);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_TIMEOUT");
                        return;
                    case 2002:
                        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: identify FingerPrintConst.RESULT_NO_MATCH");
                        g1Var.f333124f = false;
                        g1Var.f();
                        g1Var.c(true);
                        g1Var.b(1, "");
                        return;
                    default:
                        return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "hy: on error: %d", java.lang.Integer.valueOf(i17));
        g1Var.f333124f = true;
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiv);
        if (i17 == 10308) {
            string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiw);
        } else if (i17 == 2007) {
            com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent2 = g1Var.f333123e;
            if (openFingerPrintAuthEvent2 != null) {
                int i28 = openFingerPrintAuthEvent2.f54595g.f7564b;
            }
            mz2.d2.IML.f333113f = true;
        } else if (i17 == 2005) {
            string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jiz);
            com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent3 = g1Var.f333123e;
            if (openFingerPrintAuthEvent3 != null) {
                int i29 = openFingerPrintAuthEvent3.f54595g.f7564b;
            }
        }
        g1Var.f();
        g1Var.b(2, string2);
    }
}
