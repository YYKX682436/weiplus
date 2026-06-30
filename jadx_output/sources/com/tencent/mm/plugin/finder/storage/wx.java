package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wx f128273d = new com.tencent.mm.plugin.finder.storage.wx();

    public wx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(150, "倍速手势竖向距离锁定阈值(dp)", null, null, 12, null);
        aVar.a("FINDER_VERTICAL_DISTANCE_LOCK_THRESHOLD_DP", kz5.c0.i(100, 150, 200, 250), kz5.c0.i("100dp", "150dp", "200dp", "250dp"));
        return aVar;
    }
}
