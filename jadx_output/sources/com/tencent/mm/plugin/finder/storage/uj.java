package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uj f128143d = new com.tencent.mm.plugin.finder.storage.uj();

    public uj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "音乐轮播气泡展示次数限制(每天)", null, null, 12, null);
        aVar.a("FINDER_MUSIC_DESC_CAROUSEL_DAY_LIMIT_TIME", kz5.c0.i(3, 1, 0), kz5.c0.i("3", "1", "0"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_music_desc_carousel_day_limit_times, false, 2, null);
        return aVar;
    }
}
