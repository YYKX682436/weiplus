package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class of extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.of f127311d = new com.tencent.mm.plugin.finder.storage.of();

    public of() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "(新)切tab时如果有预加载直接显示", null, null, 12, null);
        aVar.a("FINDER_HOME_SHOW_PRELOAD_RESULT_WHEN_SWITCH_TAB_NEW", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_home_show_preload_when_switch_tab_new, false, 2, null);
        return aVar;
    }
}
