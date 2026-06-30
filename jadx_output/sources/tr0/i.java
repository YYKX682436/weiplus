package tr0;

/* loaded from: classes14.dex */
public final class i implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f421309e;

    public i(tr0.t tVar, wo.d1 d1Var) {
        this.f421308d = tVar;
        this.f421309e = d1Var;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        tr0.t tVar = this.f421308d;
        nr0.y yVar = tVar.f411433g;
        if (yVar != null) {
            ((pr0.n) yVar).l("bufferUpdateFrame", new tr0.h(bArr, tVar, this.f421309e, null));
        }
    }
}
