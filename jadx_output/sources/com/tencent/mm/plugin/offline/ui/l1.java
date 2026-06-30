package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SyncOfflineTokenEvent f152665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152666e;

    public l1(com.tencent.mm.plugin.offline.ui.m1 m1Var, com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent, boolean z17) {
        this.f152665d = syncOfflineTokenEvent;
        this.f152666e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f152665d.f54875g.getClass();
        to3.c0.Ai().Ui().e(this.f152666e);
    }
}
