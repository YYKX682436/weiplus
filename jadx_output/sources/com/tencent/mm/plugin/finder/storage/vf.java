package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vf f128193d = new com.tencent.mm.plugin.finder.storage.vf();

    public vf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.0f, "判定滑动为横滑的最小宽高比");
        dVar.c(e42.c0.clicfg_finder_horizontal_swipe_x_y_ratio, false);
        dVar.a("FINDER_HORIZONTAL_SWIPE_X_Y_RATIO", kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(3.0f)), kz5.c0.i("宽高比1:1(默认)", "宽高比2:1", "宽高比3:1"));
        return dVar;
    }
}
