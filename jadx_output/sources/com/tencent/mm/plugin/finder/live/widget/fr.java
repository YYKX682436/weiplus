package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f118371d;

    public fr(com.tencent.mm.plugin.finder.live.widget.mr mrVar) {
        this.f118371d = mrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f118371d;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = mrVar.B;
        if (y1Var == null || (viewGroup = y1Var.C) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = mrVar.B;
        layoutParams2.height = (y1Var2 == null || (viewGroup2 = y1Var2.B) == null) ? 0 : viewGroup2.getHeight();
        viewGroup.setLayoutParams(layoutParams2);
    }
}
