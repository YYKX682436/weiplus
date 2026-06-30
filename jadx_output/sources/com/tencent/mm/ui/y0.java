package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class y0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI f212569d;

    public y0(com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI) {
        this.f212569d = appBrandNotifySettingsUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.AppBrandNotifySettingsUI appBrandNotifySettingsUI = this.f212569d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandNotifySettingsUI.f196582f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.t7.makeText(appBrandNotifySettingsUI, com.tencent.mm.R.string.hcs, 0).show();
            return 0;
        }
        r45.zs3 zs3Var = (r45.zs3) oVar.f70711b.f70700a;
        if (zs3Var.f392348e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNotifySettingsUI", "wxa_msg_config_list not exist");
            return 0;
        }
        appBrandNotifySettingsUI.runOnUiThread(new com.tencent.mm.ui.x0(this, zs3Var));
        return 0;
    }
}
