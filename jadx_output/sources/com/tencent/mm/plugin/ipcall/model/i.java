package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f142469a;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f142469a = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.IPCallSyncAddrBookEventEvent>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallAddressUpdater$1
            {
                this.__eventId = -1320342326;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.IPCallSyncAddrBookEventEvent iPCallSyncAddrBookEventEvent) {
                if (!(iPCallSyncAddrBookEventEvent instanceof com.tencent.mm.autogen.events.IPCallSyncAddrBookEventEvent)) {
                    return false;
                }
                s75.d.b(new com.tencent.mm.plugin.ipcall.model.h(this), "IPCall_SyncAddressBook");
                return false;
            }
        };
    }

    public static void a(long j17) {
        android.database.Cursor y07 = com.tencent.mm.plugin.ipcall.model.r.Vi().y0(j17);
        try {
            if (y07 != null) {
                try {
                    if (y07.moveToFirst()) {
                        while (!y07.isAfterLast()) {
                            s83.l lVar = new s83.l();
                            lVar.convertFrom(y07);
                            lVar.field_addressId = -1L;
                            lVar.field_phoneType = -1;
                            com.tencent.mm.plugin.ipcall.model.r.Vi().z0(lVar);
                            y07.moveToNext();
                        }
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallAddressUpdater", "updateDeleteAddressRecord error: %s", e17.getMessage());
                }
            }
            if (y07 == null) {
            }
        } finally {
            y07.close();
        }
    }
}
