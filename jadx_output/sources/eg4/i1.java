package eg4;

/* loaded from: classes11.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.s1 f252730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f252731e;

    public i1(eg4.t1 t1Var, eg4.s1 s1Var) {
        this.f252731e = t1Var;
        this.f252730d = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.s1 s1Var = this.f252730d;
        int measuredHeight = s1Var.f252805n.getMeasuredHeight();
        if (measuredHeight > 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) s1Var.f252793b.getLayoutParams();
            eg4.t1 t1Var = this.f252731e;
            layoutParams.topMargin = i65.a.f(t1Var.f252811o, com.tencent.mm.R.dimen.f479646bl);
            s1Var.f252793b.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) s1Var.f252794c.getLayoutParams();
            layoutParams2.topMargin = i65.a.f(t1Var.f252811o, com.tencent.mm.R.dimen.f479646bl);
            s1Var.f252794c.setLayoutParams(layoutParams2);
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) s1Var.f252792a.getLayoutParams();
            layoutParams3.topMargin = (int) ((measuredHeight * 0.5f) - i65.a.f(t1Var.f252811o, com.tencent.mm.R.dimen.f479693cs));
            s1Var.f252792a.setLayoutParams(layoutParams3);
        }
    }
}
