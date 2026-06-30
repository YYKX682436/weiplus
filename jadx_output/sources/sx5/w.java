package sx5;

/* loaded from: classes13.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413762d;

    public w(sx5.a1 a1Var) {
        this.f413762d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413762d;
        android.view.ViewGroup viewGroup = a1Var.f413678n;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            a1Var.f413688v.setVisibility(0);
            a1Var.f413687u.setVisibility(0);
            a1Var.y();
        }
    }
}
