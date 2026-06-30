package e51;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f249571a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.Choreographer f249572b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Choreographer.FrameCallback f249573c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f249574d;

    public d(java.lang.ref.WeakReference weakReference) {
        this.f249571a = weakReference;
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        kotlin.jvm.internal.o.f(choreographer, "getInstance(...)");
        this.f249572b = choreographer;
        this.f249573c = new e51.c(this);
    }
}
