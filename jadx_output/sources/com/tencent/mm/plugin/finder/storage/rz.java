package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class rz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.rz f127512d = new com.tencent.mm.plugin.finder.storage.rz();

    public rz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.0f, "关注双流曝光上报最低比例");
        lb2.j.d(dVar, e42.d0.clicfg_finder_follow_mark_read_percent, false, 2, null);
        dVar.a("FinderFollowFlowMarkReadPercent", kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.3f), java.lang.Float.valueOf(0.0f)), kz5.c0.i("50%", "30%", "0%"));
        return dVar;
    }
}
