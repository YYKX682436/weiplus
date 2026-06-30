package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.s f139933e;

    public r(com.tencent.mm.plugin.game.luggage.page.s sVar, java.lang.String str) {
        this.f139933e = sVar;
        this.f139932d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        com.tencent.mm.plugin.game.luggage.page.s sVar = this.f139933e;
        java.lang.String i17 = ((yq1.z) a0Var).i(sVar.f139936d.Q);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("userName", sVar.f139936d.Q);
        bundle.putString("exportId", i17);
        bundle.putString("byPass", sVar.f139936d.U);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.game.luggage.page.t.class, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23044, 2, sVar.f139936d.Q, 0, 0, i17, java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(sVar.f139936d.Q)), 2, this.f139932d, java.lang.Integer.valueOf(sVar.f139936d.S));
        yj0.a.h(this, "com/tencent/mm/plugin/game/luggage/page/GameWebActionBar$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
