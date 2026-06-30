package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dr f126668d = new com.tencent.mm.plugin.finder.storage.dr();

    public dr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "视频号是否允许scheme打开feed", "FINDER_SCHEME_OPEN_FEED", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_sscheme_open_feed, false, 2, null);
        return aVar;
    }
}
