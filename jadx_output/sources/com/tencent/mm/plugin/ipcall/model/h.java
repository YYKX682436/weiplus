package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {
    public h(com.tencent.mm.plugin.ipcall.model.IPCallAddressUpdater$1 iPCallAddressUpdater$1) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.event.IListener iListener = com.tencent.mm.plugin.ipcall.model.i.f142469a;
        try {
            if (!gm0.j1.a()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage, acc not ready");
                return;
            }
            java.lang.System.currentTimeMillis();
            java.util.ArrayList z07 = com.tencent.mm.plugin.ipcall.model.r.wi().z0();
            if (z07 == null || z07.size() <= 0) {
                return;
            }
            s83.b.b();
            java.util.HashMap hashMap = s83.b.f404867b;
            if (hashMap != null && hashMap.size() >= 0) {
                s83.d wi6 = com.tencent.mm.plugin.ipcall.model.r.wi();
                long id6 = java.lang.Thread.currentThread().getId();
                l75.k0 k0Var = wi6.f404872d;
                long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(id6)) : -1L;
                z07.size();
                java.util.Iterator it = z07.iterator();
                while (it.hasNext()) {
                    s83.c cVar = (s83.c) it.next();
                    if (!hashMap.containsKey(cVar.field_contactId)) {
                        long j17 = cVar.systemRowid;
                        com.tencent.mm.plugin.ipcall.model.r.wi().delete(j17);
                        com.tencent.mm.plugin.ipcall.model.i.a(j17);
                    }
                }
                for (s83.c cVar2 : hashMap.values()) {
                    s83.c D0 = com.tencent.mm.plugin.ipcall.model.r.wi().D0(cVar2.field_contactId);
                    if (D0 == null || D0.systemRowid == -1) {
                        com.tencent.mm.plugin.ipcall.model.r.wi().insert(cVar2);
                    } else if (!(D0.t0(D0.field_contactId, cVar2.field_contactId) && D0.t0(D0.field_systemAddressBookUsername, cVar2.field_systemAddressBookUsername) && D0.t0(D0.field_wechatUsername, cVar2.field_wechatUsername))) {
                        com.tencent.mm.plugin.ipcall.model.r.wi().update(D0.systemRowid, cVar2);
                    }
                }
                com.tencent.mm.plugin.ipcall.model.r.wi().y0(F);
                java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage error:" + e17.getMessage());
        }
    }
}
