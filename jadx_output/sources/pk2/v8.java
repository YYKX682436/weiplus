package pk2;

/* loaded from: classes3.dex */
public final class v8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356311e;

    public v8(pk2.d9 d9Var, pk2.o9 o9Var) {
        this.f356310d = d9Var;
        this.f356311e = o9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.view.View view;
        pk2.d9 d9Var;
        o25.y1 y1Var;
        pk2.d9 d9Var2 = this.f356310d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = d9Var2.f355660c;
        if (k0Var != null) {
            kotlin.jvm.internal.o.d(g4Var);
            pk2.o9 o9Var = this.f356311e;
            kotlin.jvm.internal.o.g(o9Var, "<this>");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            if ((finderObject != null && hc2.o0.d(finderObject)) && zl2.r4.f473950a.n(((mm2.c1) o9Var.c(mm2.c1.class)).Q1) && ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n != null) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
                if (!(finderObject2 != null && finderObject2.getId() == 0) && (d9Var = o9Var.f356082f) != null && (y1Var = d9Var.f355666i) != null) {
                    view = ((com.tencent.mm.pluginsdk.forward.m) y1Var).Ai(o9Var.f356078d, g4Var, k0Var, 2, new pk2.db(o9Var));
                    pk2.d9.a(d9Var2, d9Var2.f355660c, view);
                }
            }
            view = null;
            pk2.d9.a(d9Var2, d9Var2.f355660c, view);
        }
    }
}
