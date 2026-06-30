package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class q2 implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.r2 f150082d;

    public q2(com.tencent.mm.plugin.multitalk.model.r2 r2Var) {
        this.f150082d = r2Var;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] data, android.hardware.Camera arg1) {
        int i17;
        int i18;
        boolean z17;
        int i19;
        java.lang.Boolean valueOf;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(arg1, "arg1");
        if (data.length <= 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(159L, 0L, 1L, false);
            g0Var.idkeyStat(159L, 3L, 1L, false);
            xq4.d dVar = this.f150082d.f150095i;
            if (dVar != null) {
                dVar.o();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.multitalk.model.r2 r2Var = this.f150082d;
        if (r2Var.f150092f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "onPreviewFrame mSize is null");
            return;
        }
        if (r2Var.f150095i != null) {
            byte[] bArr = r2Var.f150103q;
            if (bArr == null || bArr.length != data.length) {
                r2Var.f150103q = new byte[data.length];
            }
            java.lang.System.arraycopy(data, 0, r2Var.f150103q, 0, data.length);
            com.tencent.mm.plugin.multitalk.model.r2 r2Var2 = this.f150082d;
            if (r2Var2.f150087a) {
                i17 = xq4.e.f456116d;
                wo.e eVar = wo.v1.f447822b;
                if (eVar.f447665j) {
                    wo.d dVar2 = eVar.f447664i;
                    if (dVar2.f447646d != 0) {
                        i18 = dVar2.f447647e;
                        i19 = i18;
                        z17 = true;
                    }
                }
                z17 = false;
                i19 = 1;
            } else {
                i17 = xq4.e.f456117e;
                wo.e eVar2 = wo.v1.f447822b;
                if (eVar2.f447667l) {
                    wo.d dVar3 = eVar2.f447666k;
                    if (dVar3.f447646d != 0) {
                        i18 = dVar3.f447647e;
                        i19 = i18;
                        z17 = true;
                    }
                }
                z17 = false;
                i19 = 1;
            }
            int i27 = i17 > 0 ? 32 : 0;
            if (z17) {
                valueOf = java.lang.Boolean.FALSE;
            } else {
                valueOf = java.lang.Boolean.valueOf(i17 > 0);
            }
            r2Var2.f150088b = valueOf;
            wo.q1 q1Var = this.f150082d.f150092f;
            kotlin.jvm.internal.o.d(q1Var);
            int i28 = q1Var.f447790a;
            wo.q1 q1Var2 = this.f150082d.f150092f;
            kotlin.jvm.internal.o.d(q1Var2);
            int i29 = q1Var2.f447791b;
            if (z17) {
                this.f150082d.getClass();
                com.tencent.mm.plugin.multitalk.model.r2 r2Var3 = this.f150082d;
                if (r2Var3.f150097k == null) {
                    byte[] bArr2 = new byte[((i28 * i29) * 3) / 2];
                    r2Var3.f150097k = bArr2;
                    bArr2[0] = 90;
                }
                com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
                byte[] bArr3 = this.f150082d.f150103q;
                kotlin.jvm.internal.o.d(bArr3);
                int length = bArr3.length;
                com.tencent.mm.plugin.multitalk.model.r2 r2Var4 = this.f150082d;
                int i37 = r2Var4.f150093g;
                byte[] bArr4 = r2Var4.f150097k;
                kotlin.jvm.internal.o.d(bArr4);
                int length2 = bArr4.length;
                com.tencent.mm.plugin.voip.model.i1 i1Var = Bi.f176558a.f176411a.A;
                if (i1Var.f176648c != 3) {
                    com.tencent.mm.plugin.voip.model.g1 g1Var = i1Var.f176649d;
                    if (g1Var.f176532x.Q1 && g1Var.t()) {
                        g1Var.f176532x.videoRorate90D(bArr3, length, i28, i29, i37, bArr4, length2, i28, i29, i19);
                    }
                }
                xq4.d dVar4 = this.f150082d.f150095i;
                kotlin.jvm.internal.o.d(dVar4);
                byte[] bArr5 = this.f150082d.f150097k;
                kotlin.jvm.internal.o.d(bArr5);
                dVar4.v(bArr5, bArr5.length, i28, i29, this.f150082d.f150093g, i27, 0.0d);
            } else {
                xq4.d dVar5 = this.f150082d.f150095i;
                kotlin.jvm.internal.o.d(dVar5);
                byte[] bArr6 = this.f150082d.f150103q;
                kotlin.jvm.internal.o.d(bArr6);
                long length3 = bArr6.length;
                wo.q1 q1Var3 = this.f150082d.f150092f;
                kotlin.jvm.internal.o.d(q1Var3);
                int i38 = q1Var3.f447790a;
                wo.q1 q1Var4 = this.f150082d.f150092f;
                kotlin.jvm.internal.o.d(q1Var4);
                dVar5.v(bArr6, length3, i38, q1Var4.f447791b, this.f150082d.f150093g, i27, 0.0d);
            }
            r45.n27 n27Var = vq4.p0.f439374a;
            if (this.f150082d.f150090d == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.CaptureRender", "the camera is null and has been release");
            } else if (this.f150082d.f150090d != null) {
                wo.d1 d1Var = this.f150082d.f150090d;
                kotlin.jvm.internal.o.d(d1Var);
                d1Var.a(data);
            }
        }
    }
}
