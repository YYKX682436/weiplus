package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hq f126906d = new com.tencent.mm.plugin.finder.storage.hq();

    public hq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "位置变化时刷新同城 tab 开关", "FINDER_REFRESH_SAME_CITY_WHEN_LOCATION_CHANGED", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_refresh_same_city_when_location_changed, false, 2, null);
        return aVar;
    }
}
