package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class z20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136634e;

    public z20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, java.lang.String str) {
        this.f136633d = f50Var;
        this.f136634e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136633d;
        f50Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openH5CreatorCenter url:");
        java.lang.String str = this.f136634e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.SelfUIC", sb6.toString());
        f50Var.R6();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", f50Var.Y6(str));
        j45.l.j(f50Var.getActivity(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPosterEntrance$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
