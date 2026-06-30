package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z5 f128427d = new com.tencent.mm.plugin.finder.storage.z5();

    public z5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "弹幕描边颜色", null, null, 12, null);
        aVar.a("FINDER_BULLET_TEXT_STROKE_COLOR", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("alpha0.6", "alpha0.3", "alpha0.4", "alpha0.5"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_bullet_text_stroke_color, false, 2, null);
        return aVar;
    }
}
