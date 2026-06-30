package qe;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener {
    public a0(qe.f0 f0Var) {
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public int getNetworkType() {
        try {
            be1.y E = be1.z.E(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "networkType = %s", E.f19540d);
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "getStatisticsNetType ret:%d", java.lang.Integer.valueOf(com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a)));
            if (E == be1.y.None) {
                return -1;
            }
            if (E == be1.y.Mobile_2g) {
                return 2;
            }
            if (E == be1.y.Mobile_3g) {
                return 3;
            }
            if (E == be1.y.Mobile_4g) {
                return 4;
            }
            if (E == be1.y.Mobile_5g) {
                return 5;
            }
            return E == be1.y.Wifi ? 1 : 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.LockStepNativeInstallHelper", e17, "getStatisticsNetType_", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < iArr.length; i17++) {
            arrayList.add(new com.tencent.mars.smc.IDKey(iArr[i17], iArr2[i17], iArr3[i17]));
        }
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, false, false);
    }

    @Override // com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener
    public void onKvStat(int i17, java.lang.String str) {
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).b(i17, str);
    }
}
