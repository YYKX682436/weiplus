package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zi f128457d = new com.tencent.mm.plugin.finder.storage.zi();

    public zi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        ob2.a aVar = new ob2.a(0, "看一看长视频详情页展示续播提示气泡", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_SHOW_CONTINUE_PLAY_DIALOG", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_show_continue_play_dialog, false, 2, null);
        return aVar;
    }
}
