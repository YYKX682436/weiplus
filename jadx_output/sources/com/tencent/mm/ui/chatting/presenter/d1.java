package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.o1 f202162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202165i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202166m;

    public d1(int i17, int i18, com.tencent.mm.ui.chatting.presenter.o1 o1Var, java.util.Map map, java.util.List list, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202160d = i17;
        this.f202161e = i18;
        this.f202162f = o1Var;
        this.f202163g = map;
        this.f202164h = list;
        this.f202165i = concurrentLinkedQueue;
        this.f202166m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.bu2 c17;
        com.tencent.mm.ui.chatting.presenter.o1 o1Var = this.f202162f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202166m;
        try {
            for (int i17 = this.f202160d; i17 < this.f202161e && !o1Var.f202394m.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202163g.get(this.f202164h.get(i17));
                if (f9Var != null && (c17 = com.tencent.mm.ui.chatting.presenter.o1.c(o1Var, f9Var)) != null) {
                    this.f202165i.add(c17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
