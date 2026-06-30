package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.y5 f128344d = new com.tencent.mm.plugin.finder.storage.y5();

    public y5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(17, "弹幕字体size", null, null, 12, null);
        aVar.a("FINDER_BULLET_TEXT_SIZE", kz5.c0.i(16, 17, 18, 19), kz5.c0.i("16", "17", "18", "19"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_bullet_text_size, false, 2, null);
        return aVar;
    }
}
