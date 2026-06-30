package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xh f128311d = new com.tencent.mm.plugin.finder.storage.xh();

    public xh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(0L, "视频时长大于或等于n秒才出锁屏播放器", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_lock_screen_player_feed_duration_threshold, false, 2, null);
        aVar.a("FINDER_LOCK_SCREEN_PLAYER_FEED_DURATION_THRESHOLD", kz5.c0.i(0L, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MINUTES.toSeconds(5L))), kz5.c0.i("0秒", "5分钟"));
        return aVar;
    }
}
