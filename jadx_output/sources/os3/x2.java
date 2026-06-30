package os3;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z2 f348249e;

    public x2(os3.z2 z2Var, java.lang.String str) {
        this.f348249e = z2Var;
        this.f348248d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI = this.f348249e.f348263a;
        com.tencent.mm.ui.widget.MMWebView mMWebView = mailWebViewUI.f154909d;
        if (mMWebView == null || (str = this.f348248d) == null) {
            return;
        }
        java.lang.String str2 = mailWebViewUI.f154910e;
        if (str2 == null) {
            mMWebView.loadData(str, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        } else {
            mMWebView.loadDataWithBaseURL(str2, str, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding, null);
        }
    }
}
