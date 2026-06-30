package lx;

/* loaded from: classes9.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f321996e;

    public w3(yz5.l lVar, java.util.List list) {
        this.f321995d = lVar;
        this.f321996e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f321996e;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(obj, yw.r3.f466450a.a((java.lang.String) obj, true));
        }
        this.f321995d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.c1.t(linkedHashMap))));
    }
}
