package rx4;

/* loaded from: classes8.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f401322f;

    public w1(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f401320d = h2Var;
        this.f401321e = scrollView;
        this.f401322f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2.T6(this.f401320d, this.f401321e, this.f401322f);
    }
}
