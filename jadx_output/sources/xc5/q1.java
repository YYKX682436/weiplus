package xc5;

/* loaded from: classes3.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.x1 f453554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(xc5.x1 x1Var) {
        super(0);
        this.f453554d = x1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xc5.x1 x1Var = this.f453554d;
        x1Var.getActivity().finish();
        x1Var.getActivity().overridePendingTransition(0, 0);
        return jz5.f0.f302826a;
    }
}
