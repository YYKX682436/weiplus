package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gu f126855d = new com.tencent.mm.plugin.finder.storage.gu();

    public gu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(60000L, "视频静默播放时长限制", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_silent_play_limit_duration, false, 2, null);
        aVar.a("FINDER_SILENT_PLAY_LIMIT_TIME", kz5.c0.i(0L, 15000L, 60000L, 600000L), kz5.c0.i("无限制", "15s", "1min", "10min"));
        return aVar;
    }
}
