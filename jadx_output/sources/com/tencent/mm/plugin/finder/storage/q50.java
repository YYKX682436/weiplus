package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q50 f127410d = new com.tencent.mm.plugin.finder.storage.q50();

    public q50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "全局 TL snap 滑动体验", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_global_snap, false, 2, null);
        aVar.a("TIMELINE_SNAP_GLOBAL", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
