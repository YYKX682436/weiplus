package sx5;

/* loaded from: classes13.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413773d;

    public z(sx5.a1 a1Var) {
        this.f413773d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ProgressBar progressBar = this.f413773d.f413683q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }
}
