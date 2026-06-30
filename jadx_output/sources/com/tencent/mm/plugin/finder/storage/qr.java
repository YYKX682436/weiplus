package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qr f127445d = new com.tencent.mm.plugin.finder.storage.qr();

    public qr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "判定是否为进度条横滑移动宽高比", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_seek_bar_horizontal_dis_ratio_android, false);
        aVar.a("FINDER_SEEK_BAR_HORIZONTAL_RATIO", kz5.c0.i(1, 2, 3), kz5.c0.i("宽高比1:1(默认)", "宽高比1:2", "宽高比1:3"));
        return aVar;
    }
}
