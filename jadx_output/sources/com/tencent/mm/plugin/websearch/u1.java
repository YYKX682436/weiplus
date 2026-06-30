package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class u1 implements zy2.ub {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f181629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.websearch.SearchResultTLPlayerInfo f181630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.TextureRegistry.SurfaceTextureEntry f181631f;

    public u1(java.lang.ref.WeakReference weakReference, com.tencent.pigeon.websearch.SearchResultTLPlayerInfo searchResultTLPlayerInfo, io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f181629d = weakReference;
        this.f181630e = searchResultTLPlayerInfo;
        this.f181631f = surfaceTextureEntry;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("QZeroDemo", "onVideoEnded from native");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.j1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.d1(this.f181629d, this.f181630e, str2, i17, i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.z0(this.f181629d, this.f181630e, str2, str3, i17, i18));
        this.f181631f.release();
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.r1(this.f181629d, this.f181630e, str2, bool));
    }

    @Override // zy2.ub
    public void e3(int i17, int i18) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.f1(this.f181629d, this.f181630e, i17, i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.n1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.p1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.t1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.h1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.l1(this.f181629d, this.f181630e, str2));
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.websearch.b1(this.f181629d, this.f181630e, str2, i17, i18, i19));
    }
}
