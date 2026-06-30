package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v3 f128167d = new com.tencent.mm.plugin.finder.storage.v3();

    public v3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "异步CreateView+BindView", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_async_bind_view_enable, false, 2, null);
        aVar.a("FINDER_ASYNC_BIND_VIEW_ENABLE", kz5.c0.i(0, 1, 2, -1), kz5.c0.i("关闭", "打开", "Debug模式", "只留异步CreateView"));
        aVar.f317743n = com.tencent.mm.plugin.finder.storage.u3.f128113d;
        aVar.f317745p = "滑动流畅优化";
        return aVar;
    }
}
