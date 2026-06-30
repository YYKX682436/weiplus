package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ti extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ti f128088d = new com.tencent.mm.plugin.finder.storage.ti();

    public ti() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "看一看长视频首次安装是否允许预加载", null, null, 12, null);
        aVar.a("FFINDER_MEGA_VIDEO_FIRST_INSTALL_ENABLE_PRELOAD", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_first_install_enable_prelaod, false, 2, null);
        return aVar;
    }
}
