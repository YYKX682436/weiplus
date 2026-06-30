package l72;

/* loaded from: classes11.dex */
public class t implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316863a;

    public t(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316863a = faceAgreementUI;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "click faceAgreementOtherVerifyTitle");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_msg", "fail");
        intent.putExtra("err_code", 90114);
        intent.putExtra("click_other_verify_btn_front", "yes");
        vz2.c.h(90114);
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316863a;
        faceAgreementUI.setResult(1, intent);
        faceAgreementUI.finish();
    }
}
