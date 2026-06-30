package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class te extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.te f128080d = new com.tencent.mm.plugin.finder.storage.te();

    public te() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "开启全局全屏体验", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_global_full_screen_enjoy_enable, false, 2, null);
        aVar.a("FINDER_GLOBAL_FULLSCREEN_ENJOY", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        return aVar;
    }
}
