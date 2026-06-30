package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l70 f127114d = new com.tencent.mm.plugin.finder.storage.l70();

    public l70() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "nearby_outter_vaild", null, null, 12, null);
        aVar.a("nearby_outter_prefetch_valid_time", new java.util.ArrayList(kz5.c0.i(-1, 0, 10000, 10000, 30000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL))), kz5.c0.i("默认", "0s", "10s", "20s", "30s", "1min"));
        return aVar;
    }
}
