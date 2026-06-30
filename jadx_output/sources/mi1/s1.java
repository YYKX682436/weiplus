package mi1;

/* loaded from: classes7.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f326686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326687e;

    public s1(android.widget.TextView textView, int i17) {
        this.f326686d = textView;
        this.f326687e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mi1.t1.f326692a.c(this.f326686d, this.f326687e, true);
    }
}
