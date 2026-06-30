package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f202263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m4 f202264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f202265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.a3 f202267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f202269n;

    public i4(int i17, int i18, com.tencent.mm.ui.chatting.presenter.m4 m4Var, java.util.HashMap hashMap, java.util.List list, com.tencent.mm.storage.a3 a3Var, java.util.List list2, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f202262d = i17;
        this.f202263e = i18;
        this.f202264f = m4Var;
        this.f202265g = hashMap;
        this.f202266h = list;
        this.f202267i = a3Var;
        this.f202268m = list2;
        this.f202269n = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.presenter.d4 p17;
        com.tencent.mm.ui.chatting.presenter.m4 m4Var = this.f202264f;
        java.util.concurrent.CountDownLatch countDownLatch = this.f202269n;
        try {
            for (int i17 = this.f202262d; i17 < this.f202263e && !m4Var.f202346t.get(); i17++) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) this.f202265g.get(this.f202266h.get(i17));
                if (f9Var != null && (p17 = com.tencent.mm.ui.chatting.presenter.m4.p(m4Var, f9Var, this.f202267i)) != null) {
                    this.f202268m.add(p17);
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
