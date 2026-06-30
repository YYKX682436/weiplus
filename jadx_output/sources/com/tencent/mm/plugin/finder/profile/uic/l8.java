package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class l8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f123945f;

    public l8(java.lang.String str, com.tencent.mm.plugin.finder.profile.uic.ob obVar, org.json.JSONObject jSONObject) {
        this.f123943d = str;
        this.f123944e = obVar;
        this.f123945f = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLuckMoneyCoverLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String e17 = xc2.y2.f453343a.e(this.f123943d, "commentScene=32");
        intent.putExtra("rawUrl", e17);
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f123944e;
        j45.l.j(obVar.getActivity(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        android.app.Activity context = obVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "get_red_cover_panel", 1, this.f123945f, false, null, 48, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileHeaderUIC", "[handleLuckMoneyCoverLayout] jump url:".concat(e17));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleLuckMoneyCoverLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
