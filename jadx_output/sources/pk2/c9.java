package pk2;

/* loaded from: classes3.dex */
public final class c9 implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355635a;

    public c9(pk2.o9 o9Var) {
        this.f355635a = o9Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        o25.y1 y1Var;
        pk2.o9 o9Var = this.f355635a;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        pk2.d9 d9Var = o9Var.f356082f;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = d9Var != null ? d9Var.f355660c : null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
        if (k0Var == null || finderObject == null || d9Var == null || (y1Var = d9Var.f355666i) == null) {
            return;
        }
        kotlin.jvm.internal.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).bj(k0Var, (db5.h4) menuItem);
    }
}
