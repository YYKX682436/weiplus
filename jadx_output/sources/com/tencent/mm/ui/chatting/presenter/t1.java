package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f202477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202478i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202479m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.p1 f202480n;

    public t1(com.tencent.mm.ui.chatting.presenter.p1 p1Var, int i17, int i18, java.util.Map map, java.util.List list, boolean z17, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202480n = p1Var;
        this.f202473d = i17;
        this.f202474e = i18;
        this.f202475f = map;
        this.f202476g = list;
        this.f202477h = z17;
        this.f202478i = concurrentLinkedQueue;
        this.f202479m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.y1 q17;
        com.tencent.mm.ui.chatting.presenter.p1 p1Var = this.f202480n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202479m;
        try {
            for (int i17 = this.f202473d; i17 < this.f202474e && !p1Var.f202419s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202475f.get(this.f202476g.get(i17));
                if (f9Var != null && (q17 = com.tencent.mm.ui.chatting.presenter.p1.q(p1Var, f9Var, this.f202477h)) != null) {
                    this.f202478i.add(q17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
