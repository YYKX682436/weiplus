package im2;

/* loaded from: classes.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292243d;

    public a1(im2.z3 z3Var) {
        this.f292243d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f292243d;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(z3Var.getContext(), 0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(z3Var.getContext()).inflate(com.tencent.mm.R.layout.aw9, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485291h64);
        android.webkit.WebView webView = (android.webkit.WebView) inflate.findViewById(com.tencent.mm.R.id.fes);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fer)).getPaint(), 0.8f);
        webView.loadUrl(z3Var.A1);
        webView.getLayoutParams().height = com.tencent.mm.ui.bl.b(z3Var.getContext()).y / 2;
        findViewById.setOnClickListener(new im2.t3(z2Var));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
