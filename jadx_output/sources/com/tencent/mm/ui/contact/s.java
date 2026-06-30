package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207162d;

    public s(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207162d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.e eVar = this.f207162d.f206309q;
        com.tencent.mars.xlog.Log.i(eVar.f209017d, "newcursor resume ");
        eVar.f209018e = true;
        eVar.a("resume", true);
    }
}
