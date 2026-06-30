package com.tencent.mm.storage;

/* loaded from: classes7.dex */
public final class r1 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f195261e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195262f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195263d;

    static {
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        f195261e = kz5.n0.u0(kz5.c0.i("mmscreenshot", "webviewscpic"), "Screenshots");
        l75.e0 e0Var = com.tencent.mm.storage.p1.D;
        f195262f = new java.lang.String[]{l75.n0.getCreateSQLs(com.tencent.mm.storage.p1.D, "BizScreenshotInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(l75.k0 db6) {
        super(db6, com.tencent.mm.storage.p1.D, "BizScreenshotInfo", dm.k1.f237953r);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.storage.p1.D;
        this.f195263d = db6;
    }

    public final com.tencent.mm.storage.p1 y0(java.lang.String screenshotPath) {
        kotlin.jvm.internal.o.g(screenshotPath, "screenshotPath");
        new com.tencent.mm.storage.p1().field_screenshotPath = screenshotPath;
        p75.i0 i17 = dm.k1.f237950o.i();
        i17.f352657d = dm.k1.f237951p.j(screenshotPath);
        i17.f352656c = "MicroMsg.SDK.BaseBizScreenshotInfo";
        return (com.tencent.mm.storage.p1) i17.a().o(this.f195263d, com.tencent.mm.storage.p1.class);
    }
}
