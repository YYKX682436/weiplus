package oy2;

/* loaded from: classes8.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy2.a0 f350004d;

    public v(oy2.a0 a0Var) {
        this.f350004d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oy2.a0 a0Var = this.f350004d;
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout scrollFrameLayout = a0Var.f349947l;
        if (scrollFrameLayout instanceof com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) {
            ((com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout) scrollFrameLayout).m();
        } else {
            a0Var.f349936a.a().dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
