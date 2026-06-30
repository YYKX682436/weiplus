package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI f175337d;

    public t(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI) {
        this.f175337d = networkDiagnoseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.f175310n;
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = this.f175337d;
        networkDiagnoseUI.getClass();
        db5.e1.j(networkDiagnoseUI, com.tencent.mm.R.string.bau, com.tencent.mm.R.string.bp9, com.tencent.mm.R.string.f490608zu, com.tencent.mm.R.string.f490503wx, new com.tencent.mm.plugin.traceroute.ui.a0(networkDiagnoseUI), new com.tencent.mm.plugin.traceroute.ui.b0(networkDiagnoseUI));
        return true;
    }
}
