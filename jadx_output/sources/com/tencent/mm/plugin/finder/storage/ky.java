package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ky extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ky f127093d = new com.tencent.mm.plugin.finder.storage.ky();

    public ky() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "水位线不足5s停止", "FINDER_WATER_BELOW_2_STOP", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_water_below_2_stop, false, 2, null);
        return aVar;
    }
}
