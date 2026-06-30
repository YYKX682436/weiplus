package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xw f128329d = new com.tencent.mm.plugin.finder.storage.xw();

    public xw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "流内profile商品橱窗全屏到半屏", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_timeline_profile_shop_half, false);
        aVar.a("FINDER_TIMELINE_PROFILE_SHOP_HALF", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
