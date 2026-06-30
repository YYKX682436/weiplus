package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class kl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.SwipeBackLayout f129445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.MMFinderUI f129446e;

    public kl(com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout, com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI) {
        this.f129445d = swipeBackLayout;
        this.f129446e = mMFinderUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = this.f129445d;
        swipeBackLayout.setNeedRequestActivityTranslucent(true);
        swipeBackLayout.d(false);
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = this.f129446e;
        if (mMFinderUI.V6()) {
            db5.f.b(mMFinderUI);
        }
    }
}
