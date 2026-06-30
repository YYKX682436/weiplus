package sj2;

/* loaded from: classes.dex */
public final class g implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f408385d;

    public g(android.widget.TextView textView) {
        this.f408385d = textView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.widget.TextView textView = this.f408385d;
        android.view.ViewTreeObserver viewTreeObserver = textView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        textView.setTranslationX(textView.getMeasuredWidth() / 2.0f);
        textView.setTranslationY((-textView.getMeasuredHeight()) / 2.0f);
        return true;
    }
}
