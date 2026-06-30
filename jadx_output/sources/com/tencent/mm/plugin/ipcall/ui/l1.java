package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes15.dex */
public class l1 implements com.tencent.mm.ui.tools.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI f142897d;

    public l1(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        this.f142897d = iPCallCountryCodeSelectUI;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142897d;
        iPCallCountryCodeSelectUI.f142584m = str;
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI.T6(iPCallCountryCodeSelectUI);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void Z2() {
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI = this.f142897d;
        iPCallCountryCodeSelectUI.f142584m = "";
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI.T6(iPCallCountryCodeSelectUI);
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
