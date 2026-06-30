package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207033d;

    public n(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207033d = addressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f207033d;
        com.tencent.mm.ui.contact.e eVar = addressUIFragment.f206309q;
        eVar.getClass();
        eVar.n(null, 1);
        com.tencent.mm.ui.contact.q3 q3Var = addressUIFragment.G;
        if (q3Var != null) {
            q3Var.b();
        }
    }
}
