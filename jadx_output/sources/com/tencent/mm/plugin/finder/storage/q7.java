package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q7 f127413d = new com.tencent.mm.plugin.finder.storage.q7();

    public q7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "请求后更新合集", "FINDER_COLLECTION_REFRESH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_collection_refresh, false, 2, null);
        return aVar;
    }
}
