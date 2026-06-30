package yz2;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.view.FaceNumberView f468524d;

    public c(com.tencent.mm.plugin.flash.view.FaceNumberView faceNumberView) {
        this.f468524d = faceNumberView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "release");
        com.tencent.mm.plugin.flash.view.FaceNumberView faceNumberView = this.f468524d;
        faceNumberView.f137275f.cancel();
        faceNumberView.f137274e.clearAnimation();
    }
}
