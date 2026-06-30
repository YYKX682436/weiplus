package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class h70 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.h70 f126876d = new com.tencent.mm.plugin.finder.storage.h70();

    public h70() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10, "刚刚看过客户端保护最大请求数", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_just_watch_request_count, false, 2, null);
        return aVar;
    }
}
