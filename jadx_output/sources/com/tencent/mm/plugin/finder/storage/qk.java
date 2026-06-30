package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes3.dex */
public final class qk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qk f127438d = new com.tencent.mm.plugin.finder.storage.qk();

    public qk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "直播和附近-预加载直播广场tab列表", null, null, 12, null);
        aVar.a("FINDER_NEARBY_SQUARE_TABS_PRELOAD", kz5.c0.i(0, 1), kz5.c0.i("关闭", "开启"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_nearby_square_tabs_preload, false, 2, null);
        return aVar;
    }
}
