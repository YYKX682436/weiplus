package ni2;

/* loaded from: classes3.dex */
public final class z implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.d0 f337518a;

    public z(ni2.d0 d0Var) {
        this.f337518a = d0Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        ni2.d0 d0Var = this.f337518a;
        android.widget.CheckBox checkBox = d0Var.f337271m;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        d0Var.f337276r = checkBox.isChecked() ? 1 : 0;
        android.widget.TextView textView = d0Var.f337270i;
        if (textView != null) {
            textView.setActivated(d0Var.f337276r != 0);
        } else {
            kotlin.jvm.internal.o.o("okBtn");
            throw null;
        }
    }
}
