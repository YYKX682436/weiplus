package yi2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yi2.i0 i0Var) {
        super(0);
        this.f462596d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yi2.i0 i0Var = this.f462596d;
        gk2.e eVar = i0Var.f462518d;
        zh2.c cVar = i0Var.f462520f.F;
        android.content.Context context = i0Var.f462519e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new qi2.v(eVar, cVar, context, i0Var.I);
    }
}
