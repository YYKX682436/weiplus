package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fa0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ga0 f112532d;

    public fa0(com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var) {
        this.f112532d = ga0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = this.f112532d;
        android.content.Context context = ga0Var.f365323d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        ga0Var.t1(activity != null ? activity.getIntent() : null);
    }
}
