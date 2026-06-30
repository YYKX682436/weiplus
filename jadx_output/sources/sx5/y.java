package sx5;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413772d;

    public y(sx5.a1 a1Var) {
        this.f413772d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ProgressBar progressBar = this.f413772d.f413683q;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }
}
