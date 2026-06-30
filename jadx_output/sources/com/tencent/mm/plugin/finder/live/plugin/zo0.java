package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class zo0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f115370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.l f115371f;

    public zo0(android.view.View view, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, com.tencent.mm.plugin.finder.live.plugin.l lVar) {
        this.f115369d = view;
        this.f115370e = ep0Var;
        this.f115371f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f115369d;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f484816fm5);
        if (findViewById == null) {
            return;
        }
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.live.plugin.yo0(findViewById, this.f115370e, view, this.f115371f));
    }
}
