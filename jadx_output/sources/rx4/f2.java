package rx4;

/* loaded from: classes8.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f401153f;

    public f2(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f401151d = h2Var;
        this.f401152e = scrollView;
        this.f401153f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2.T6(this.f401151d, this.f401152e, this.f401153f);
    }
}
