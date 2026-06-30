package l72;

/* loaded from: classes11.dex */
public class a0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316834a;

    public a0(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316834a = faceAgreementUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "click agree ");
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316834a;
        android.content.Intent intent = new android.content.Intent(faceAgreementUI, (java.lang.Class<?>) com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.class);
        android.os.Bundle extras = faceAgreementUI.getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("needContract", faceAgreementUI.f100206r);
        faceAgreementUI.startActivityForResult(intent, 1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 65L, 1L, false);
        faceAgreementUI.f100205q.B();
    }
}
