package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ub0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ub0 f128128d = new com.tencent.mm.plugin.finder.storage.ub0();

    public ub0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(6, "发表失败红点曝光次数上限", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_post_fail_reddot_expose_limit, false);
        aVar.a("FINDER_POST_FAIL_REDDOT_EXPOSE_LIMIT", kz5.c0.i(6, 100), kz5.c0.i("6次", "100次"));
        return aVar;
    }
}
