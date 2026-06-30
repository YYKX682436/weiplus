package ub5;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final ub5.u f426254a = new ub5.u();

    static {
        kz5.p1.f(3, 6, 22, 23, 30, 41, 26, 40, 27, 42, 28, 5);
        kz5.p1.f(2000, java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ub5.k r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 2111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub5.u.a(ub5.k, java.util.List):void");
    }

    public final boolean b() {
        qg5.z2 z2Var = (qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class));
        z2Var.getClass();
        if (!jm0.g.class.isAssignableFrom(qg5.u3.class)) {
            throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(z2Var.getViewModel(), new jm0.e(z2Var)).a(qg5.u3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        qg5.u3 u3Var = (qg5.u3) ((jm0.g) a17);
        boolean bj6 = z2Var.bj();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.yuanbao.RepairerConfigYuanBaoMultipleEntrances());
        boolean z17 = false;
        boolean z18 = c17 == 1 || c17 == 3;
        xj.m Ui = ((wj.j0) ((xj.i) ((jz5.n) u3Var.f363212h).getValue())).Ui(wj.t0.f446513v);
        if (z18 && bj6 && Ui != null) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "isShowButton: " + z17 + ", multiSelectCopyConfigEnabled: " + z18 + ", isMainlandHkMoUser: " + bj6 + ", adInfo: " + Ui);
        }
        return z17;
    }
}
