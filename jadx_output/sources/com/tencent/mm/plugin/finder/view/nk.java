package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class nk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f132719d;

    public nk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        this.f132719d = finderSnsHeaderView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f132719d;
        finderSnsHeaderView.getClearBtn().getHitRect(rect);
        rect.inset(rect.width() * (-2), -rect.width());
        java.lang.Object parent = finderSnsHeaderView.getClearBtn().getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) parent).setTouchDelegate(new android.view.TouchDelegate(rect, finderSnsHeaderView.getClearBtn()));
    }
}
