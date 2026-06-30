package l72;

/* loaded from: classes14.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316857d;

    public n(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316857d = faceActionUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceActionUI", "click mUploadFailedConfig");
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316857d;
        faceActionUI.f100190w = true;
        faceActionUI.T6("fail", faceActionUI.B, "", faceActionUI.H);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
