package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class fd implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f184185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.ld f184186f;

    public fd(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, android.view.View view, float f17) {
        this.f184186f = ldVar;
        this.f184184d = view;
        this.f184185e = f17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f184184d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewParent parent = view.getParent();
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = this.f184186f;
        ldVar.s(this.f184185e + ((parent == null || view.getVisibility() == 8) ? 0.0f : view.getMeasuredHeight() / ldVar.f185653d.getMMDensity()));
    }
}
