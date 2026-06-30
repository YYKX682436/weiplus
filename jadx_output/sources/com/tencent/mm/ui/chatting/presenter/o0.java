package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202385i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.z0 f202387n;

    public o0(com.tencent.mm.ui.chatting.presenter.z0 z0Var, int i17, int i18, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202387n = z0Var;
        this.f202380d = i17;
        this.f202381e = i18;
        this.f202382f = list;
        this.f202383g = map;
        this.f202384h = a3Var;
        this.f202385i = concurrentLinkedQueue;
        this.f202386m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.w0 p17;
        com.tencent.mm.ui.chatting.presenter.z0 z0Var = this.f202387n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202386m;
        try {
            for (int i17 = this.f202380d; i17 < this.f202381e && !z0Var.f202572s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202383g.get(java.lang.Long.valueOf(((java.lang.Long) this.f202382f.get(i17)).longValue()));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.z0.p(z0Var, f9Var, this.f202384h)) != null) {
                    this.f202385i.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
