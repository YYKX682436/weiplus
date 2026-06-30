package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pn f127384d = new com.tencent.mm.plugin.finder.storage.pn();

    public pn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "帐号首次发表需要微信支付实名授权", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_real_name_auth_enable, false, 2, null);
        aVar.a("FINDER_POST_REAL_NAME_AUTH_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        return aVar;
    }
}
