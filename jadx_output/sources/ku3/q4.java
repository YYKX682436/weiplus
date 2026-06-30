package ku3;

/* loaded from: classes5.dex */
public final class q4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.s4 f312371d;

    public q4(ku3.s4 s4Var) {
        this.f312371d = s4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f475588b;
        ku3.s4 s4Var = this.f312371d;
        if (!z17) {
            kotlinx.coroutines.l.d(s4Var.f312411f, null, null, new ku3.p4(s4Var, null), 3, null);
        } else {
            db5.t7.m(s4Var.f312410e.getContext(), i65.a.r(s4Var.f312410e.getContext(), com.tencent.mm.R.string.hml));
            kotlinx.coroutines.l.d(s4Var.f312411f, null, null, new ku3.o4(s4Var, null), 3, null);
        }
    }
}
