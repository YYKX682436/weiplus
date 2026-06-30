package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p3 f127346d = new com.tencent.mm.plugin.finder.storage.p3();

    public p3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, "视频号app push 延迟时间", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_app_push_delay_show_ms, false, 2, null);
        aVar.a("FINDER_APP_PUSH_DELAY_SETTING", kz5.c0.i(5000, 10000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), kz5.c0.i("5s", "10s", "60s"));
        return aVar;
    }
}
