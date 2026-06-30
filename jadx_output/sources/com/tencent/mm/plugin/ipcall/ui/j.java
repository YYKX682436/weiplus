package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142875d;

    public j(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142875d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12061, 0, 0, 0, 1, 0, 0);
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142875d;
        java.lang.String replace = oVar.f142950b.getText().toString().replace("+", "");
        android.content.Intent intent = new android.content.Intent(oVar.f142957i, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI.class);
        intent.putExtra("couttry_code", replace);
        intent.putExtra("CountryCodeUI_isShowCountryCode", true);
        oVar.f142957i.startActivityForResult(intent, 100);
        oVar.f142957i.overridePendingTransition(com.tencent.mm.R.anim.f477857df, -1);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
