package vv4;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440471d;

    public j(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        this.f440471d = mMFTSImageRecognitionUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440471d;
        mMFTSImageRecognitionUI.getContentView().animate().alpha(0.0f).setDuration(200L).withEndAction(new vv4.i(mMFTSImageRecognitionUI)).start();
    }
}
