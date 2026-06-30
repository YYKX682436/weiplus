package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class iz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.iz f126970d = new com.tencent.mm.plugin.finder.storage.iz();

    public iz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, "评论区半屏有缓存时重拉取最小间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_comment_refresh_min_interval_android, false, 2, null);
        aVar.a("FinderCommentRefreshMinInterval", kz5.c0.i(0, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), kz5.c0.i("不设限", "60s"));
        return aVar;
    }
}
