package zv;

/* loaded from: classes9.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f475925e;

    public c3(yz5.l lVar, java.util.List list) {
        this.f475924d = lVar;
        this.f475925e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f475925e;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list) {
            java.lang.String userName = (java.lang.String) obj;
            kotlin.jvm.internal.o.g(userName, "userName");
            com.tencent.pigeon.biz_base.OftenReadAccountInfo oftenReadAccountInfo = new com.tencent.pigeon.biz_base.OftenReadAccountInfo(yw.h1.f466332a.h(userName), null, null, 6, null);
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(userName);
            if ((p17 != null ? p17.d1() : 0) > 0) {
                oftenReadAccountInfo = com.tencent.pigeon.biz_base.OftenReadAccountInfo.copy$default(oftenReadAccountInfo, null, java.lang.Boolean.TRUE, null, 5, null);
            }
            linkedHashMap.put(obj, oftenReadAccountInfo);
        }
        this.f475924d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.c1.t(linkedHashMap))));
    }
}
