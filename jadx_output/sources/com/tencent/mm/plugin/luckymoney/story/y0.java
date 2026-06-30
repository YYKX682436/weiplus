package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class y0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.z0 f145934f;

    public y0(com.tencent.mm.plugin.luckymoney.story.z0 z0Var, java.lang.String str, java.lang.String str2) {
        this.f145934f = z0Var;
        this.f145932d = str;
        this.f145933e = str2;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            com.tencent.mm.vfs.w6.h(this.f145932d);
            com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145934f.f145937d.get();
            if (b1Var != null && b1Var.f145821a.equals(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EnvelopeStoryVideoManager", "download video fail: %s", this.f145933e);
                b1Var.f145838r.setVisibility(0);
                b1Var.f145838r.setOnClickListener(new com.tencent.mm.plugin.luckymoney.story.x0(this, b1Var));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19228, b1Var.f145823c, java.lang.Integer.valueOf(b1Var.f145833m.getVideoDurationSec()), 2, java.lang.Integer.valueOf(b1Var.f145829i), java.lang.Integer.valueOf(b1Var.f145833m.getRealPlayDurationSec()), java.lang.Integer.valueOf(b1Var.f145828h), 0, -9999);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
