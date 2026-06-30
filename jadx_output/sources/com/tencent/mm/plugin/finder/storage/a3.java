package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class a3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.a3 f126380d = new com.tencent.mm.plugin.finder.storage.a3();

    public a3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "通用跳转器-广告原生页预热", null, null, 12, null);
        aVar.a("FINDER_AD_NATIVE_PRELOAD", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("关闭", "预热资源", "预热进程", "预热资源+进程"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_ad_native_preload, false, 2, null);
        return aVar;
    }
}
