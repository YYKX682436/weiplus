package g72;

/* loaded from: classes14.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269242d;

    public q(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
        this.f269242d = faceDetectUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: user cancelled with left button");
        int i17 = com.tencent.mm.plugin.facedetect.ui.FaceDetectUI.f100069z;
        com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = this.f269242d;
        faceDetectUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onUserCancel");
        e72.g currentMotionCancelInfo = faceDetectUI.f100080q.getCurrentMotionCancelInfo();
        faceDetectUI.T6(1, currentMotionCancelInfo.f249903a, currentMotionCancelInfo.f249904b, null);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
