package rt1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f399402d;

    public f(rt1.l lVar) {
        this.f399402d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView[] textViewArr = this.f399402d.f399449f;
        if (textViewArr == null) {
            kotlin.jvm.internal.o.o("charViews");
            throw null;
        }
        android.widget.TextView textView = textViewArr[7];
        kotlin.jvm.internal.o.d(textView);
        textView.setText("");
    }
}
