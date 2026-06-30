package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class r0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f161490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI f161491e;

    public r0(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI) {
        this.f161490d = m1Var;
        this.f161491e = colorfulChatroomQRCodeUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161490d);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI.f160124u;
        com.tencent.mm.plugin.setting.ui.setting.ColorfulChatroomQRCodeUI colorfulChatroomQRCodeUI = this.f161491e;
        if (!com.tencent.mm.storage.z3.R4(colorfulChatroomQRCodeUI.getUserName())) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String userName = colorfulChatroomQRCodeUI.getUserName();
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(userName)) {
                return;
            }
        }
        colorfulChatroomQRCodeUI.finish();
    }
}
