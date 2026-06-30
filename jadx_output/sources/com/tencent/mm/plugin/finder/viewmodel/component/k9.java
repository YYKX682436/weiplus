package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134936f;

    public k9(in5.s0 s0Var, android.view.View view, android.view.View view2) {
        this.f134934d = s0Var;
        this.f134935e = view;
        this.f134936f = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        this.f134934d.itemView.getLocationInWindow(iArr);
        android.view.View view = this.f134935e;
        view.getLocationInWindow(r2);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.view.View view2 = this.f134936f;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((android.widget.FrameLayout.LayoutParams) layoutParams2).topMargin = ((android.widget.FrameLayout.LayoutParams) layoutParams).topMargin + (view.getHeight() / 2);
        view2.requestLayout();
    }
}
