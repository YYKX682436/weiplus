package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass17 f211208d;

    public w4(com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass17 anonymousClass17) {
        this.f211208d = anonymousClass17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.FindMoreFriendsUI.AnonymousClass17 anonymousClass17 = this.f211208d;
        if (com.tencent.mm.ui.FindMoreFriendsUI.this.isAdded()) {
            com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = com.tencent.mm.ui.FindMoreFriendsUI.this;
            java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
            findMoreFriendsUI.A0();
        }
    }
}
