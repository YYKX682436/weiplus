package l72;

/* loaded from: classes11.dex */
public class x implements l72.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316871a;

    public x(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI, android.content.Context context) {
        this.f316871a = context;
    }

    @Override // l72.b0
    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "click %s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(this.f316871a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
