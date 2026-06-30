package com.tencent.mm.plugin.ipcall;

/* loaded from: classes8.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.ipcall.c f142436e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f142437d = false;

    public void a() {
        com.tencent.mm.sdk.platformtools.c5 c5Var = t83.c.f416411a;
        com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent = new com.tencent.mm.autogen.events.CheckCanSyncAddrBookEvent();
        checkCanSyncAddrBookEvent.e();
        boolean z17 = checkCanSyncAddrBookEvent.f54047g.f7219a;
        if (!this.f142437d && java.lang.Math.abs(java.lang.System.currentTimeMillis() - ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, 0L)).longValue()) >= 86400000) {
            this.f142437d = true;
            c01.d9.e().a(32, this);
            s75.d.b(new com.tencent.mm.plugin.ipcall.a(this), "IPCallAddressBookUpdater_updateUsername");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f142437d) {
            c01.d9.e().q(32, this);
            java.lang.System.currentTimeMillis();
            if (i17 == 0 && i18 == 0) {
                s75.d.b(new com.tencent.mm.plugin.ipcall.b(this), "IPCallAddressBookUsernameUpdater_updateUsernameAfterGetMFriend");
                return;
            }
            this.f142437d = false;
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IPCALL_ADDRESS_GETMFRIEND_LASTUPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
