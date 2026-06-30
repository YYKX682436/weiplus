package d33;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d33.a f226199a = new d33.a();

    public final void a(int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, i17, i18);
    }

    public final void b(int i17) {
        com.tencent.mars.xlog.Log.i("ImageCropReport", "inc: " + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1361L, (long) i17, 1L);
    }

    public final void c(int i17) {
        android.os.Debug.MemoryInfo b17 = oj.d.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (b17 != null) {
            d33.a aVar = f226199a;
            aVar.a(i17, b17.nativePss);
            aVar.a(i17 + 1, b17.dalvikPss);
        }
    }
}
