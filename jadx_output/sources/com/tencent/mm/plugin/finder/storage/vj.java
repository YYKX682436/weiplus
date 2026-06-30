package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vj f128201d = new com.tencent.mm.plugin.finder.storage.vj();

    public vj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(48, "音乐轮播气泡同原声id展示间隔限制(小时)", null, null, 12, null);
        aVar.a("FINDER_MUSIC_DESC_CAROUSEL_SAME_SONG_LIMIT_HOUR", kz5.c0.i(48, 24, 1), kz5.c0.i("48", "24", "1"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_music_desc_carousel_same_song_limit_hour, false, 2, null);
        return aVar;
    }
}
