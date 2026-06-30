package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cb f126575d = new com.tencent.mm.plugin.finder.storage.cb();

    public cb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表允许从素材中提取GPS信息传给后台开关", null, null, 12, null);
        aVar.a("FINDER_ENABLE_EXTRACT_FEED_GPS_FEED_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.c0.clicfg_finder_enable_extract_feed_gps_feed_switch, false);
        return aVar;
    }
}
