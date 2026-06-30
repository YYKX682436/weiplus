package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pf f127369d = new com.tencent.mm.plugin.finder.storage.pf();

    public pf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.3f, "单流左滑进profile 切页阈值（rightPercent，leftPercent=1-它）");
        dVar.c(e42.c0.clicfg_finder_timeline_slide_profile_percent, false);
        dVar.a("FINDER_HOME_TIMELINE_SLIDE_PROFILE_PERCENT", kz5.c0.i(java.lang.Float.valueOf(0.2f), java.lang.Float.valueOf(0.25f), java.lang.Float.valueOf(0.3f), java.lang.Float.valueOf(0.35f), java.lang.Float.valueOf(0.4f)), kz5.c0.i("0.20", "0.25", "0.30", "0.35", "0.40"));
        return dVar;
    }
}
