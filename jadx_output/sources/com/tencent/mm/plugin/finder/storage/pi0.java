package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pi0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pi0 f127376d = new com.tencent.mm.plugin.finder.storage.pi0();

    public pi0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发现页没红点，是否默认跳热门", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_is_jump_hot_without_entrance_reddot, false, 2, null);
        aVar.a("IS_HARD_JUMP_HOT_WITHOUT_ENTRANCE_REDDOT", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
