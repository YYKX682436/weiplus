package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class px extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.px f127394d = new com.tencent.mm.plugin.finder.storage.px();

    public px() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号翻页速度", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_turn_page_speed_param, false, 2, null);
        aVar.a("FINDER_TURN_PAGE_SPEED_PARAM", kz5.c0.i(0, 50, 80, 100, 125, 150, 175), kz5.c0.i("默认", "50", "80", "100", "125", "150", "175"));
        return aVar;
    }
}
