package l91;

/* loaded from: classes4.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f317264e = l91.a.f317262s;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f317265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, l91.a.f317261r, "AppBrandPrefetchWxaAttrsMarkTable", dm.d0.f236278h);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f317265d = db6;
    }

    public final void y0(java.util.List usernameList) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f317265d;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!(str == null || str.length() == 0)) {
                z0(new l91.b(str));
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }

    public final void z0(l91.c key) {
        kotlin.jvm.internal.o.g(key, "key");
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        l91.a aVar = new l91.a();
        aVar.field_prefetchUpdateTime = i17;
        if (key instanceof l91.b) {
            java.lang.String str = ((l91.b) key).f317263a;
            aVar.field_username = str;
            aVar.field_appId = k91.k4.e(str);
        }
        super.replace(aVar);
    }
}
