package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202485g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202486h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202487i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202488m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o3 f202489n;

    public t3(com.tencent.mm.ui.chatting.presenter.o3 o3Var, int i17, int i18, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202489n = o3Var;
        this.f202482d = i17;
        this.f202483e = i18;
        this.f202484f = list;
        this.f202485g = map;
        this.f202486h = a3Var;
        this.f202487i = concurrentLinkedQueue;
        this.f202488m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.a4 r17;
        com.tencent.mm.ui.chatting.presenter.o3 o3Var = this.f202489n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202488m;
        try {
            for (int i17 = this.f202482d; i17 < this.f202483e && !o3Var.f202406s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202485g.get(java.lang.Long.valueOf(((java.lang.Long) this.f202484f.get(i17)).longValue()));
                if (f9Var != null && (r17 = com.tencent.mm.ui.chatting.presenter.o3.r(o3Var, f9Var, this.f202486h)) != null) {
                    this.f202487i.add(r17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
