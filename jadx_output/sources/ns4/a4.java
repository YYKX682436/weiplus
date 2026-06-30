package ns4;

/* loaded from: classes2.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f339435d;

    public a4(android.widget.TextView textView) {
        this.f339435d = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f339435d;
        textView.setX((-textView.getWidth()) / 2.0f);
        textView.setY((-textView.getHeight()) / 2.0f);
    }
}
