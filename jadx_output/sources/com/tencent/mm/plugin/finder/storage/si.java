package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class si extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.si f127552d = new com.tencent.mm.plugin.finder.storage.si();

    public si() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(15L, "看一看长视频详情页拉取续时机,剩余播放时间秒", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_fetch_continue_play_time, false, 2, null);
        aVar.a("FFINDER_MEGA_VIDEO_FETCH_CONTINUE_PLAY_TIME_SECONDS", kz5.c0.i(10L, 15L, 20L), kz5.c0.i("10s", "15s", "20s"));
        return aVar;
    }
}
