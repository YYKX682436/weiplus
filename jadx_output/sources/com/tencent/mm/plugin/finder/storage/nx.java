package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nx f127275d = new com.tencent.mm.plugin.finder.storage.nx();

    public nx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30000, "退后台回收所有播放器时间间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_trim_all_video_view_background_interval_ms, false, 2, null);
        aVar.a("FINDER_TRIM_ALL_VIDEO_VIEW_BACKGROUND_INTERVAL_MS", kz5.c0.i(-1, 0, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), 180000), kz5.c0.i("不回收", "立即回收", "退后台1分钟", "退后台3分钟"));
        return aVar;
    }
}
