package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class nm implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.om f161367e;

    public nm(com.tencent.mm.plugin.setting.ui.setting.om omVar, java.lang.String str) {
        this.f161367e = omVar;
        this.f161366d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f161366d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsSwitchAccountUI", "delete %s", str);
        com.tencent.mm.plugin.setting.ui.setting.om omVar = this.f161367e;
        omVar.f161400a.f160695r = true;
        c01.uc ucVar = c01.uc.f37514c;
        ucVar.i(str);
        ((java.util.HashMap) omVar.f161400a.f160699v).remove(str);
        com.tencent.mm.plugin.setting.ui.widget.SwitchAccountGridView switchAccountGridView = omVar.f161400a.f160685e;
        java.util.ArrayList arrayList = (java.util.ArrayList) switchAccountGridView.f162056m;
        if (arrayList.contains(str)) {
            int indexOf = arrayList.indexOf(str);
            arrayList.remove(str);
            ((java.util.ArrayList) switchAccountGridView.f162057n).remove(indexOf);
            ((java.util.ArrayList) switchAccountGridView.f162058o).remove(indexOf);
        }
        omVar.f161400a.Y6();
        omVar.f161400a.f160685e.b();
        if (omVar.f161400a.f160693p == 0) {
            if (((java.util.HashSet) ucVar.d()).size() > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 4, ucVar.f(), ucVar.e(), wo.w0.k());
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 0, 4, ucVar.f(), ucVar.e(), wo.w0.k());
            }
        }
    }
}
