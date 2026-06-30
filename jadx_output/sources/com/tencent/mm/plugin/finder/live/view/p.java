package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116571f;

    public p(android.view.View view, java.lang.String str, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116569d = view;
        this.f116570e = str;
        this.f116571f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = pm0.v.r(this.f116569d).bottom;
        com.tencent.mars.xlog.Log.i("BasePluginLayout_notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f116570e + ", bottom = " + i17);
        ((mm2.x4) this.f116571f.business(mm2.x4.class)).B.setValue(java.lang.Integer.valueOf(i17));
    }
}
