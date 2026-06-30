package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j5 f126981d = new com.tencent.mm.plugin.finder.storage.j5();

    public j5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.5f, "弹幕快捷跟发 起始速度加成倍数");
        dVar.a("FINDER_BULLET_FAST_FOLLOW_INITIAL_SPEED_BOOST", kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.2f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(1.8f), java.lang.Float.valueOf(2.0f)), kz5.c0.i("1.0", "1.2", "1.5", "1.8", "2.0"));
        return dVar;
    }
}
