package vw3;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f440945d;

    public f(yz5.a aVar) {
        this.f440945d = aVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        this.f440945d.invoke();
    }
}
