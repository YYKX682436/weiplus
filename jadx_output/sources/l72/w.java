package l72;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316870d;

    public w(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316870d = faceAgreementUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316870d;
        faceAgreementUI.f100195d.dismiss();
        faceAgreementUI.f100195d = null;
    }
}
