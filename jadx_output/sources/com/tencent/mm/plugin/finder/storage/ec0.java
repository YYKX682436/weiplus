package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ec0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ec0 f126704d = new com.tencent.mm.plugin.finder.storage.ec0();

    public ec0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表时拉取实名失败放过拦截实名开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_precheck_pass_get_real_name_fail, false, 2, null);
        aVar.a("FINDER_POST_PRECHECK_PASS_GET_REAL_NAME_FAIL", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
