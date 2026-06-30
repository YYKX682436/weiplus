package ri5;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f396097d;

    public b(android.widget.TextView textView) {
        this.f396097d = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f396097d;
        textView.requestLayout();
        textView.invalidate();
    }
}
