package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sj f127554d = new com.tencent.mm.plugin.finder.storage.sj();

    public sj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(60, "音乐轮播出现时间 ≥60s的视频：配置播放的时长", null, null, 12, null);
        aVar.a("FINDER_MUSIC_CAROUSEL_LONG_SHOW_CONFIG", kz5.c0.i(60, 80, 100), kz5.c0.i("60(默认)", "80", "100"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_long_show_carousel_progress_config_android, false, 2, null);
        return aVar;
    }
}
