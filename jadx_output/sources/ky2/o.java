package ky2;

/* loaded from: classes.dex */
public final class o implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f313568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f313571g;

    public o(android.view.View view, ky2.w wVar, android.widget.EditText editText, int i17) {
        this.f313568d = view;
        this.f313569e = wVar;
        this.f313570f = editText;
        this.f313571g = i17;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        boolean hasFocus = view.hasFocus();
        ky2.w wVar = this.f313569e;
        if (!hasFocus) {
            wVar.getClass();
        } else {
            this.f313568d.post(new ky2.n(this.f313570f, wVar, this.f313571g));
        }
    }
}
