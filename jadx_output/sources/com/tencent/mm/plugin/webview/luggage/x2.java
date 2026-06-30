package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class x2 extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Set f182682y;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182683v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f182684w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f182685x;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f182682y = hashSet;
        hashSet.add(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hashSet.add("webpageTitle");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
    }

    public x2(dp1.x xVar, com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        super(xVar);
        this.f182683v = e0Var;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent:%s", java.lang.Integer.valueOf(this.f182683v.hashCode()));
        this.f93246u = false;
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void Z(java.lang.String str) {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(ballInfo.f93063x) || this.f93132d.f93063x.startsWith("http://") || this.f93132d.f93063x.startsWith("https://") || com.tencent.mm.sdk.platformtools.t8.K0(str) || !(str.startsWith("http://") || str.startsWith("https://"))) {
            super.Z(str);
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        t().f93086f = 8;
        t().f93085e = 32;
        g();
        dp1.x xVar = this.f93239n;
        if (xVar.getIntent() != null && this.f93132d.G != null) {
            qp1.m.c(xVar.getIntent(), this.f93132d.G, f182682y);
            g();
        }
        this.f182684w = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f182685x)) {
            return;
        }
        t0(this.f182685x);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public boolean m0(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onClose :%s", java.lang.Integer.valueOf(this.f182683v.hashCode()));
        return super.m0(i17);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return this.f182683v.x();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void o0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onDestroy :%s", java.lang.Integer.valueOf(this.f182683v.hashCode()));
        super.o0();
    }

    public void t0(java.lang.String str) {
        this.f182685x = str;
        if (this.f182684w) {
            t().f93087g = str;
            g();
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return this.f182683v.x() && this.f93239n.t();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onEnterPage :%s", java.lang.Integer.valueOf(this.f182683v.hashCode()));
        super.x();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebViewFloatBallHelper", "onExitPage :%s", java.lang.Integer.valueOf(this.f182683v.hashCode()));
        super.z();
    }
}
