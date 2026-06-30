package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mb0 f127186d = new com.tencent.mm.plugin.finder.storage.mb0();

    public mb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(9, "图片feed发表素材选择最大数量", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_image_feed_picker_assets_selection_max_count, false, 2, null);
        aVar.a("FINDER_IMAGE_FEED_PICKER_ASSETS_SELECTION_MAX_COUNT", kz5.c0.i(9, 20), kz5.c0.i("9张(默认)", "20张"));
        return aVar;
    }
}
