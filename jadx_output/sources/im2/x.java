package im2;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(im2.z3 z3Var) {
        super(0);
        this.f292601d = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        im2.z3 z3Var = this.f292601d;
        z3Var.getActivity().finish();
        z3Var.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return jz5.f0.f302826a;
    }
}
