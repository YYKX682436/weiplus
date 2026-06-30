package g72;

/* loaded from: classes.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269226d;

    public b(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f269226d = faceDetectConfirmUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = this.f269226d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String str = faceDetectConfirmUI.f100060r;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = faceDetectConfirmUI.f100058p + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s", objArr), com.tencent.mapsdk.internal.rv.f51270c);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "jump realUrl: %s", str2);
            com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI.T6(faceDetectConfirmUI, str2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", e17, "jumpToWebView exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
