package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f202183g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202184h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedQueue f202185i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n f202187n;

    public e(com.tencent.mm.ui.chatting.presenter.n nVar, int i17, int i18, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202187n = nVar;
        this.f202180d = i17;
        this.f202181e = i18;
        this.f202182f = list;
        this.f202183g = map;
        this.f202184h = a3Var;
        this.f202185i = concurrentLinkedQueue;
        this.f202186m = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.presenter.l r17;
        com.tencent.mm.ui.chatting.presenter.n nVar = this.f202187n;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202186m;
        try {
            for (int i17 = this.f202180d; i17 < this.f202181e && !nVar.f202352s.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202183g.get(java.lang.Long.valueOf(((java.lang.Long) this.f202182f.get(i17)).longValue()));
                if (f9Var != null && (r17 = com.tencent.mm.ui.chatting.presenter.n.r(nVar, f9Var, this.f202184h)) != null) {
                    this.f202185i.add(r17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
