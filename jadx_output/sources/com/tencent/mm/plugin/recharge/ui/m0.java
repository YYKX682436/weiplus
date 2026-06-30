package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155205d;

    public m0(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155205d = phoneRechargeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155205d;
        if (phoneRechargeUI.K != null) {
            o45.eg.a(6, 1);
            vr4.a1 a1Var = phoneRechargeUI.K;
            if (!com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.V6(phoneRechargeUI, a1Var.f439678g, a1Var.f439679h, a1Var.f439676e, "") && !com.tencent.mm.sdk.platformtools.t8.K0(phoneRechargeUI.K.f439677f)) {
                try {
                    com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.X6(phoneRechargeUI, java.net.URLDecoder.decode(phoneRechargeUI.K.f439677f, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), phoneRechargeUI.K.f439676e, "");
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
