package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ui extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ui f128141d = new com.tencent.mm.plugin.finder.storage.ui();

    public ui() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ob2.a aVar = new ob2.a(0, "看一看长视频浮窗自动续播", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_FLOAT_BALL_FETCH_CONTINUE_PLAY", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_minimize_fetch_continue_play, false, 2, null);
        return aVar;
    }
}
