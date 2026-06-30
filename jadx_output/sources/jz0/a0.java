package jz0;

/* loaded from: classes4.dex */
public final class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.f0 f302563d;

    public a0(jz0.f0 f0Var) {
        this.f302563d = f0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jz0.f0 f0Var = this.f302563d;
        f0Var.f302576f = true;
        androidx.appcompat.app.AppCompatActivity activity = f0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((jz0.k) pf5.z.f353948a.a(activity).a(jz0.k.class)).Q6(true);
    }
}
