package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI f155226d;

    public u(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI) {
        this.f155226d = phoneRechargeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI phoneRechargeUI = this.f155226d;
        vr4.e eVar = phoneRechargeUI.G;
        if (!com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.V6(phoneRechargeUI, eVar.f439714f, eVar.f439715g, eVar.f439713e, "")) {
            try {
                com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.X6(phoneRechargeUI, java.net.URLDecoder.decode(phoneRechargeUI.G.f439712d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding), phoneRechargeUI.G.f439713e, "");
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }
}
