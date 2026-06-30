package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xt f128326d = new com.tencent.mm.plugin.finder.storage.xt();

    public xt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "分享场景展示历史 feed", "FINDER_SHOW_HISTORY_FEED_ENABLE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_share_remind_feed_cache, false, 2, null);
        return aVar;
    }
}
