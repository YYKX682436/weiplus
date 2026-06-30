package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class u6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI f129904d;

    public u6(com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI finderHomeAnimUI) {
        this.f129904d = finderHomeAnimUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishFallbackTimerTask, isFinishing:");
        com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI finderHomeAnimUI = this.f129904d;
        sb6.append(finderHomeAnimUI.isFinishing());
        com.tencent.mars.xlog.Log.i("FinderHomeAnimUI", sb6.toString());
        if (finderHomeAnimUI.isFinishing()) {
            return;
        }
        finderHomeAnimUI.finish();
    }
}
