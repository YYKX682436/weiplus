package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class o5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o5 f127287d = new com.tencent.mm.plugin.finder.storage.o5();

    public o5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.7f, "弹幕快捷跟发 目标位置占屏幕宽度比例");
        dVar.a("FINDER_BULLET_FAST_FOLLOW_TARGET_POSITION_RATIO", kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.6f), java.lang.Float.valueOf(0.7f), java.lang.Float.valueOf(0.8f)), kz5.c0.i("0.5", "0.6", "0.7", "0.8"));
        return dVar;
    }
}
