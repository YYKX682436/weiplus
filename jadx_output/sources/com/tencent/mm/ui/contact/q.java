package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207124d;

    public q(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207124d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f207124d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AddressUI", "rcontact db init select count: %d", java.lang.Integer.valueOf(addressUIFragment.f206309q.getCount()));
        addressUIFragment.f206307o.post(new com.tencent.mm.ui.contact.p(this));
        addressUIFragment.f206310r.y(false);
    }
}
