package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qb f127421d = new com.tencent.mm.plugin.finder.storage.qb();

    public qb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "倍速手势竖向距离锁定", "FINDER_ENABLE_VERTICAL_DISTANCE_LOCK", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_enable_vertical_distance_lock, false, 2, null);
        return aVar;
    }
}
