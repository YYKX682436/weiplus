package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.l2 f202193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f202196i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202199o;

    public e2(int i17, int i18, com.tencent.mm.ui.chatting.presenter.l2 l2Var, java.util.Map map, java.util.List list, boolean z17, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202191d = i17;
        this.f202192e = i18;
        this.f202193f = l2Var;
        this.f202194g = map;
        this.f202195h = list;
        this.f202196i = z17;
        this.f202197m = a3Var;
        this.f202198n = concurrentLinkedQueue;
        this.f202199o = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.a2 p17;
        com.tencent.mm.ui.chatting.presenter.l2 l2Var = this.f202193f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202199o;
        try {
            for (int i17 = this.f202191d; i17 < this.f202192e && !l2Var.f202324s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202194g.get(this.f202195h.get(i17));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.l2.p(l2Var, f9Var, this.f202196i, this.f202197m)) != null) {
                    this.f202198n.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
