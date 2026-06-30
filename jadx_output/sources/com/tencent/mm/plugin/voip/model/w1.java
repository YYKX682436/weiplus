package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class w1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.a2 f176910d;

    public w1(com.tencent.mm.plugin.voip.model.a2 a2Var) {
        this.f176910d = a2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.voip.model.z1 z1Var;
        com.tencent.mm.plugin.voip.model.z1 z1Var2;
        com.tencent.mm.plugin.voip.model.z1 z1Var3;
        com.tencent.mm.plugin.voip.model.a2 a2Var = this.f176910d;
        if (!a2Var.f176329g) {
            return false;
        }
        byte[] bArr = new byte[4];
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = a2Var.f176324b;
        v2protocalVar.setAppCmd(54, bArr, 1);
        if (bArr[0] == 1) {
            if (a2Var.f176323a != 1) {
                com.tencent.mm.plugin.voip.model.v2protocal.f176817d2++;
            }
            com.tencent.mm.plugin.voip.model.v2protocal.f176819f2++;
            if (!a2Var.f176326d && gq4.v.Ni()) {
                a2Var.f176326d = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetStatusChecker", "onNetWorkChangeToMobileNet");
                java.lang.ref.WeakReference weakReference = a2Var.f176328f;
                if (weakReference != null && (z1Var3 = (com.tencent.mm.plugin.voip.model.z1) weakReference.get()) != null) {
                    z1Var3.p();
                }
            }
            if (gq4.v.Ni()) {
                a2Var.f176326d = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetStatusChecker", "onNetWorkCostMax");
                java.lang.ref.WeakReference weakReference2 = a2Var.f176328f;
                if (weakReference2 != null && (z1Var2 = (com.tencent.mm.plugin.voip.model.z1) weakReference2.get()) != null) {
                    z1Var2.k();
                }
            }
        }
        a2Var.f176323a = bArr[0];
        byte[] bArr2 = new byte[4];
        int[] iArr = {-1, -1};
        if (v2protocalVar.setAppCmd(10, bArr2, 4) >= 0) {
            int b17 = com.tencent.mm.sdk.platformtools.t8.b(bArr2);
            iArr[0] = b17;
            if (b17 >= 0 && b17 < 5) {
                iArr[1] = v2protocalVar.GetNetBottleneckSide();
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipNetStatusChecker", "netStatus: %d net_bottleneck_side %d", java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(iArr[1]));
            }
        }
        int i17 = iArr[0];
        if (i17 != -1) {
            int i18 = iArr[1];
            if (i17 < 5) {
                if (i18 != -1) {
                    if (i18 == 0) {
                        a2Var.b(true);
                    }
                    if (i18 == 1) {
                        a2Var.b(false);
                    }
                }
            } else if (a2Var.f176325c) {
                int i19 = a2Var.f176330h;
                if (i19 < 1) {
                    a2Var.f176330h = i19 + 1;
                } else {
                    a2Var.f176325c = false;
                    java.lang.ref.WeakReference weakReference3 = a2Var.f176328f;
                    if (weakReference3 != null && (z1Var = (com.tencent.mm.plugin.voip.model.z1) weakReference3.get()) != null) {
                        z1Var.b();
                    }
                }
            }
        }
        return true;
    }
}
