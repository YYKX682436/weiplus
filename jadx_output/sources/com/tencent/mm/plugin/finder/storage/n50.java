package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n50 f127229d = new com.tencent.mm.plugin.finder.storage.n50();

    public n50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300, "loadmore假菊花时长", null, null, 12, null);
        aVar.b("FinderFakeLoadingDurationMS");
        aVar.a("TIMELINE_LOADING_EXPIRED_TIME", kz5.c0.i(100, 200, 400, 500, 600, 700, 800, 1000, 3000), kz5.c0.i("100", "200", "400", "500", "600", "700", "800", "1000", "3000"));
        return aVar;
    }
}
