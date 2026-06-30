package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f130038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f130039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f130040f;

    public y3(boolean z17, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, int i17) {
        this.f130038d = z17;
        this.f130039e = finderCreateContactUI;
        this.f130040f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f130038d;
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f130039e;
        if (z17) {
            android.view.View view = finderCreateContactUI.f128543t;
            if (view == null) {
                kotlin.jvm.internal.o.o("scrollContainer");
                throw null;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getLayoutParams());
            layoutParams.height = finderCreateContactUI.X - this.f130040f;
            android.view.View view2 = finderCreateContactUI.f128543t;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("scrollContainer");
                throw null;
            }
            view2.setLayoutParams(layoutParams);
            android.view.View view3 = finderCreateContactUI.H;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("editTopSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(view3.getLayoutParams());
            layoutParams2.height = i65.a.h(finderCreateContactUI, com.tencent.mm.R.dimen.f479688cn);
            android.view.View view4 = finderCreateContactUI.H;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("editTopSpace");
                throw null;
            }
            view4.setLayoutParams(layoutParams2);
            android.view.View view5 = finderCreateContactUI.I;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("editMiddleSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(view5.getLayoutParams());
            layoutParams3.height = i65.a.h(finderCreateContactUI, com.tencent.mm.R.dimen.f479734dr);
            android.view.View view6 = finderCreateContactUI.I;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("editMiddleSpace");
                throw null;
            }
            view6.setLayoutParams(layoutParams3);
            android.view.View view7 = finderCreateContactUI.f128539J;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("editBottomSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(view7.getLayoutParams());
            layoutParams4.height = i65.a.h(finderCreateContactUI, com.tencent.mm.R.dimen.f479688cn);
            android.view.View view8 = finderCreateContactUI.f128539J;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams4);
                return;
            } else {
                kotlin.jvm.internal.o.o("editBottomSpace");
                throw null;
            }
        }
        android.view.View view9 = finderCreateContactUI.f128543t;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("scrollContainer");
            throw null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(view9.getLayoutParams());
        layoutParams5.height = -1;
        android.view.View view10 = finderCreateContactUI.f128543t;
        if (view10 == null) {
            kotlin.jvm.internal.o.o("scrollContainer");
            throw null;
        }
        view10.setLayoutParams(layoutParams5);
        android.view.View view11 = finderCreateContactUI.H;
        if (view11 == null) {
            kotlin.jvm.internal.o.o("editTopSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(view11.getLayoutParams());
        layoutParams6.height = i65.a.h(finderCreateContactUI, com.tencent.mm.R.dimen.f479731dn);
        android.view.View view12 = finderCreateContactUI.H;
        if (view12 == null) {
            kotlin.jvm.internal.o.o("editTopSpace");
            throw null;
        }
        view12.setLayoutParams(layoutParams6);
        android.view.View view13 = finderCreateContactUI.I;
        if (view13 == null) {
            kotlin.jvm.internal.o.o("editMiddleSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(view13.getLayoutParams());
        layoutParams7.height = -2;
        layoutParams7.weight = 1.0f;
        android.view.View view14 = finderCreateContactUI.I;
        if (view14 == null) {
            kotlin.jvm.internal.o.o("editMiddleSpace");
            throw null;
        }
        view14.setLayoutParams(layoutParams7);
        android.view.View view15 = finderCreateContactUI.f128539J;
        if (view15 == null) {
            kotlin.jvm.internal.o.o("editBottomSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(view15.getLayoutParams());
        layoutParams8.height = i65.a.h(finderCreateContactUI, com.tencent.mm.R.dimen.f479657bu);
        android.view.View view16 = finderCreateContactUI.f128539J;
        if (view16 != null) {
            view16.setLayoutParams(layoutParams8);
        } else {
            kotlin.jvm.internal.o.o("editBottomSpace");
            throw null;
        }
    }
}
