package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qv f127449d = new com.tencent.mm.plugin.finder.storage.qv();

    public qv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "有Hls视频时优先选择HLS视频", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_live_end_shop_window_click_area, false, 2, null);
        aVar.a("FINDER_SUPPORT_HLS_SPEC", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
