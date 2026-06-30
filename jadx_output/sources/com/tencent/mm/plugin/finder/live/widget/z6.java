package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d7 f120530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120531e;

    public z6(com.tencent.mm.plugin.finder.live.widget.d7 d7Var, android.view.View view) {
        this.f120530d = d7Var;
        this.f120531e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.d7 d7Var = this.f120530d;
        int c17 = com.tencent.mm.ui.bl.c(d7Var.f118183e);
        com.tencent.mars.xlog.Log.i(d7Var.K, "navigationBarHeight:" + c17);
        android.view.ViewGroup.LayoutParams layoutParams = this.f120531e.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
    }
}
