package py4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.TextRecognizer f359088a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.PaymentCodeClassifier f359089b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.PaymentCodeDetector f359090c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.Reporter f359091d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f359092e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f359093f = jz5.h.b(py4.a.f359087d);

    public final rh0.y a() {
        return (rh0.y) ((jz5.n) this.f359093f).getValue();
    }

    public final boolean b(java.lang.String str) {
        return !(str == null || str.length() == 0) && com.tencent.mm.vfs.w6.j(str);
    }

    public final void c() {
        com.tencent.wevision2.modules.ocr.Reporter reporter = this.f359091d;
        if (reporter != null) {
            java.lang.String purgeData = reporter.purgeData();
            if (purgeData == null || purgeData.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeOcrClsManager", "Nothing to report to 28950");
                return;
            }
            jx3.f.INSTANCE.kvStat(28950, "Cpu,INT8," + purgeData + ",2");
        }
    }
}
