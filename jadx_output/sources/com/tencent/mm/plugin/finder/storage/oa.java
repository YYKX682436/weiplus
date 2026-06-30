package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oa f127301d = new com.tencent.mm.plugin.finder.storage.oa();

    public oa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(14L);
        pb2.a aVar = new pb2.a(millis, "视频号自动上滑提示气泡频控", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_display_auto_play_tips_time_long_limit, false, 2, null);
        aVar.a("FINDER_DISPLAY_AUTO_PLAY_TIPS_TIME_LONG_LIMIT", kz5.c0.i(0L, java.lang.Long.valueOf(millis)), kz5.c0.i("0天", "14天(1209600000毫秒)"));
        return aVar;
    }
}
