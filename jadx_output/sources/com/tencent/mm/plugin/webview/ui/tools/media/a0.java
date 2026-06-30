package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class a0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185740d;

    public a0(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185740d = mPVideoPlayFullScreenView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.ViewTreeObserver viewTreeObserver2;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185740d;
        java.lang.String str = mPVideoPlayFullScreenView.f185707d;
        android.view.ViewGroup viewGroup = mPVideoPlayFullScreenView.f185711h;
        if (viewGroup != null && (viewTreeObserver2 = viewGroup.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        android.view.ViewGroup viewGroup2 = mPVideoPlayFullScreenView.f185711h;
        java.lang.Integer valueOf = viewGroup2 != null ? java.lang.Integer.valueOf(viewGroup2.getHeight()) : null;
        kotlin.jvm.internal.o.d(valueOf);
        if (valueOf.intValue() <= 0) {
            android.view.ViewGroup viewGroup3 = mPVideoPlayFullScreenView.f185711h;
            if (viewGroup3 == null || (viewTreeObserver = viewGroup3.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.webview.ui.tools.media.a0(mPVideoPlayFullScreenView));
            return;
        }
        com.tencent.mm.ui.tools.s4 s4Var = mPVideoPlayFullScreenView.C;
        android.view.View view = mPVideoPlayFullScreenView.f185714n;
        if (s4Var != null) {
            kotlin.jvm.internal.o.d(view);
            android.view.View view2 = mPVideoPlayFullScreenView.f185708e;
            android.view.ViewGroup viewGroup4 = mPVideoPlayFullScreenView.f185711h;
            kotlin.jvm.internal.o.d(viewGroup4);
            view.setOnTouchListener(new com.tencent.mm.ui.tools.b4(s4Var, new android.view.GestureDetector(s4Var.f210694a, new com.tencent.mm.ui.tools.k4(s4Var)), view, view2, viewGroup4, null));
        }
        com.tencent.mm.ui.tools.s4 s4Var2 = mPVideoPlayFullScreenView.C;
        if (s4Var2 != null) {
            s4Var2.f210693J = new com.tencent.mm.plugin.webview.ui.tools.media.u(mPVideoPlayFullScreenView);
        }
        if (s4Var2 != null) {
            s4Var2.G = new com.tencent.mm.plugin.webview.ui.tools.media.v(mPVideoPlayFullScreenView);
        }
        if (s4Var2 != null) {
            s4Var2.H = new com.tencent.mm.plugin.webview.ui.tools.media.w(mPVideoPlayFullScreenView);
        }
        if (s4Var2 != null) {
            s4Var2.I = new com.tencent.mm.plugin.webview.ui.tools.media.x(mPVideoPlayFullScreenView);
        }
        if (view != null) {
            view.setOnClickListener(com.tencent.mm.plugin.webview.ui.tools.media.y.f185833d);
        }
        com.tencent.mm.ui.tools.s4 s4Var3 = mPVideoPlayFullScreenView.C;
        if (s4Var3 != null) {
            android.view.ViewGroup viewGroup5 = mPVideoPlayFullScreenView.f185711h;
            kotlin.jvm.internal.o.d(viewGroup5);
            s4Var3.c(viewGroup5, null, new com.tencent.mm.plugin.webview.ui.tools.media.z(mPVideoPlayFullScreenView));
        }
    }
}
