package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yz f128415d = new com.tencent.mm.plugin.finder.storage.yz();

    public yz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "通用跳转器预加载计时策略", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_jumper_preload_strategy, false, 2, null);
        aVar.a("FinderJumperPreloadStrategy", kz5.c0.i(0, 1), kz5.c0.i("组件曝光时", "视频曝光时"));
        return aVar;
    }
}
