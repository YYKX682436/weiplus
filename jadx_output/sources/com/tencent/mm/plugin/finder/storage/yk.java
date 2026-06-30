package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yk f128400d = new com.tencent.mm.plugin.finder.storage.yk();

    public yk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "进度条边界加速倍率", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_new_seek_bar_process_scale_edge_size_android, false);
        aVar.a("FINDER_NEW_SEEK_BAR_PROCESS_SCALE_EDGE_SIZE", kz5.c0.i(4, 5, 6, 7, 8), kz5.c0.i("4(默认)", "5", "6", "7", "8"));
        return aVar;
    }
}
