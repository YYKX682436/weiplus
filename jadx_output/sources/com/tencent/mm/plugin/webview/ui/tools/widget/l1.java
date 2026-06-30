package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class l1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f187374b;

    public l1(com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var, float f17) {
        this.f187373a = m1Var;
        this.f187374b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = this.f187373a.f187397s;
        if ((n1Var.f187435r == 1) && n1Var.f187426i == 1) {
            outline.setRoundRect(0, 0, (int) (view.getWidth() + this.f187374b), view.getHeight(), this.f187374b);
            return;
        }
        int width = view.getWidth();
        float height = view.getHeight();
        float f17 = this.f187374b;
        outline.setRoundRect(0, 0, width, (int) (height + f17), f17);
    }
}
