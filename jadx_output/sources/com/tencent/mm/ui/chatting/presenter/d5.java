package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m5 f202174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202176h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202177i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202178m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202179n;

    public d5(int i17, int i18, com.tencent.mm.ui.chatting.presenter.m5 m5Var, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202172d = i17;
        this.f202173e = i18;
        this.f202174f = m5Var;
        this.f202175g = list;
        this.f202176h = map;
        this.f202177i = a3Var;
        this.f202178m = concurrentLinkedQueue;
        this.f202179n = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.z4 p17;
        com.tencent.mm.ui.chatting.presenter.m5 m5Var = this.f202174f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202179n;
        try {
            for (int i17 = this.f202172d; i17 < this.f202173e && !m5Var.f202348s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202176h.get(java.lang.Long.valueOf(((java.lang.Number) this.f202175g.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.m5.p(m5Var, f9Var, this.f202177i)) != null) {
                    this.f202178m.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
