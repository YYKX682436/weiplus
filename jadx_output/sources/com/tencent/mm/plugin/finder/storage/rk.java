package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class rk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.rk f127497d = new com.tencent.mm.plugin.finder.storage.rk();

    public rk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10000, "直播和附近预拉取超时时间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_waiting_preload_timeout_ms, false, 2, null);
        aVar.a("NEARBY_WAITING_PRELOAD_TIMEOUT_MS", kz5.c0.i(5000, 10000, 30000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), kz5.c0.i("默认(10s)", "5s", "10s", "30s", "1min"));
        return aVar;
    }
}
