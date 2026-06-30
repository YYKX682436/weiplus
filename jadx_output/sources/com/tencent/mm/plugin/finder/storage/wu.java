package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wu f128270d = new com.tencent.mm.plugin.finder.storage.wu();

    public wu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "根据播放速度调整缓冲区", "FINDER_SPEED_PLAY_BUF_CTRL", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_speed_play_buf_ctrl, false, 2, null);
        return aVar;
    }
}
