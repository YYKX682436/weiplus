package pk2;

/* loaded from: classes3.dex */
public final class g3 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f355768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355770c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f355771d;

    public g3(pk2.q3 q3Var, boolean z17, android.view.View view, r45.t62 t62Var, r45.t62 t62Var2) {
        this.f355768a = q3Var;
        this.f355769b = view;
        this.f355770c = t62Var;
        this.f355771d = t62Var2;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        pk2.q3 q3Var = this.f355768a;
        qk2.f.f(q3Var, false, 1, null);
        q3Var.getClass();
        android.view.View rootView = this.f355769b;
        kotlin.jvm.internal.o.f(rootView, "$rootView");
        q3Var.x(rootView, this.f355770c, this.f355771d);
    }
}
