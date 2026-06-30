package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lb0 f127127d = new com.tencent.mm.plugin.finder.storage.lb0();

    public lb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(9, "图片feed小圆点最大展示数", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_image_feed_photo_dot_max_count, false, 2, null);
        aVar.a("FINDER_IMAGE_FEED_PHOTO_DOT_MAX_COUNT", kz5.b0.c(9), kz5.b0.c("9个(默认)"));
        return aVar;
    }
}
