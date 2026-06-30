package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class de0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.de0 f126647d = new com.tencent.mm.plugin.finder.storage.de0();

    public de0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "DSL红点展示不下时是否允许丢弃", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_drop_dsl_when_over_size, false, 2, null);
        aVar.a("FINDER_ENABLE_DROP_DSL_REDDOT_WHEN_OVER_SIZE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
