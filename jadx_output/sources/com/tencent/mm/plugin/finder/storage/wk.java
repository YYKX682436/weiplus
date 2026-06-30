package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wk f128260d = new com.tencent.mm.plugin.finder.storage.wk();

    public wk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.25f, "进度条基础加速倍率");
        dVar.c(e42.c0.clicfg_finder_new_seek_bar_process_normal_scale_size_android, false);
        dVar.a("FINDER_NEW_SEEK_BAR_PROCESS_NORMAL_SCALE_SIZE", kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.25f), java.lang.Float.valueOf(1.5f)), kz5.c0.i("1", "1.25(默认)", "1.5"));
        return dVar;
    }
}
