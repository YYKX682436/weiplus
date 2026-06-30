package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f142778d;

    public d1(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f142778d = iPCallContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI = this.f142778d;
        com.tencent.mm.plugin.ipcall.ui.w wVar = iPCallContactUI.f142552g;
        if (wVar == null || iPCallContactUI.f142551f == null || wVar.f143053v) {
            return;
        }
        java.lang.String str = iPCallContactUI.f142558p;
        wVar.f143051t = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            wVar.f143052u = false;
        } else {
            wVar.f143052u = true;
        }
        ((java.util.HashMap) wVar.f212610g).clear();
        wVar.q();
        wVar.notifyDataSetChanged();
        iPCallContactUI.f142565w.sendEmptyMessage(2);
        iPCallContactUI.f142551f.invalidateViews();
    }
}
