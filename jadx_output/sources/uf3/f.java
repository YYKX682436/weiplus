package uf3;

/* loaded from: classes12.dex */
public final class f implements cg3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf3.g f427183a;

    public f(uf3.g gVar) {
        this.f427183a = gVar;
    }

    @Override // cg3.c
    public android.graphics.Matrix a() {
        em.o1 o1Var = this.f427183a.f427184o;
        if (o1Var != null) {
            return o1Var.d().getMainMatrix();
        }
        kotlin.jvm.internal.o.o("rootVB");
        throw null;
    }

    @Override // cg3.c
    public android.view.View getView() {
        uf3.g gVar = this.f427183a;
        em.o1 o1Var = gVar.f427184o;
        if (o1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.view.View activeView = o1Var.i().getActiveView();
        if (activeView != null) {
            return activeView;
        }
        em.o1 o1Var2 = gVar.f427184o;
        if (o1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.ui.base.MultiTouchImageView g17 = o1Var2.g();
        kotlin.jvm.internal.o.f(g17, "getNormalImage(...)");
        return g17;
    }
}
