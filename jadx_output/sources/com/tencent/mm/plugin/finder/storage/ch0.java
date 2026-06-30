package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ch0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ch0 f126588d = new com.tencent.mm.plugin.finder.storage.ch0();

    public ch0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "是否读取音频开关", "FINDER_RED_DOT_READ_LISTEN_AUDIO_SWITCH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_reddot_read_listen_audio_switch, false, 2, null);
        return aVar;
    }
}
