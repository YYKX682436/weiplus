package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nf f127250d = new com.tencent.mm.plugin.finder.storage.nf();

    public nf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发现页进入时如果有预加载直接显示不loading", null, null, 12, null);
        aVar.a("FINDER_HOME_SHOW_PRELOAD_RESULT_DIRECTLY", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_home_show_preload_result_directly, false, 2, null);
        return aVar;
    }
}
