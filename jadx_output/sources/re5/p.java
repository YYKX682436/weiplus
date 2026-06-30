package re5;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f394587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f394588e;

    public p(android.widget.TextView textView, gg3.c cVar) {
        this.f394587d = textView;
        this.f394588e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = "." + com.tencent.mm.vfs.w6.n(this.f394588e.f271729d);
        android.widget.TextView textView = this.f394587d;
        textView.setText(str);
        textView.invalidate();
    }
}
