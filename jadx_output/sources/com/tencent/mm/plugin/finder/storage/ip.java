package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ip extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ip f126961d = new com.tencent.mm.plugin.finder.storage.ip();

    public ip() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "全屏profile三列流", null, null, 12, null);
        aVar.a("FINDER_PROFILE_THREE_COL_GRID_LAYOUT", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_profile_three_col_grid_layout, false, 2, null);
        return aVar;
    }
}
