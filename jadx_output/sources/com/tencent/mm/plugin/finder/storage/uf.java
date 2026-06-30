package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes3.dex */
public final class uf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uf f128135d = new com.tencent.mm.plugin.finder.storage.uf();

    public uf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean z18 = true;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (!z17 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        nb2.a aVar = new nb2.a(z18, "滑动优化减少横滑变竖滑", "FINDER_HORIZONTAL_SWIPE_OPTIMIZATION", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_horizontal_swipe_optimization, false, 2, null);
        return aVar;
    }
}
