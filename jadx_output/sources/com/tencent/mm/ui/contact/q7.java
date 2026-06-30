package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment f207138d;

    public q7(com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f207138d = openIMAddressUIFragment;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(10);
        int i17 = com.tencent.mm.ui.contact.OpenIMAddressUI.OpenIMAddressUIFragment.f206517v;
        this.f207138d.n0();
    }
}
