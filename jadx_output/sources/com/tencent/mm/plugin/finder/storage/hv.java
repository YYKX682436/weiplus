package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class hv extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hv f126911d = new com.tencent.mm.plugin.finder.storage.hv();

    public hv() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "已重置", 0).show();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_STAR_GUIDE_TIPS_COUNT_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_STAR_GUIDE_TIPS_LAST_SHOW_TIME_LONG_SYNC, 0L);
        return jz5.f0.f302826a;
    }
}
