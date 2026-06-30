package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yw f128412d = new com.tencent.mm.plugin.finder.storage.yw();

    public yw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300000, "3tab流自动刷新缓存时间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_timeline_refresh_expired, false, 2, null);
        aVar.a("AUTO_REEFRESH_CACHE_INTERVAL", kz5.c0.i(300000, 10000, 30000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), kz5.c0.i("默认(5min)", "10s", "30s", "1min"));
        aVar.f317745p = "常用";
        return aVar;
    }
}
