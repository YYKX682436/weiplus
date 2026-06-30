package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n60 f127231d = new com.tencent.mm.plugin.finder.storage.n60();

    public n60() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "follow_n_r_p_i_interval", null, null, 12, null);
        aVar.a("follow_no_reddot_prefetch_inner_interval", new java.util.ArrayList(kz5.c0.i(-1, 0, 10000, 10000, 30000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL))), kz5.c0.i("默认", "0s", "10s", "20s", "30s", "1min"));
        return aVar;
    }
}
