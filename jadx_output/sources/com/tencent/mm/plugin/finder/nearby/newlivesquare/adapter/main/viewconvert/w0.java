package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes10.dex */
public final class w0 implements pv.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.n f121994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f121995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1 f121996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f121997d;

    public w0(vp2.n nVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1 a1Var, android.widget.ImageView imageView) {
        this.f121994a = nVar;
        this.f121995b = h0Var;
        this.f121996c = a1Var;
        this.f121997d = imageView;
    }

    public final void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#bind nickName=");
        vp2.n nVar = this.f121994a;
        sb6.append(nVar.getFeedObject().getNickName());
        sb6.append(" load with url onProcessBitmap: color=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.HeadLivingConvert", sb6.toString());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ((java.util.HashMap) com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1.f121564h).put(this.f121995b.f310123d, valueOf);
        this.f121996c.n(i17, this.f121997d, nVar);
    }
}
