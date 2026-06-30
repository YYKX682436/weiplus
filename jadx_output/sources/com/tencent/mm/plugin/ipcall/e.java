package com.tencent.mm.plugin.ipcall;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.j f142439d;

    public e(com.tencent.mm.plugin.ipcall.j jVar) {
        this.f142439d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.plugin.ipcall.model.r.bj().c()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "timeout! still not accept!");
        com.tencent.mm.plugin.ipcall.j jVar = this.f142439d;
        if (jVar.j(9, 12)) {
            jVar.i(9, null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490773aq1), 2);
        }
    }
}
