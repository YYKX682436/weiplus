package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.e5 f126690d = new com.tencent.mm.plugin.finder.storage.e5();

    public e5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.0f, "视频号弹幕滑动时长倍数");
        lb2.j.d(dVar, e42.d0.clicfg_finder_bullet_duration_scale, false, 2, null);
        dVar.a("FINDER_BULLET_DURATION_SCALE", kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(1.2f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f)), kz5.c0.i("默认", "0.5倍", "1.2倍", "1.5倍", "2.0倍"));
        return dVar;
    }
}
