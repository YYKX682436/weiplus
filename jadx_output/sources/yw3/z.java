package yw3;

/* loaded from: classes.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f466938d;

    public z(android.widget.TextView textView) {
        this.f466938d = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f466938d.setText("Warn Text");
    }
}
