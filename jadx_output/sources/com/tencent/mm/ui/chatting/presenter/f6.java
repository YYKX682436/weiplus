package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202220i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202221m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.c6 f202222n;

    public f6(com.tencent.mm.ui.chatting.presenter.c6 c6Var, int i17, int i18, java.util.Map map, java.util.List list, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202222n = c6Var;
        this.f202215d = i17;
        this.f202216e = i18;
        this.f202217f = map;
        this.f202218g = list;
        this.f202219h = a3Var;
        this.f202220i = concurrentLinkedQueue;
        this.f202221m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.n6 p17;
        com.tencent.mm.ui.chatting.presenter.c6 c6Var = this.f202222n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202221m;
        try {
            for (int i17 = this.f202215d; i17 < this.f202216e && !c6Var.f202152t.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202217f.get(this.f202218g.get(i17));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.c6.p(c6Var, f9Var, this.f202219h)) != null) {
                    this.f202220i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
