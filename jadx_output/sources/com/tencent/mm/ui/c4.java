package com.tencent.mm.ui;

/* loaded from: classes4.dex */
public final class c4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.EndMaskView f198074d;

    public c4(com.tencent.mm.ui.EndMaskView endMaskView) {
        this.f198074d = endMaskView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.EndMaskView endMaskView = this.f198074d;
        android.view.ViewGroup.LayoutParams layoutParams = endMaskView.f196646e.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = endMaskView.f196645d.getHeight() + i65.a.f(endMaskView.getContext(), com.tencent.mm.R.dimen.f479738dv);
        endMaskView.f196646e.setLayoutParams(layoutParams2);
        endMaskView.f196646e.setVisibility(0);
    }
}
