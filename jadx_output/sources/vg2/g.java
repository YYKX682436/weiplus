package vg2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.m f436510d;

    public g(vg2.m mVar) {
        this.f436510d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.m mVar = this.f436510d;
        mVar.getClass();
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388607, null);
        n1Var.f187426i = 1;
        n1Var.f187423f = 1;
        n1Var.f187437t = 2;
        n1Var.f187428k = false;
        n1Var.f187422e = false;
        n1Var.f187438u = true;
        n1Var.f187435r = 1;
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, mVar.f118183e, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/uhch6n4I0vZmtncy?theme=dark", null, n1Var, 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
