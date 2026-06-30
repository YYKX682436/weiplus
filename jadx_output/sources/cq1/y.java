package cq1;

/* loaded from: classes8.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq1.d0 f221372d;

    public y(cq1.d0 d0Var) {
        this.f221372d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cq1.d0 d0Var = this.f221372d;
        d0Var.b();
        cq1.v vVar = d0Var.f221347u;
        if (vVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "https://a.app.qq.com/o/simple.jsp?pkgname=com.tencent.mp");
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra("key_enable_fts_quick", true);
            j45.l.j(((eq1.v) vVar).f255872a, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/biz/scheme/LaunchMpBottomSheet$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
