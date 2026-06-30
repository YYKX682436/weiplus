package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qf f127429d = new com.tencent.mm.plugin.finder.storage.qf();

    public qf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(400, "单流左滑进profile 速度优先阈值(px/s)", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_timeline_slide_profile_velocity_threshold, false);
        aVar.a("FINDER_HOME_TIMELINE_SLIDE_PROFILE_VELOCITY_THRESHOLD", kz5.c0.i(0, 200, 400, 600, 800, 1200), kz5.c0.i("0(禁用)", "200", "400", "600", "800", "1200"));
        return aVar;
    }
}
