package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lk f127144d = new com.tencent.mm.plugin.finder.storage.lk();

    public lk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否打开附近双流预加载", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_feed_stream_preload, false, 2, null);
        aVar.a("FINDER_NEARBY_FEED_STREAM_PRELOAD", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
