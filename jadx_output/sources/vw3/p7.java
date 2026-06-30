package vw3;

/* loaded from: classes.dex */
public final class p7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f441073d;

    public p7(yz5.a aVar) {
        this.f441073d = aVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            return;
        }
        this.f441073d.invoke();
    }
}
