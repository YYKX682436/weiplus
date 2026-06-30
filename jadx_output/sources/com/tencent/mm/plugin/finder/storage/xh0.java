package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xh0 f128312d = new com.tencent.mm.plugin.finder.storage.xh0();

    public xh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否允许撤回发现页底部tab红点", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_revoke_finder_discovery_reddot, false, 2, null);
        aVar.a("FINDER_REVOKE_DISCOVERY_REDDOT_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
