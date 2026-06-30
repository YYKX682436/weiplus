package com.tencent.mm.plugin.ipcall;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.c f142434d;

    public a(com.tencent.mm.plugin.ipcall.c cVar) {
        this.f142434d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.GetMFriendEvent getMFriendEvent = new com.tencent.mm.autogen.events.GetMFriendEvent();
        getMFriendEvent.f54403g.f6555a = 2;
        getMFriendEvent.e();
        java.lang.System.currentTimeMillis();
        this.f142434d.getClass();
    }
}
