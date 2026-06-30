package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ni extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ni f127256d = new com.tencent.mm.plugin.finder.storage.ni();

    public ni() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "看一看长视频文件缓存", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_CACHE_PAGE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_cache_page, false, 2, null);
        return aVar;
    }
}
