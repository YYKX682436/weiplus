package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202466i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202467m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.b6 f202468n;

    public s5(com.tencent.mm.ui.chatting.presenter.b6 b6Var, int i17, int i18, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202468n = b6Var;
        this.f202461d = i17;
        this.f202462e = i18;
        this.f202463f = list;
        this.f202464g = map;
        this.f202465h = a3Var;
        this.f202466i = concurrentLinkedQueue;
        this.f202467m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.z5 p17;
        com.tencent.mm.ui.chatting.presenter.b6 b6Var = this.f202468n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202467m;
        try {
            for (int i17 = this.f202461d; i17 < this.f202462e && !b6Var.f202139s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202464g.get(java.lang.Long.valueOf(((java.lang.Long) this.f202463f.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.b6.p(b6Var, f9Var, this.f202465h)) != null) {
                    this.f202466i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
