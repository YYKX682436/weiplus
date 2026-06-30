package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class d5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.d5 f126626d = new com.tencent.mm.plugin.finder.storage.d5();

    public d5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(15000, "视频号弹幕-横屏-速度", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_video_bullet_duration_horizontal, false, 2, null);
        aVar.a("FINDER_BULLET_DURATION_HORIZONTAL", kz5.c0.i(12000, 15000), kz5.c0.i("12000", "15000"));
        return aVar;
    }
}
