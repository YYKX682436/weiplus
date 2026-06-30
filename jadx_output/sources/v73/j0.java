package v73;

/* loaded from: classes.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v73.k0 f433702d;

    public j0(v73.k0 k0Var) {
        this.f433702d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = (android.widget.TextView) this.f433702d.findViewById(com.tencent.mm.R.id.h3r);
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}
