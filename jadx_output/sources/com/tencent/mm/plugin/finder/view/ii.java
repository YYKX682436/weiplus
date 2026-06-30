package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class ii implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderProgressBar f132307d;

    public ii(com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar) {
        this.f132307d = finderProgressBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar = this.f132307d;
        finderProgressBar.setAlpha(0.0f);
        finderProgressBar.setVisibility(0);
        finderProgressBar.f131438d = true;
    }
}
