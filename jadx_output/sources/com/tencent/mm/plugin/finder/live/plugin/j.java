package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f113038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f113040f;

    public j(android.view.View view, java.lang.String str, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f113038d = view;
        this.f113039e = str;
        this.f113040f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f113038d;
        int i17 = pm0.v.r(view).bottom;
        com.tencent.mars.xlog.Log.i("notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f113039e + ", bottom = " + i17 + ") view: " + view);
        ((mm2.x4) this.f113040f.P0(mm2.x4.class)).B.setValue(java.lang.Integer.valueOf(i17));
    }
}
