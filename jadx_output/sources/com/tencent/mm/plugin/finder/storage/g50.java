package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g50 f126809d = new com.tencent.mm.plugin.finder.storage.g50();

    public g50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(800, "切换ViewPage速度", null, null, 12, null);
        aVar.a("SWITC_VIEW_PAGE_TIME", new java.util.ArrayList(kz5.c0.i(0, 200, 400, 600, 700, 800, 1000, 1200, 1500)), kz5.c0.i("默认", "200", "400", "600", "700", "800", "1000", "1200", "1500"));
        return aVar;
    }
}
