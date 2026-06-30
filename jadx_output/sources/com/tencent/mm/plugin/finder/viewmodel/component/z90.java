package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z90 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.da f136672d;

    public z90(cw2.da daVar) {
        this.f136672d = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewParent parentView = this.f136672d.getParentView();
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = parentView instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) parentView : null;
        if (finderVideoLayout != null) {
            finderVideoLayout.getRetryBtn().performClick();
        }
    }
}
