package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class km extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.km f127081d = new com.tencent.mm.plugin.finder.storage.km();

    public km() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "播放器缓冲超时", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_player_buffering_timeout_ms, false, 2, null);
        return aVar;
    }
}
