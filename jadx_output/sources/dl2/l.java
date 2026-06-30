package dl2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235236d;

    public l(dl2.f0 f0Var) {
        this.f235236d = f0Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        java.lang.Object tag = view.getTag();
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        this.f235236d.f235218v = num != null ? num.intValue() : -1;
    }
}
