package qz2;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f367888d;

    public m(com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI fingerPrintAuthTransparentUI, android.widget.TextView textView) {
        this.f367888d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f367888d.setVisibility(0);
    }
}
