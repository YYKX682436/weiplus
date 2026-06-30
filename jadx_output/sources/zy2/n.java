package zy2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewTreeObserver f477478a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewTreeObserver.OnPreDrawListener f477479b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnAttachStateChangeListener f477480c;

    public n(android.view.ViewTreeObserver vto, android.view.ViewTreeObserver.OnPreDrawListener listener, android.view.View.OnAttachStateChangeListener onAttachStateChangeListener) {
        kotlin.jvm.internal.o.g(vto, "vto");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f477478a = vto;
        this.f477479b = listener;
        this.f477480c = onAttachStateChangeListener;
    }
}
