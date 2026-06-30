package vw3;

/* loaded from: classes.dex */
public final class g implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f440956d;

    public g(yz5.a aVar) {
        this.f440956d = aVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 6) {
            return false;
        }
        this.f440956d.invoke();
        return true;
    }
}
