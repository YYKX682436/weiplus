package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI f173099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173100e;

    public p(com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI, java.lang.String str) {
        this.f173099d = authorizationDetailUI;
        this.f173100e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pq5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI = this.f173099d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(authorizationDetailUI, "", authorizationDetailUI.getContext().getString(com.tencent.mm.R.string.ggd), true, false, null);
        int i17 = com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI.f172796t;
        com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI authorizationDetailUI2 = this.f173099d;
        ((android.widget.TextView) authorizationDetailUI2.findViewById(com.tencent.mm.R.id.dhj)).setVisibility(8);
        java.lang.String str = this.f173100e;
        if (str != null) {
            rt0.e eVar = (rt0.e) authorizationDetailUI2.T6().y(rt0.e.class);
            int i18 = eVar.f399379d;
            java.lang.String str2 = eVar.f399378c;
            if (str2 == null) {
                str2 = "";
            }
            pq5.g l17 = new vh4.z0(str, i18, str2, authorizationDetailUI2.U6()).l();
            l17.f(authorizationDetailUI2);
            gVar = l17.h(new com.tencent.mm.plugin.teenmode.ui.o(Q, eVar, authorizationDetailUI2));
        } else {
            gVar = null;
        }
        if (gVar == null) {
            Q.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
