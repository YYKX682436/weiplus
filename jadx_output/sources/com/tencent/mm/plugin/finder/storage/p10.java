package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p10 f127343d = new com.tencent.mm.plugin.finder.storage.p10();

    public p10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "关注流有封面不自动播放", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_two_flow_abort_play_of_cover, false, 2, null);
        aVar.a("FinderTwoFlowAbortPlayOfCover", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
