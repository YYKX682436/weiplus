package vv4;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440469d;

    public i(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        this.f440469d = mMFTSImageRecognitionUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440469d;
        if (!mMFTSImageRecognitionUI.A) {
            mMFTSImageRecognitionUI.A = true;
            yz5.p pVar = (yz5.p) ((jz5.n) mMFTSImageRecognitionUI.f181649x).getValue();
            if (pVar != null) {
                pVar.invoke("enter", null);
            }
        }
        yz5.p pVar2 = (yz5.p) ((jz5.n) mMFTSImageRecognitionUI.f181649x).getValue();
        if (pVar2 != null) {
            pVar2.invoke("dismiss", null);
        }
        super/*com.tencent.mm.ui.MMActivity*/.finish();
    }
}
