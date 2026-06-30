package os3;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f348068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348069e;

    public e3(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI, int i17) {
        this.f348069e = mailWebViewUI;
        this.f348068d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int width;
        int i17;
        com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI = this.f348069e;
        android.view.View view = (android.view.View) mailWebViewUI.f154909d.getParent();
        if (view == null || (i17 = this.f348068d) <= (width = view.getWidth())) {
            return;
        }
        float f17 = width / i17;
        int i18 = 10;
        while (f17 < mailWebViewUI.f154909d.getScale() && i18 - 1 > 0) {
            mailWebViewUI.f154909d.zoomOut();
        }
    }
}
