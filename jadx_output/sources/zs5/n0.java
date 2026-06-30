package zs5;

/* loaded from: classes15.dex */
public final class n0 implements at5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final zs5.n0 f475450a = new zs5.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f475451b = jz5.h.b(zs5.m0.f475448d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f475452c = jz5.h.b(zs5.l0.f475446d);

    @Override // at5.a
    public void a(long j17, com.tencent.wechat.aff.iam_scan.d1 d1Var) {
        i().a(j17, d1Var);
    }

    @Override // at5.a
    public void b(rz3.b bVar) {
        i().b(bVar);
    }

    @Override // at5.a
    public void c(long j17, int i17, com.tencent.wechat.aff.iam_scan.d1 sessionInfo, at5.b decodeCallBack) {
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(decodeCallBack, "decodeCallBack");
        i().c(j17, i17, sessionInfo, decodeCallBack);
    }

    @Override // at5.a
    public void d(long j17, com.tencent.wechat.aff.iam_scan.d1 d1Var) {
        i().d(j17, d1Var);
    }

    @Override // at5.a
    public void e(android.content.Context context, zs5.e0 decoderConfig) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(decoderConfig, "decoderConfig");
        i().e(context, decoderConfig);
    }

    @Override // at5.a
    public int f() {
        return i().f();
    }

    @Override // at5.a
    public void g(et5.e reporter) {
        kotlin.jvm.internal.o.g(reporter, "reporter");
        i().g(reporter);
    }

    @Override // at5.a
    public void h(byte[] previewData, android.graphics.Point resolution, int i17, int i18, android.graphics.Rect cameraRect, android.graphics.Rect cameraRotateRect) {
        kotlin.jvm.internal.o.g(previewData, "previewData");
        kotlin.jvm.internal.o.g(resolution, "resolution");
        kotlin.jvm.internal.o.g(cameraRect, "cameraRect");
        kotlin.jvm.internal.o.g(cameraRotateRect, "cameraRotateRect");
        i().h(previewData, resolution, i17, i18, cameraRect, cameraRotateRect);
    }

    public final at5.a i() {
        return (at5.a) ((jz5.n) f475452c).getValue();
    }

    @Override // at5.a
    public void release() {
        i().release();
    }
}
