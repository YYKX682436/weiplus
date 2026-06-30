package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lv f127155d = new com.tencent.mm.plugin.finder.storage.lv();

    public lv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "视频号streamCGI不带单流markread", "FINDER_STREAM_REQUEST_NO_READ_STATS", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_stream_request_no_read_stats, false, 2, null);
        return aVar;
    }
}
