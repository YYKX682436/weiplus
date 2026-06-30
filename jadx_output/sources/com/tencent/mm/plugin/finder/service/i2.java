package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f126076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126077f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f126078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f126079h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(int i17, long j17, com.tencent.mm.plugin.finder.service.l2 l2Var, int i18, int i19) {
        super(0);
        this.f126075d = i17;
        this.f126076e = j17;
        this.f126077f = l2Var;
        this.f126078g = i18;
        this.f126079h = i19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
        int i17 = this.f126075d;
        sb6.append(i17);
        sb6.append(' ');
        long j17 = this.f126076e;
        sb6.append(pm0.v.u(j17));
        com.tencent.mars.xlog.Log.i("FinderFeedDetailService", sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        boolean z17 = h17 == null || !h17.isUrlValid();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        int i18 = this.f126079h;
        com.tencent.mm.plugin.finder.service.l2 l2Var = this.f126077f;
        if (z17) {
            java.lang.Runnable runnable = l2Var.f126117h;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = l2Var.f126118i;
            if (runnable != null) {
                copyOnWriteArraySet.add(java.lang.Long.valueOf(j17));
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed 聚合 commentScene:");
                sb7.append(i17);
                sb7.append(" feedId:");
                sb7.append(pm0.v.u(j17));
                sb7.append(" list:");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArraySet, 10));
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    kotlin.jvm.internal.o.d(l17);
                    arrayList.add(pm0.v.u(l17.longValue()));
                }
                sb7.append(arrayList);
                com.tencent.mars.xlog.Log.i("FinderFeedDetailService", sb7.toString());
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                copyOnWriteArraySet.add(java.lang.Long.valueOf(j17));
                com.tencent.mm.plugin.finder.service.h2 h2Var = new com.tencent.mm.plugin.finder.service.h2(l2Var, i17, this.f126078g, i18);
                l2Var.f126117h = h2Var;
                com.tencent.mm.sdk.platformtools.u3.i(h2Var, 300L);
            }
        } else if (h17 != null && (feedObject = h17.getFeedObject()) != null) {
            l2Var.f126114e.a(i17, kz5.b0.c(feedObject), i18);
        }
        return f0Var2;
    }
}
