package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o f142787d;

    public e(com.tencent.mm.plugin.ipcall.ui.o oVar) {
        this.f142787d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.ipcall.ui.o oVar = this.f142787d;
        if (currentTimeMillis - oVar.f142965q < 500) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.d(this));
            return;
        }
        oVar.f142962n = t83.c.e(oVar.f142957i, oVar.f142960l + oVar.f142961m);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ipcall.ui.c(this, com.tencent.mm.plugin.ipcall.model.r.wi().D0(oVar.f142962n)));
    }
}
