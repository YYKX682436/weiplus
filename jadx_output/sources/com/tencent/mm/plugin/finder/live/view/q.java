package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116594e;

    public q(java.lang.String str, com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        this.f116593d = str;
        this.f116594e = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("BasePluginLayout_notify2ChangeCommentHeight", "[notify2CHangeCommentHeight] tag = " + this.f116593d + ", post null");
        ((mm2.x4) this.f116594e.business(mm2.x4.class)).B.postValue(null);
    }
}
