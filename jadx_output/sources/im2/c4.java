package im2;

/* loaded from: classes10.dex */
public final class c4 implements ru2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f292276d;

    public c4(im2.g4 g4Var) {
        this.f292276d = g4Var;
    }

    @Override // ru2.a
    public void C1(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        im2.g4 g4Var = this.f292276d;
        if (g4Var.O6()) {
            pm0.v.X(new im2.b4(g4Var));
        }
    }

    @Override // ru2.a
    public void V4(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        im2.g4 g4Var = this.f292276d;
        if (g4Var.O6()) {
            pm0.v.X(new im2.a4(g4Var));
        }
    }
}
