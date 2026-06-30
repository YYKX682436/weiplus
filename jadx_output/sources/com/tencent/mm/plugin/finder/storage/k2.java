package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k2 f127042d = new com.tencent.mm.plugin.finder.storage.k2();

    public k2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "长视频播放器退出是否自动小窗", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_ENABLE_AUTO_MINI_WINDOW", kz5.c0.i(0, 1, 2), kz5.c0.i("否", "生成听浮窗", "生成动态浮窗"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_enable_auto_float_ball, false, 2, null);
        return aVar;
    }
}
