package zy2;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f477531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f477532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.r f477533f;

    public q(android.widget.TextView textView, android.view.ViewTreeObserver viewTreeObserver, zy2.r rVar) {
        this.f477531d = textView;
        this.f477532e = viewTreeObserver;
        this.f477533f = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        android.widget.TextView textView = this.f477531d;
        textView.removeOnAttachStateChangeListener(this);
        android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver().isAlive() ? textView.getViewTreeObserver() : this.f477532e;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f477533f);
        }
        textView.setTag(com.tencent.mm.R.id.sut, null);
    }
}
