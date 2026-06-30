package vz3;

/* loaded from: classes15.dex */
public final class t implements tz3.a {

    /* renamed from: a, reason: collision with root package name */
    public static final vz3.t f441710a = new vz3.t();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f441711b = jz5.h.b(vz3.s.f441709d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f441712c = jz5.h.b(vz3.r.f441708d);

    @Override // tz3.a
    public void a() {
        n().a();
    }

    @Override // tz3.a
    public void b(int i17) {
        n().b(i17);
    }

    @Override // tz3.a
    public void c(int i17) {
        n().c(i17);
    }

    @Override // tz3.a
    public void d(int i17, int i18, int i19, int i27) {
        n().d(i17, i18, i19, i27);
    }

    @Override // tz3.a
    public void e(int i17, sz3.a1 requestInfo, sz3.x0 serverRecognizeResult, android.graphics.RectF rectF, byte[] bArr, int i18, int i19, tz3.c cVar) {
        kotlin.jvm.internal.o.g(requestInfo, "requestInfo");
        kotlin.jvm.internal.o.g(serverRecognizeResult, "serverRecognizeResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsQueueDispatcher", "decodeFullImage localTrackId: " + i17);
        requestInfo.f413963e.f414160a = java.lang.System.currentTimeMillis();
        n().e(i17, requestInfo, serverRecognizeResult, rectF, bArr, i18, i19, cVar);
    }

    @Override // tz3.a
    public void f(com.tencent.wechat.aff.iam_scan.n data) {
        kotlin.jvm.internal.o.g(data, "data");
        n().f(data);
    }

    @Override // tz3.a
    public void g(long j17) {
        n().g(j17);
    }

    @Override // tz3.a
    public void h(tz3.c callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        n().h(callback);
    }

    @Override // tz3.a
    public void i(byte[] yuvData, tz3.b callback) {
        kotlin.jvm.internal.o.g(yuvData, "yuvData");
        kotlin.jvm.internal.o.g(callback, "callback");
        n().i(yuvData, callback);
    }

    @Override // tz3.a
    public void init() {
        n().init();
    }

    @Override // tz3.a
    public void j() {
        n().j();
    }

    @Override // tz3.a
    public void k(com.tencent.wechat.aff.iam_scan.y yVar, tz3.d dVar) {
        n().k(yVar, dVar);
    }

    @Override // tz3.a
    public void l(long j17) {
        n().l(j17);
    }

    @Override // tz3.a
    public void m() {
        n().m();
    }

    public final tz3.a n() {
        return (tz3.a) ((jz5.n) f441712c).getValue();
    }

    @Override // tz3.a
    public void release() {
        n().release();
    }
}
