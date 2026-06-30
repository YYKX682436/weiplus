package vv4;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440478d;

    public m(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        this.f440478d = mMFTSImageRecognitionUI;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        yv4.k b76 = this.f440478d.b7();
        float f18 = 1 - f17;
        float intValue = ((java.lang.Number) ((jz5.n) b76.f466228d).getValue()).intValue();
        if (f18 > 0.5f) {
            f18 = 0.5f;
        }
        b76.f466233i = intValue * f18;
        b76.T6(false);
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
    }
}
