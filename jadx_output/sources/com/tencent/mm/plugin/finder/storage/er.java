package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class er extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.er f126727d = new com.tencent.mm.plugin.finder.storage.er();

    public er() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "视频号是否允许scheme打开直播", "FINDER_SCHEME_OPEN_LIVE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_enable_external_schema_url_open_live, false, 2, null);
        return aVar;
    }
}
