package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fu f126792d = new com.tencent.mm.plugin.finder.storage.fu();

    public fu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10, "视频静默播放次数限制", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_silent_play_limit_count, false, 2, null);
        aVar.a("FINDER_SILENT_PLAY_LIMIT_COUNT", kz5.c0.i(0, 2, 6, 10), kz5.c0.i("无限制", "2次", "6次", "10次"));
        return aVar;
    }
}
