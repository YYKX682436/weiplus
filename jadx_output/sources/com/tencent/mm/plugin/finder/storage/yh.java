package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yh f128389d = new com.tencent.mm.plugin.finder.storage.yh();

    public yh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        pb2.a aVar = new pb2.a(millis, "锁屏播放器自动消失时间", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_lock_screen_player_hide_time_millis, false, 2, null);
        aVar.a("FINDER_LOCK_SCREEN_PLAYER_HIDE_TIME_MILLIS", kz5.c0.i(-1L, java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(10L)), java.lang.Long.valueOf(millis)), kz5.c0.i("不消失", "10秒", "1分钟"));
        return aVar;
    }
}
