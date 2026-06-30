package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uc0 f128130d = new com.tencent.mm.plugin.finder.storage.uc0();

    public uc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(20, "发表页素材选择最大数量", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_publisher_picker_assets_selection_max_count, false, 2, null);
        aVar.a("FINDER_PUBLISHER_PICKER_ASSETS_SELECTION_MAX_COUNT", kz5.c0.i(20, 30), kz5.c0.i("20张(默认)", "30张"));
        return aVar;
    }
}
