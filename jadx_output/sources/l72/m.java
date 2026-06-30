package l72;

/* loaded from: classes14.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI f316856d;

    public m(com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI) {
        this.f316856d = faceActionUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f316856d;
        if (faceActionUI.I == 3) {
            faceActionUI.T6("fail", faceActionUI.B, "", faceActionUI.H);
        } else {
            k72.u.B.a();
        }
        faceActionUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
