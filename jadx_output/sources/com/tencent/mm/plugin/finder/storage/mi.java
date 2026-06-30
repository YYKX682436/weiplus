package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mi f127199d = new com.tencent.mm.plugin.finder.storage.mi();

    public mi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "看一看长视频自动播放", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_AUTOPLAY", kz5.c0.i(0, 1, 2), kz5.c0.i("否", "静音播放", "播放（音量）"));
        aVar.c(e42.c0.clicfg_finder_top_story_mega_video_autoplay, false);
        return aVar;
    }
}
