package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ii0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ii0 f126954d = new com.tencent.mm.plugin.finder.storage.ii0();

    public ii0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号外部收到timeline tab红点丢弃策略", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_tab_red_dot_drop_outer, false, 2, null);
        aVar.a("FINDER_TAB_DROP_TAB_RED_DOT_OUTER", kz5.c0.i(0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048), kz5.c0.i("不丢弃", "关注红点丢弃朋友", "关注红点丢弃推荐", "朋友红点丢弃关注", "朋友红点丢弃推荐", "推荐红点丢弃关注", "推荐红点丢弃朋友", "关注红点丢弃同城", "朋友红点丢弃同城", "推荐红点丢弃同城", "同城红点丢弃朋友", "同城红点丢弃关注", "同城红点丢弃推荐"));
        return aVar;
    }
}
