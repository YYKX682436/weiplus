package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.f5 f126746d = new com.tencent.mm.plugin.finder.storage.f5();

    public f5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(7500, "视频号弹幕-竖屏-速度", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_video_bullet_duration_vertical, false, 2, null);
        aVar.a("FINDER_BULLET_DURATION_VERTICAL", kz5.c0.i(6500, 7500), kz5.c0.i("6500", "7500"));
        return aVar;
    }
}
