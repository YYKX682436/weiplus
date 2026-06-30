package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.jdbiz.o f172123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.jdbiz.l f172124e;

    public k(com.tencent.mm.plugin.subapp.jdbiz.l lVar, com.tencent.mm.plugin.subapp.jdbiz.o oVar) {
        this.f172124e = lVar;
        this.f172123d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.subapp.jdbiz.l lVar = this.f172124e;
        lVar.getClass();
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(15, 0)).intValue();
        boolean z17 = c01.d9.e().f70771n;
        com.tencent.mm.plugin.subapp.jdbiz.o oVar = this.f172123d;
        if (!z17 || 1 != intValue) {
            java.lang.String Bi = com.tencent.mm.plugin.subapp.jdbiz.q.Bi(oVar.f172146o, 4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, oVar.f172133b);
            bundle.putString("jump_url", Bi);
            ((c01.v8) c01.d9.f()).b(37, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490531xr), oVar.f172142k, Bi, "bizjd", bundle);
            lVar.f172125d.alive();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11178, Bi, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, 4);
            return;
        }
        java.lang.String Bi2 = com.tencent.mm.plugin.subapp.jdbiz.q.Bi(oVar.f172146o, 5);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = oVar.f172143l;
        java.lang.String str2 = oVar.f172144m;
        java.lang.String str3 = oVar.f172145n;
        java.lang.String str4 = oVar.f172133b;
        int i17 = com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog.f172112f;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog.class);
        intent.putExtra("alertcontent", str);
        intent.putExtra("alertconfirm", str2);
        intent.putExtra("alert_cancel", str3);
        intent.putExtra("alertjumpurl", Bi2);
        intent.putExtra("alert_activityid", str4);
        intent.addFlags(805306368);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/subapp/jdbiz/JDRemindDialog", "showAlert", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11178, Bi2, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, 5);
    }
}
