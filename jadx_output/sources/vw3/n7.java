package vw3;

/* loaded from: classes.dex */
public final class n7 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f441044d;

    public n7(yz5.a aVar) {
        this.f441044d = aVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6) {
            return false;
        }
        this.f441044d.invoke();
        return true;
    }
}
