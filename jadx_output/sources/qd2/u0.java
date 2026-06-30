package qd2;

/* loaded from: classes10.dex */
public final class u0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f361842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f361843c;

    public u0(qd2.g1 g1Var, boolean z17, android.widget.Button button) {
        this.f361841a = g1Var;
        this.f361842b = z17;
        this.f361843c = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        qd2.g1 g1Var = this.f361841a;
        if (z17) {
            g1Var.f361761o = true;
            g1Var.f361762p = true;
        } else {
            g1Var.f361761o = false;
            g1Var.f361762p = false;
        }
        if (this.f361842b) {
            return;
        }
        this.f361843c.setEnabled(z17);
    }
}
