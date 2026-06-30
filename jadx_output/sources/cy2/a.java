package cy2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final cy2.a f224740d = new cy2.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = cy2.b.f224741a;
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, false);
        if (1 == com.tencent.mm.sdk.platformtools.a0.f192439b) {
            com.tencent.mars.xlog.Log.w("Finder.WhatNewsController", "[GET] This is GP Version, just ignore.");
        } else if (o45.wf.f343033k) {
            com.tencent.mars.xlog.Log.w("Finder.WhatNewsController", "[GET] This is alpha Version, just ignore.");
        } else {
            java.util.List list = j45.l.f297713a;
            synchronized (j45.l.class) {
            }
            if (com.tencent.mm.sdk.platformtools.m2.m()) {
                com.tencent.mars.xlog.Log.i("Finder.WhatNewsController", "[GET] showFinderEntry=" + ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() + " isShown=" + o17 + " style=0 isAvailableBoot=false");
            } else {
                com.tencent.mars.xlog.Log.w("Finder.WhatNewsController", "[GET] This is not Chinese Language , just ignore.");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1305L, 20L, 1L);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
