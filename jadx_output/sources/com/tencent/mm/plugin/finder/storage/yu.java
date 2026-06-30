package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yu f128410d = new com.tencent.mm.plugin.finder.storage.yu();

    public yu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "起播时 seek 使用精准 seek", "FINDER_START_PLAYING_TIME_ACCURATE_SEEK_ENABLE", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_start_playing_time_accurate_seek_enable, false, 2, null);
        return aVar;
    }
}
