package eg4;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f252723d;

    public h1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f252723d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.s1 s1Var = this.f252723d;
        android.text.Layout layout = s1Var.f252800i.getLayout();
        if (layout != null) {
            if (layout.getEllipsisCount(0) > 0) {
                s1Var.f252801j.setVisibility(0);
            } else {
                s1Var.f252801j.setVisibility(8);
            }
        }
    }
}
