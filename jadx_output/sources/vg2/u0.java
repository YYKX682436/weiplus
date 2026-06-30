package vg2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f436594d;

    public u0(vg2.v0 v0Var) {
        this.f436594d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zg0.u2 u2Var = (zg0.u2) c17;
        vg2.v0 v0Var = this.f436594d;
        android.content.Context context = v0Var.a().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2(u2Var, context, "https://channels-aladin.wxqcloud.qq.com/aladin/html/a4d6ce43-4fdf-41d3-ac41-34c0532660cb.html?rd=wechat_redirect&hexBackgroundColor=191919#/", null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 1, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 2, false, false, false, 7864015, null), 4, null)).show();
        v0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
