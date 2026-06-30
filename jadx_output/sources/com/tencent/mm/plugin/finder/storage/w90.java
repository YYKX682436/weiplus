package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes8.dex */
public final class w90 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f128237e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.v90.I, "FinderMapPoiInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f128238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.storage.v90.I, "FinderMapPoiInfo", dm.v4.f240549t);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.v90.I;
        this.f128238d = db6;
    }

    public final com.tencent.mm.plugin.finder.storage.v90 y0(java.lang.String poiId) {
        kotlin.jvm.internal.o.g(poiId, "poiId");
        p75.i0 i17 = dm.v4.f240547r.i();
        i17.f352657d = dm.v4.f240548s.j(poiId);
        i17.f352656c = "MicroMsg.SDK.BaseFinderMapPoiInfo";
        return (com.tencent.mm.plugin.finder.storage.v90) i17.a().o(this.f128238d, com.tencent.mm.plugin.finder.storage.v90.class);
    }
}
