package ut2;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f431094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ut2.k0 k0Var) {
        super(0);
        this.f431094d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f431094d.f430958b.findViewById(com.tencent.mm.R.id.ckc);
        kotlin.jvm.internal.o.d(viewGroup);
        viewGroup.post(new d92.b(new d92.c(viewGroup, false)));
        return viewGroup;
    }
}
