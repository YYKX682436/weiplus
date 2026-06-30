package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207201d;

    public u(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207201d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.e eVar = this.f207201d.f206309q;
        eVar.S.clear();
        eVar.f209018e = false;
        com.tencent.mars.xlog.Log.i(eVar.f209017d, "new cursor pasue");
    }
}
