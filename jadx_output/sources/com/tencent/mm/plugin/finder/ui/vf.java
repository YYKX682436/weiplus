package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129958d;

    public vf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129958d = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129958d;
        android.view.View view = finderSelectCoverUI.f128677t;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentLayout");
            throw null;
        }
        int measuredHeight = (view.getMeasuredHeight() - finderSelectCoverUI.F1) / 2;
        android.view.View view2 = finderSelectCoverUI.C;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("cropTopView");
            throw null;
        }
        view2.getLayoutParams().height = measuredHeight;
        android.view.View view3 = finderSelectCoverUI.D;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("cropBottomView");
            throw null;
        }
        view3.getLayoutParams().height = measuredHeight;
        android.view.View view4 = finderSelectCoverUI.f128677t;
        if (view4 != null) {
            view4.requestLayout();
        } else {
            kotlin.jvm.internal.o.o("contentLayout");
            throw null;
        }
    }
}
