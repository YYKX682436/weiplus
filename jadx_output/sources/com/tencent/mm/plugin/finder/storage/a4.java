package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a4 f126382d = new com.tencent.mm.plugin.finder.storage.a4();

    public a4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(60, "音乐聚合页发视频加载音轨超时时间", null, null, 12, null);
        aVar.a("FINDER_AUDIO_TRACK_LOAD_TIMEOUT", kz5.c0.i(5, 60, 120), kz5.c0.i("5s", "60s", "120s"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_music_follow_pat_load_audio_duration, false, 2, null);
        return aVar;
    }
}
