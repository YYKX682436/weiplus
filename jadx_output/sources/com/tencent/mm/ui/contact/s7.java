package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207174d;

    public s7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207174d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.b8 b8Var = this.f207174d.f206520f;
        b8Var.S.clear();
        b8Var.f209018e = false;
        com.tencent.mars.xlog.Log.i(b8Var.f209017d, "new cursor pasue");
    }
}
