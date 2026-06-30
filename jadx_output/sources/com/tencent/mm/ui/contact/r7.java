package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207157d;

    public r7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207157d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.b8 b8Var = this.f207157d.f206520f;
        com.tencent.mars.xlog.Log.i(b8Var.f209017d, "newcursor resume ");
        b8Var.f209018e = true;
        b8Var.a("resume", true);
    }
}
