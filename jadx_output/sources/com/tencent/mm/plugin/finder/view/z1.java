package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g2 f133444d;

    public z1(com.tencent.mm.plugin.finder.view.g2 g2Var) {
        this.f133444d = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.g2 g2Var = this.f133444d;
        long j17 = g2Var.f132135g.getLong(1);
        android.content.Context context = g2Var.f132130b;
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=%s&source=1022", java.util.Arrays.copyOf(new java.lang.Object[]{pm0.v.u(j17)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", format);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        g2Var.f132137i = 4;
        g2Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
