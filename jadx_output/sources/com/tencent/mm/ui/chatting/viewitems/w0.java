package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.i1 f205895d;

    public w0(com.tencent.mm.ui.chatting.viewitems.i1 i1Var) {
        this.f205895d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.viewitems.i1 i1Var = this.f205895d;
        com.tencent.mm.plugin.appbrand.service.i5 i5Var = i1Var.f204156z;
        java.lang.String str = i5Var != null ? ((com.tencent.mm.plugin.appbrand.app.d0) i5Var).f75047d : null;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        int d07 = com.tencent.mm.ui.chatting.viewitems.i1.d0(i1Var, ((com.tencent.mm.ui.chatting.adapter.q) view.getTag(com.tencent.mm.R.id.bhl)).getAdapterPosition());
        tt0.a a17 = tt0.a.a(erVar.c().j());
        java.lang.String str2 = a17.f421779e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = a17.f421777c;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = a17.f421783i;
        java.lang.String str7 = str6 == null ? "" : str6;
        java.lang.String str8 = a17.f421778d;
        if (str8 == null) {
            str8 = "";
        }
        int i17 = a17.f421781g;
        int i18 = a17.f421780f;
        java.lang.String str9 = a17.f421775a;
        java.lang.String replaceAll = (str9 != null ? str9 : "").replaceAll("[_a-zA-Z0-9]", "*");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) container click", str8);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = str8;
        b1Var.f317016c = i18;
        b1Var.f317018d = i17;
        b1Var.f317022f = str7;
        b1Var.f317034l = "1162:" + str5 + ":" + replaceAll;
        b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.media.u5.CTRL_INDEX;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer appBrandLaunchFromNotifyReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchFromNotifyReferrer();
        appBrandLaunchFromNotifyReferrer.f77314d = str3;
        appBrandLaunchFromNotifyReferrer.f77315e = i1Var.f204149s;
        appBrandLaunchFromNotifyReferrer.f77316f = 2;
        appBrandLaunchFromNotifyReferrer.f77317g = str5;
        appBrandLaunchFromNotifyReferrer.f77318h = replaceAll;
        appBrandLaunchFromNotifyReferrer.f77319i = d07;
        appBrandLaunchFromNotifyReferrer.f77320m = str;
        b1Var.A = appBrandLaunchFromNotifyReferrer;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(i1Var.f204150t.g(), b1Var);
        com.tencent.mm.ui.chatting.component.s2 s2Var = (com.tencent.mm.ui.chatting.component.s2) ((sb5.o) i1Var.f204150t.f460708c.a(sb5.o.class));
        if (s2Var.n0()) {
            ((java.util.HashSet) s2Var.f199901m).add(java.lang.Integer.valueOf(java.lang.Math.max(0, d07)));
        }
        this.f205895d.e0(4, str3, str5, str7, null, d07);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppBrandNotifyMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
