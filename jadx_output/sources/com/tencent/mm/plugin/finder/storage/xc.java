package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xc f128301d = new com.tencent.mm.plugin.finder.storage.xc();

    public xc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "进入Finder点击时提前加载", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enter_prefetch_cgi_final, false, 2, null);
        aVar.a("FINDER_FINDER_ENTER_LOAD_SWITCH", kz5.c0.i(0, 1, 2), kz5.c0.i("默认", "打开", "关闭"));
        return aVar;
    }
}
