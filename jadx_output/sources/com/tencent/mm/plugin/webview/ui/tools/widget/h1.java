package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class h1 implements ym5.z4 {

    /* renamed from: a, reason: collision with root package name */
    public float f187240a = Float.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public float f187241b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f187242c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187243d;

    public h1(boolean z17, com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var) {
        this.f187242c = z17;
        this.f187243d = m1Var;
    }

    public void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        boolean z17 = this.f187242c;
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = this.f187243d;
        if (z17) {
            if (view.getTranslationX() == this.f187241b) {
                return;
            }
            this.f187241b = view.getTranslationX();
            float abs = java.lang.Math.abs(view.getTranslationX());
            kotlin.jvm.internal.o.d(m1Var.f281401g);
            float width = abs / r0.getWidth();
            java.util.Iterator it = m1Var.Q.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.webview.ui.tools.widget.a1) it.next()).b(1.0f - width);
            }
            return;
        }
        if (view.getTranslationY() == this.f187240a) {
            return;
        }
        this.f187240a = view.getTranslationY();
        float abs2 = java.lang.Math.abs(view.getTranslationY());
        kotlin.jvm.internal.o.d(m1Var.f281401g);
        float height = abs2 / r0.getHeight();
        java.util.Iterator it6 = m1Var.Q.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.webview.ui.tools.widget.a1) it6.next()).b(1.0f - height);
        }
    }
}
