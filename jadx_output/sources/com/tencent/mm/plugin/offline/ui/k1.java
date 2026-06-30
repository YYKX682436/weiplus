package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SyncOfflineTokenEvent f152659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152660e;

    public k1(com.tencent.mm.plugin.offline.ui.m1 m1Var, com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent, boolean z17) {
        this.f152659d = syncOfflineTokenEvent;
        this.f152660e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.offline.ui.j1(this));
    }
}
