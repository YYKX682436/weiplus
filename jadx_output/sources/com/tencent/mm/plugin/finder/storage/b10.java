package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class b10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.b10 f126495d = new com.tencent.mm.plugin.finder.storage.b10();

    public b10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号profile同时发起userpage、homepage与header", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_profile_userpage_header_async_android, false, 2, null);
        aVar.a("FinderProfileAsyncRequestConfig", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("关闭", "开userpage", "开homepage", "全开"));
        return aVar;
    }
}
