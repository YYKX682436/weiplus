package com.tencent.mm.plugin.ipcall;

/* loaded from: classes14.dex */
public class d implements com.tencent.mm.sdk.platformtools.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.j f142438a;

    public d(com.tencent.mm.plugin.ipcall.j jVar) {
        this.f142438a = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.h5
    public void a(int i17) {
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallManager", "system phone call state offhook, stop call");
            this.f142438a.j(0, 0);
        }
    }
}
