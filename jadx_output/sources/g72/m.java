package g72;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f269237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269238e;

    public m(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI, int i17) {
        this.f269238e = faceDetectConfirmUI;
        this.f269237d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = this.f269238e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String str = faceDetectConfirmUI.f100057o + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d", faceDetectConfirmUI.f100060r, java.lang.Integer.valueOf(this.f269237d)), com.tencent.mapsdk.internal.rv.f51270c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(faceDetectConfirmUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
