package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class eh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.eh0 f126714d = new com.tencent.mm.plugin.finder.storage.eh0();

    public eh0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "曝光n次不点击sync是否从进入发现页改为离开发现页", "FINDER_RED_DOT_SYNC_WHEN_QUIT_FIND_TAB", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_reddot_sync_when_quit_find_tab, false, 2, null);
        return aVar;
    }
}
