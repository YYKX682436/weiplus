package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y30 f128341d = new com.tencent.mm.plugin.finder.storage.y30();

    public y30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "实名点赞", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_real_name_like, false, 2, null);
        aVar.a("REAL_NAME_LIKE_CONFIG", kz5.c0.i(1, 2), kz5.c0.i("实名点赞", "非实名点赞"));
        return aVar;
    }
}
