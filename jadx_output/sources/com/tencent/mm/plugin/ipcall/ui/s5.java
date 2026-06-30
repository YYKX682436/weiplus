package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class s5 implements ns.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.u5 f143007d;

    public s5(com.tencent.mm.plugin.ipcall.ui.u5 u5Var) {
        this.f143007d = u5Var;
    }

    @Override // ns.e
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        if (z17) {
            com.tencent.mm.plugin.ipcall.ui.u5 u5Var = this.f143007d;
            u5Var.f143026d.f142731q.setVisibility(8);
            u5Var.f143026d.f142730p.setVisibility(8);
            com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI = u5Var.f143026d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(iPCallUserProfileUI.f142734t) || com.tencent.mm.sdk.platformtools.t8.K0(str) || str.endsWith("@stranger")) {
                return;
            }
            s83.c D0 = com.tencent.mm.plugin.ipcall.model.r.wi().D0(iPCallUserProfileUI.f142734t);
            if (D0.systemRowid > 0) {
                D0.field_wechatUsername = str;
                com.tencent.mm.plugin.ipcall.model.r.wi().update(D0.systemRowid, D0);
            }
        }
    }
}
