package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class ua implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.hb f161602d;

    public ua(com.tencent.mm.plugin.setting.ui.setting.hb hbVar) {
        this.f161602d = hbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.hb hbVar = this.f161602d;
        android.content.Intent intent = new android.content.Intent(hbVar.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        java.lang.String str = com.tencent.mm.sdk.platformtools.a9.f192463a;
        if (yp5.a.f464409a.a()) {
            intent.putExtra("kintent_hint", hbVar.getString(com.tencent.mm.R.string.j0c));
        } else {
            intent.putExtra("kintent_hint", hbVar.getString(com.tencent.mm.R.string.j0d));
        }
        intent.putExtra("from_unbind", true);
        android.app.Activity context = hbVar.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC$onSceneEnd$16", "onClick", "(Landroid/content/DialogInterface;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
