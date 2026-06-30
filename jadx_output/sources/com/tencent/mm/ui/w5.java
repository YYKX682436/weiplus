package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class w5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f211209d;

    public w5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f211209d = findMoreFriendsUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f211209d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "status %d (%d), extStatus %d (%d), pluginFlag %d (%d)", java.lang.Integer.valueOf(findMoreFriendsUI.N), java.lang.Integer.valueOf(c01.z1.p()), java.lang.Long.valueOf(findMoreFriendsUI.P), java.lang.Long.valueOf(c01.z1.j()), java.lang.Integer.valueOf(findMoreFriendsUI.Q), java.lang.Integer.valueOf(c01.z1.n()));
        findMoreFriendsUI.P = c01.z1.j();
        findMoreFriendsUI.N = c01.z1.p();
        findMoreFriendsUI.Q = c01.z1.n();
        findMoreFriendsUI.R = c01.z1.h();
        findMoreFriendsUI.D1();
    }
}
