package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149363b;

    public l2(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI, int i17) {
        this.f149363b = sightCaptureUI;
        this.f149362a = i17;
    }

    public void a(byte[] bArr, int i17, int i18, int i19, int i27) {
        int i28;
        if (bArr == null || i17 < 0 || i18 < 0 || i19 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "onPictureYuvTaken, data is null!! current state: %d", java.lang.Integer.valueOf(this.f149363b.f149231g));
            com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149363b;
            sightCaptureUI.f149234l1 = false;
            if (sightCaptureUI.f149231g == 7) {
                sightCaptureUI.i7(this.f149362a);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "data frameWidth %s frameHeight %s rotate %s deviceDegree %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.U6(this.f149363b);
        this.f149363b.Z6();
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI2 = this.f149363b;
        sightCaptureUI2.P = i17;
        sightCaptureUI2.Q = i18;
        sightCaptureUI2.R = i19;
        sightCaptureUI2.S = i27;
        byte[] bArr2 = sightCaptureUI2.N;
        if (bArr2 != null) {
            ei3.x.f253187d.o(bArr2);
            this.f149363b.N = null;
        }
        this.f149363b.N = ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr.length));
        java.lang.System.arraycopy(bArr, 0, this.f149363b.N, 0, bArr.length);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI3 = this.f149363b;
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.mmsight.ui.j2 j2Var = new com.tencent.mm.plugin.mmsight.ui.j2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        sightCaptureUI3.f149250x1 = t0Var.k(j2Var, 0L);
        di3.x.b(true, ai3.d.n("TIME_RECODER_2_PLAY"));
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI4 = this.f149363b;
        if (sightCaptureUI4.f149239p0) {
            i28 = java.lang.Math.abs(i19 - i27) != 0 ? 0 : 180;
            bArr = ai3.d.w(bArr, i17, i18, i28 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
            this.f149363b.D.a(bArr, true, 0);
        } else {
            if (i27 == 180) {
                i19 += i27;
            }
            if (i19 > 360) {
                i19 += org.chromium.net.NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
            }
            i28 = i19;
            sightCaptureUI4.D.a(bArr, false, i28);
        }
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI5 = this.f149363b;
        sightCaptureUI5.T = bArr;
        sightCaptureUI5.U = i28;
        sightCaptureUI5.i7(3);
        this.f149363b.f149238p.post(new com.tencent.mm.plugin.mmsight.ui.k2(this));
        int i29 = this.f149363b.V.f148825o;
        if (i29 == 1 || i29 == 2 || i29 == 7) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13819, 1, java.lang.Integer.valueOf(this.f149363b.V.f148825o), this.f149363b.V.f148827q, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }
    }
}
