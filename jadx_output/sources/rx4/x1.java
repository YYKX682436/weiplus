package rx4;

/* loaded from: classes8.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ScrollView f401334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f401335f;

    public x1(rx4.h2 h2Var, android.widget.ScrollView scrollView, float f17) {
        this.f401333d = h2Var;
        this.f401334e = scrollView;
        this.f401335f = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rx4.h2.T6(this.f401333d, this.f401334e, this.f401335f);
    }
}
