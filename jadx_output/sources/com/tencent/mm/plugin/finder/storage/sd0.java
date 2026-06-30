package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sd0 f127543d = new com.tencent.mm.plugin.finder.storage.sd0();

    public sd0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "DSL红点是否跟随微信字体大小变换计算字体大小", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_dsl_reddot_enable_font_scale, false, 2, null);
        aVar.a("FINDER_DSL_REDDOT_ENABLE_FONT_SCALE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
