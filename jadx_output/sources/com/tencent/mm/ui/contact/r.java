package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207146d;

    public r(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207146d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(10);
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f207146d;
        int i17 = com.tencent.mm.ui.contact.AddressUI.AddressUIFragment.Y;
        synchronized (addressUIFragment) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            addressUIFragment.z0();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "KEVIN updateBlockList() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (addressUIFragment.f206309q != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.n(addressUIFragment));
            }
            if (addressUIFragment.f206310r != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.o(addressUIFragment));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "KEVIN doRefresh() LAST" + (java.lang.System.currentTimeMillis() - currentTimeMillis2));
        }
    }
}
