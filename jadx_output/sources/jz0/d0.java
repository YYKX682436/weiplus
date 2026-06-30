package jz0;

/* loaded from: classes4.dex */
public final class d0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.f0 f302569d;

    public d0(jz0.f0 f0Var) {
        this.f302569d = f0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        jz0.f0 f0Var = this.f302569d;
        f0Var.f302576f = false;
        androidx.appcompat.app.AppCompatActivity activity = f0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((jz0.k) pf5.z.f353948a.a(activity).a(jz0.k.class)).Q6(false);
        return true;
    }
}
