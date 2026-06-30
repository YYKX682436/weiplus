package or2;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.view.Display.Mode f347616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.f f347617e;

    public b(or2.f fVar, android.view.Display.Mode mode) {
        this.f347617e = fVar;
        this.f347616d = mode;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Display.Mode mode = this.f347616d;
        if (mode != null) {
            kotlin.jvm.internal.o.d(mode);
            this.f347617e.Q6(mode);
        }
    }
}
