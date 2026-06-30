package zv;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.l8 f475918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f475919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f475920f;

    public c(com.tencent.mm.storage.l8 l8Var, java.util.ArrayList arrayList, kotlin.jvm.internal.h0 h0Var) {
        this.f475918d = l8Var;
        this.f475919e = arrayList;
        this.f475920f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zv.l lVar = zv.l.f476016a;
        ((com.tencent.mm.storage.m4) this.f475918d).Q((java.lang.String[]) kz5.n0.t0(this.f475919e, zv.l.a(lVar, (java.util.List) this.f475920f.f310123d)).toArray(new java.lang.String[0]), "service_officialaccounts", true, true);
        lVar.d().putBoolean("key_mmkv_had_enable_brand_service_entry_2", true);
    }
}
