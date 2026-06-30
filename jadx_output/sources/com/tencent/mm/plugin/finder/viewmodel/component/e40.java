package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class e40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cr6 f134190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134191e;

    public e40(r45.cr6 cr6Var, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f134190d = cr6Var;
        this.f134191e = f50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$needCompleteAccountUi$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.cr6 cr6Var = this.f134190d;
        if (cr6Var == null || (str = cr6Var.getString(3)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.n(this.f134191e.getActivity(), "webview", ".ui.tools.WebViewUI", intent, 31121);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$needCompleteAccountUi$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
