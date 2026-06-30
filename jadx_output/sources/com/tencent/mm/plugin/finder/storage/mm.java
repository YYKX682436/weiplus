package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mm f127204d = new com.tencent.mm.plugin.finder.storage.mm();

    public mm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2, "视频播放新样式卡顿动画延迟(秒)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_player_loading_delay_switch, false, 2, null);
        aVar.a("FINDER_PLAYER_LOADING_SWITCH", kz5.c0.i(0, 1, 2, 3, 4), kz5.c0.i("0", "1", "2", "3", "4"));
        return aVar;
    }
}
