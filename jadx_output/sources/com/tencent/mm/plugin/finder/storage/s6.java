package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s6 f127526d = new com.tencent.mm.plugin.finder.storage.s6();

    public s6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "深后台清理首页文件缓存", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_clear_first_page_cache_enable, false, 2, null);
        aVar.f317743n = com.tencent.mm.plugin.finder.storage.r6.f127468d;
        aVar.a("FINDER_CLEAR_FIRST_PAGE_CACHE", kz5.c0.i(0, 1), kz5.c0.i("关闭️", "打开"));
        return aVar;
    }
}
