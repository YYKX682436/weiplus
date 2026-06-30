package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m5 f127170d = new com.tencent.mm.plugin.finder.storage.m5();

    public m5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(2.5f, "弹幕快捷跟发 弹幕速度倍数");
        dVar.a("FINDER_BULLET_FAST_FOLLOW_RATIO", kz5.c0.i(java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(2.5f), java.lang.Float.valueOf(3.0f)), kz5.c0.i("2f", "2.5f", "3f"));
        return dVar;
    }
}
