package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142886d;

    public k(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142886d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142886d;
        android.widget.TextView textView = oVar.f142950b;
        oVar.f142960l = textView.getText().toString();
        oVar.f142961m = oVar.f142951c.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(oVar.f142960l) || com.tencent.mm.sdk.platformtools.t8.K0(oVar.f142961m)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                java.lang.String a17 = oVar.a(textView.getText().toString().replace("+", ""), t83.f.i(string));
                oVar.f142961m = a17;
                oVar.e(a17, -1);
                oVar.b();
            }
        } else {
            oVar.f142960l = textView.getText().toString().replace("+", "");
            java.lang.String str = oVar.f142960l + oVar.f142961m;
            com.tencent.mm.ui.MMActivity mMActivity = oVar.f142957i;
            java.lang.String e17 = t83.c.e(mMActivity, str);
            oVar.f142962n = e17;
            oVar.f142963o = !com.tencent.mm.sdk.platformtools.t8.K0(e17) ? o25.b.c(e17, mMActivity) : null;
            java.lang.String i17 = t83.f.i(oVar.f142961m);
            android.content.SharedPreferences.Editor edit = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("IPCall_LastInputPref", 0).edit();
            edit.putString("IPCall_LastInputPhoneNumber", i17);
            edit.apply();
            java.lang.String charSequence = textView.getText().toString();
            java.lang.String str2 = oVar.f142959k;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    str2 = "";
                }
                android.content.SharedPreferences.Editor edit2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("IPCall_LastInputPref", 0).edit();
                edit2.putString("IPCall_LastInputCountryCode", charSequence.replace("+", ""));
                edit2.putString("IPCall_LastInputCountryName", str2);
                edit2.apply();
            }
            com.tencent.mm.plugin.ipcall.ui.n nVar = oVar.f142949a;
            if (nVar != null) {
                java.lang.String str3 = oVar.f142960l;
                java.lang.String i18 = t83.f.i(oVar.f142961m);
                java.lang.String str4 = oVar.f142962n;
                java.lang.String str5 = oVar.f142963o;
                com.tencent.mm.plugin.ipcall.ui.IPCallDialUI iPCallDialUI = (com.tencent.mm.plugin.ipcall.ui.IPCallDialUI) nVar;
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallDialUI", "onDial, countryCode: %s, phoneNumber: %s, contactId: %s, nickname: %s", str3, i18, str4, str5);
                if (t83.f.c(iPCallDialUI)) {
                    if (com.tencent.mm.plugin.ipcall.model.j.a().e(com.tencent.mm.sdk.platformtools.t8.P(str3, -1))) {
                        db5.e1.s(iPCallDialUI, iPCallDialUI.getString(com.tencent.mm.R.string.apz), iPCallDialUI.getString(com.tencent.mm.R.string.f490772aq0));
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(12058, str3);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 1);
                        android.content.Intent intent = new android.content.Intent(iPCallDialUI, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI.class);
                        intent.putExtra("IPCallTalkUI_contactId", str4);
                        intent.putExtra("IPCallTalkUI_countryCode", str3);
                        intent.putExtra("IPCallTalkUI_nickname", str5);
                        intent.putExtra("IPCallTalkUI_phoneNumber", i18);
                        intent.putExtra("IPCallTalkUI_dialScene", iPCallDialUI.f142603u);
                        intent.putExtra("IPCallTalkUI_countryType", iPCallDialUI.f142604v);
                        iPCallDialUI.startActivityForResult(intent, 1001);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
