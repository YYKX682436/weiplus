package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hp f126905d = new com.tencent.mm.plugin.finder.storage.hp();

    public hp() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "profile的tab优先级排序开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_profile_tab_sort_switch, false, 2, null);
        aVar.a("FINDER_PROFILE_TAB_SORT_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
