package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class w0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f145924d;

    public w0(com.tencent.mm.plugin.luckymoney.story.b1 b1Var) {
        this.f145924d = new java.lang.ref.WeakReference(b1Var);
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145924d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f145833m.f(str, j17, j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        if (hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "download finish: %s", str);
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.b().putInt(str, 1);
        }
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145924d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f145833m.o(str, i17);
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145924d.get();
        if (b1Var == null) {
            return;
        }
        b1Var.f145833m.onDataAvailable(str, j17, j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) this.f145924d.get();
        if (b1Var == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.story.v0(this, b1Var, str, j17, j18, videoInfo));
    }
}
