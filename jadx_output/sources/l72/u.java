package l72;

/* loaded from: classes11.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI f316864d;

    public u(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        this.f316864d = faceAgreementUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.f100194v;
        com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = this.f316864d;
        faceAgreementUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "onUserCancel()");
        faceAgreementUI.U6();
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceAgreementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
