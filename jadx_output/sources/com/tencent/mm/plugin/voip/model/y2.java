package com.tencent.mm.plugin.voip.model;

/* loaded from: classes12.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176926d;

    public y2(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176926d = d3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.nio.ByteBuffer] */
    @Override // java.lang.Runnable
    public void run() {
        int a17;
        this.f176926d.getClass();
        com.tencent.mm.plugin.voip.model.d3.G = (!fp.e0.e() || (a17 = (int) pj.h.a()) == -1) ? wh.m.l(com.tencent.mm.sdk.platformtools.x2.f193071a) : a17 * 10;
        byte[] array = java.nio.ByteBuffer.allocate(4).putInt(com.tencent.mm.plugin.voip.model.d3.G).array();
        this.f176926d.f176411a.f176532x.setJNIAppCmd(3, array, array.length);
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176926d.f176411a.f176532x;
        int i17 = com.tencent.mm.plugin.voip.model.d3.G;
        v2protocalVar.f176887t0 = i17;
        if (i17 <= 350) {
            v2protocalVar.f176896w0++;
        } else if (i17 <= 380) {
            v2protocalVar.f176899x0++;
        } else if (i17 <= 420) {
            v2protocalVar.f176902y0++;
        } else {
            v2protocalVar.f176905z0++;
        }
        com.tencent.mm.plugin.voip.model.d3.H = wh.m.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
        ph.c c17 = ph.t.k().c();
        if (com.tencent.mm.plugin.voip.model.d3.H > 0) {
            byte[] array2 = java.nio.ByteBuffer.allocate(4).putInt(com.tencent.mm.plugin.voip.model.d3.H).array();
            this.f176926d.f176411a.f176532x.setJNIAppCmd(7, array2, array2.length);
        }
        int i18 = 0;
        if (c17.d()) {
            com.tencent.mm.plugin.voip.model.d3.I = 1;
        } else {
            com.tencent.mm.plugin.voip.model.d3.I = 0;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176926d.f176411a.f176532x;
        v2protocalVar2.G0 = com.tencent.mm.plugin.voip.model.d3.I;
        v2protocalVar2.E0 = com.tencent.mm.plugin.voip.model.d3.H;
        byte[] array3 = java.nio.ByteBuffer.allocate(4).putInt(com.tencent.mm.plugin.voip.model.d3.I).array();
        this.f176926d.f176411a.f176532x.setJNIAppCmd(10, array3, array3.length);
        android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
        ?? isPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : 0;
        this.f176926d.f176411a.f176532x.I0 = isPowerSaveMode;
        byte[] array4 = java.nio.ByteBuffer.allocate(4).putInt(isPowerSaveMode).array();
        this.f176926d.f176411a.f176532x.setJNIAppCmd(8, array4, array4.length);
        if (ih.d.c()) {
            com.tencent.mm.plugin.voip.model.d3 d3Var = this.f176926d;
            if (d3Var.f176428r != null) {
                if (d3Var.f176429s == 1) {
                    synchronized (d3Var.f176427q) {
                        this.f176926d.f176426p.l();
                        this.f176926d.f176430t = 1;
                    }
                }
                com.tencent.mm.plugin.voip.model.d3 d3Var2 = this.f176926d;
                if (d3Var2.f176429s == 0) {
                    d3Var2.f176426p.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.class);
                    synchronized (this.f176926d.f176427q) {
                        if (this.f176926d.f176426p.E()) {
                            this.f176926d.f176426p.a();
                        }
                        this.f176926d.f176426p.b();
                        this.f176926d.f176426p.I();
                        this.f176926d.f176429s = 1;
                    }
                }
                com.tencent.mm.plugin.voip.model.d3 d3Var3 = this.f176926d;
                if (d3Var3.f176429s == 1 && d3Var3.f176430t == 1) {
                    d3Var3.f176429s = 0;
                    d3Var3.f176430t = 0;
                    rh.c1 c1Var = d3Var3.f176426p;
                    if (c1Var.f395330l != null && (i18 = c1Var.s()) >= 0) {
                        byte[] array5 = java.nio.ByteBuffer.allocate(4).putInt(i18).array();
                        this.f176926d.f176411a.f176532x.setJNIAppCmd(4, array5, array5.length);
                    }
                }
            }
        }
        if (i18 > 0) {
            this.f176926d.f176411a.f176532x.A0 = i18;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = this.f176926d.f176411a.f176532x;
        if (v2protocalVar3.f176890u0 == -1) {
            v2protocalVar3.f176890u0 = com.tencent.mm.plugin.voip.model.d3.G;
        }
        if (v2protocalVar3.B0 == 0) {
            v2protocalVar3.B0 = v2protocalVar3.A0;
        }
        if (v2protocalVar3.D0 == 0) {
            v2protocalVar3.D0 = com.tencent.mm.plugin.voip.model.d3.H;
        }
        if (v2protocalVar3.F0 == -1) {
            v2protocalVar3.F0 = com.tencent.mm.plugin.voip.model.d3.I;
        }
        if (v2protocalVar3.H0 == -1) {
            v2protocalVar3.H0 = isPowerSaveMode;
        }
        int i19 = com.tencent.mm.plugin.voip.model.d3.G;
        if (i19 > v2protocalVar3.f176893v0) {
            v2protocalVar3.f176893v0 = i19;
        }
        if (i18 > v2protocalVar3.C0) {
            v2protocalVar3.C0 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipServiceEx", "battery temp %d, cpuLoad %d, batteryQuantity %d, islowpowermode %d, batteryCharge %d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(com.tencent.mm.plugin.voip.model.d3.H), java.lang.Integer.valueOf((int) isPowerSaveMode), java.lang.Integer.valueOf(com.tencent.mm.plugin.voip.model.d3.I));
    }
}
