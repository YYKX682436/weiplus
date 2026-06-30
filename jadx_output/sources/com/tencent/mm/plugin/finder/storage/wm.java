package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wm f128262d = new com.tencent.mm.plugin.finder.storage.wm();

    public wm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "竖屏视频长按倍速播放", null, null, 12, null);
        aVar.a("FINDER_PORTRAIT_VIDEO_LONG_PRESS_SPEED_PLAY", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_portrait_video_long_press_speed_play, false, 2, null);
        return aVar;
    }
}
