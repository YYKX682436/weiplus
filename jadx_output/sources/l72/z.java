package l72;

/* loaded from: classes11.dex */
public class z implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316874a;

    public z(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316874a = faceAgreementUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "click disagree ");
        this.f316874a.f100205q.B();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 66L, 1L, false);
    }
}
