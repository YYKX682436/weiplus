package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.i1 f149991d;

    public h1(com.tencent.mm.plugin.multitalk.model.i1 i1Var) {
        this.f149991d = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.StringBuilder] */
    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.model.i1 i1Var = this.f149991d;
        if (i1Var.f150000d.f150176s == sj3.e4.Talking) {
            sj3.d4 Zi = com.tencent.mm.plugin.multitalk.model.e3.Zi();
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = i1Var.f150000d;
            int i17 = v0Var.f150181x;
            sj3.q3 q3Var = Zi.f408475d;
            if (q3Var != null) {
                java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60)}, 2));
                kotlin.jvm.internal.o.f(format, "format(...)");
                q3Var.l(format);
            }
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            i4Var.getClass();
            byte[] bArr = new byte[4];
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.SetAppCmd(54, bArr, 1);
            int i18 = 0;
            if (bArr[0] > 0) {
                i4Var.f149648t++;
                if (v0Var.C != null) {
                    if (!v0Var.f150171p && gq4.v.Ni()) {
                        v0Var.f150171p = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onNetWorkChangeToMobileNet");
                        com.tencent.mm.plugin.multitalk.model.z zVar = v0Var.C;
                        if (zVar != null) {
                            zVar.p();
                        }
                    }
                    v0Var.getClass();
                    if (gq4.v.Ni()) {
                        v0Var.f150171p = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onNetWorkCostMax");
                        com.tencent.mm.plugin.multitalk.model.z zVar2 = v0Var.C;
                        if (zVar2 != null) {
                            zVar2.k();
                        }
                    }
                }
            }
            com.tencent.mm.plugin.multitalk.model.z zVar3 = v0Var.C;
            if (zVar3 != null) {
                zVar3.Z3();
            }
            int l17 = wh.m.l(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
            byte[] array = allocate.order(byteOrder).putInt(l17).array();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(85, array, array.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "batTemp = " + l17);
            int i19 = wh.m.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
            byte[] array2 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(i19).array();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(86, array2, array2.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "batQuan = " + i19);
            android.os.PowerManager powerManager = (android.os.PowerManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("power");
            ?? isPowerSaveMode = powerManager != null ? powerManager.isPowerSaveMode() : 0;
            byte[] array3 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(isPowerSaveMode).array();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(87, array3, array3.length);
            com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "lowBat = " + isPowerSaveMode);
            byte[] array4 = java.nio.ByteBuffer.allocate(4).order(byteOrder).putInt(ph.t.k().c().d() ? 1 : 0).array();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(96, array4, array4.length);
            int[] p17 = wh.m.p();
            int[] c17 = wo.r.c();
            float d17 = 1.0f / wo.t.d();
            if (p17.length > 0 && c17.length > 0) {
                float f17 = 0.0f;
                while (i18 < p17.length) {
                    try {
                        f17 += ((100.0f * d17) * p17[i18]) / c17[i18];
                    } catch (java.lang.Exception unused) {
                    }
                    i18++;
                }
                i18 = (int) f17;
            }
            byte[] array5 = java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i18).array();
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            int length = array5.length;
            i4Var2.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(91, array5, length);
        }
    }
}
