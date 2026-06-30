package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nn f127265d = new com.tencent.mm.plugin.finder.storage.nn();

    public nn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表选择位置打开POI半屏开关", null, null, 12, null);
        aVar.a("FINDER_POST_POI_SELECT_HALF_SCREEN_SWITCH", kz5.c0.i(0, 1, 2), kz5.c0.i("全屏", "原生半屏", "Flutter半屏"));
        aVar.c(e42.c0.clicfg_finder_post_poi_select_half_screen_switch, false);
        return aVar;
    }
}
