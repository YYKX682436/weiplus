package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nv f127273d = new com.tencent.mm.plugin.finder.storage.nv();

    public nv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "重排预拉取feed", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_stream_rerank_feed, false, 2, null);
        aVar.a("FINDER_STREAM_RERANK_FEED", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
