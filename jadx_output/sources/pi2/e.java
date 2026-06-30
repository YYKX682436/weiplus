package pi2;

/* loaded from: classes3.dex */
public final class e implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pi2.n f354772a;

    public e(pi2.n nVar) {
        this.f354772a = nVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        fg2.u0 u0Var = this.f354772a.R;
        if (u0Var != null) {
            u0Var.f262349g.setEnabled(z17);
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }
}
