package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ub extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ub f128127d = new com.tencent.mm.plugin.finder.storage.ub();

    public ub() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "进入刷新时占位视频自动播放", null, null, 12, null);
        aVar.a("FINDER_ENTER_REFRESH_PLAY_PLACEHOLDER_VIDEO", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_enter_refresh_play_placeholder_video, false, 2, null);
        return aVar;
    }
}
