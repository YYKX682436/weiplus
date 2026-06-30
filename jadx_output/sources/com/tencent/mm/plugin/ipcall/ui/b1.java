package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallContactUI f142758d;

    public b1(com.tencent.mm.plugin.ipcall.ui.IPCallContactUI iPCallContactUI) {
        this.f142758d = iPCallContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.plugin.ipcall.model.g.f142465d == null) {
            com.tencent.mm.plugin.ipcall.model.g.f142465d = new com.tencent.mm.plugin.ipcall.model.g();
        }
        com.tencent.mm.plugin.ipcall.model.g.f142465d.a(this.f142758d.f142561s, false);
    }
}
