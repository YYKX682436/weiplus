package yu4;

/* loaded from: classes8.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xi0 f465880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yu4.k kVar, r45.xi0 xi0Var) {
        super(0);
        this.f465879d = kVar;
        this.f465880e = xi0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yu4.k kVar = this.f465879d;
        android.view.View view = kVar.f465884i;
        if (view != null) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf)).setText(kVar.getContext().getString(com.tencent.mm.R.string.bxu));
            view.findViewById(com.tencent.mm.R.id.f483758bz2).animate().rotation(90.0f).setDuration(200L).start();
            yu4.o oVar = kVar.f465887o;
            r45.xi0 xi0Var = this.f465880e;
            if (oVar == null) {
                kVar.f465887o = new yu4.o(kVar, xi0Var, kVar.f465882g, view);
            } else {
                kotlin.jvm.internal.o.g(xi0Var, "<set-?>");
                oVar.f465907e = xi0Var;
            }
            kVar.f465885m = true;
            yu4.o oVar2 = kVar.f465887o;
            if (oVar2 != null) {
                oVar2.g5(xi0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
