package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vy f128216d = new com.tencent.mm.plugin.finder.storage.vy();

    public vy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10000, "发现页预渲染Buffer大小", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_find_page_pre_render_min_buffer, false, 2, null);
        aVar.a("FIND_PAGE_PRE_RENDER_MIN_BUF", kz5.c0.i(3000, 5000, 15000), kz5.c0.i("3s", "5s", "15s"));
        return aVar;
    }
}
