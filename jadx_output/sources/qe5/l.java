package qe5;

/* loaded from: classes9.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.o f362137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.e0 f362138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qe5.o oVar, qi3.e0 e0Var) {
        super(0);
        this.f362137d = oVar;
        this.f362138e = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qe5.o oVar = this.f362137d;
        if (!oVar.getActivity().isFinishing() && !oVar.getActivity().isDestroyed()) {
            com.tencent.mm.ui.widget.progress.RoundProgressBtn z17 = oVar.V6().z();
            qi3.e0 e0Var = this.f362138e;
            z17.setProgress(a06.d.b(e0Var.f363698h));
            qi3.g0 g0Var = qi3.g0.f363712n;
            qi3.g0 g0Var2 = e0Var.f363691a;
            if (g0Var2 == g0Var) {
                if (e0Var.a() == 0) {
                    j75.f Q6 = oVar.Q6();
                    if (Q6 != null) {
                        Q6.B3(new kd5.i(true));
                    }
                } else if (e0Var.a() != -510001) {
                    oVar.V6().y().setText(com.tencent.mm.R.string.h0a);
                }
                oVar.f362162g = false;
            } else if (g0Var2 == qi3.g0.f363709h) {
                oVar.f362162g = true;
            }
            oVar.W6();
        }
        return jz5.f0.f302826a;
    }
}
