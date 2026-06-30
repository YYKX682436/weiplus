package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ex extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ex f126733d = new com.tencent.mm.plugin.finder.storage.ex();

    public ex() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(0L, "视频号TimeLine首帧前睡眠时间(单位:毫秒)", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_time_line_sleep_time_ms_before_first_frame, false, 2, null);
        aVar.a("FINDER_TIME_LINE_SLEEP_TIME_MS_BEFORE_FIRST_FRAME", kz5.c0.i(0L, 500L, 1000L, 3000L), kz5.c0.i("0毫秒", "500毫秒", "1000毫秒", "3000毫秒"));
        return aVar;
    }
}
