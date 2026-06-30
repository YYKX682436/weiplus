package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class t00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.t00 f127575d = new com.tencent.mm.plugin.finder.storage.t00();

    public t00() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "视频号合集接入跳转器开关", "FinderPlayListWithJumper", null);
        aVar.c(e42.c0.clicfg_finder_playlist_jumper_enable_android, false);
        return aVar;
    }
}
