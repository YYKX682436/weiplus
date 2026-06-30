package d32;

/* loaded from: classes10.dex */
public final class l extends d32.n implements d32.q {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f226188t;

    public l() {
        super(0, 1, null);
        this.f226188t = "MicroMsg.EmojiCapturePreviewRenderer";
    }

    @Override // d32.q
    public is0.c d() {
        java.lang.Object obj = this.f330951g;
        d32.q qVar = obj instanceof d32.q ? (d32.q) obj : null;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    @Override // ms0.c
    public os0.a f() {
        com.tencent.mars.xlog.Log.i(this.f226188t, "doInitRenderProc, useCpuCrop:false");
        return new d32.a(this.f330945a, this.f330946b, this.f330947c, this.f330948d, this.f330949e, this.f330950f);
    }
}
