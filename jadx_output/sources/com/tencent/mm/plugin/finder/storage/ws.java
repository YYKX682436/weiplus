package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ws extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ws f128268d = new com.tencent.mm.plugin.finder.storage.ws();

    public ws() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "分享流跳转视频号默认Tab", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_jump_home_default_tab, false, 2, null);
        aVar.a("debugShareJumpHomeDefaultTab", kz5.c0.i(0, 1, 2), kz5.c0.i("关注", "朋友", "推荐"));
        return aVar;
    }
}
