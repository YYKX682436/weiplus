package el2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(el2.i0 i0Var) {
        super(3);
        this.f253917d = i0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.z42 info = (r45.z42) obj;
        android.view.View view = (android.view.View) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(view, "view");
        el2.i0 i0Var = this.f253917d;
        if (!i0Var.f253811p0.contains(java.lang.Integer.valueOf(info.getInteger(1))) || ((java.lang.Boolean) ae2.in.f3765h6.r()).booleanValue()) {
            rl5.r rVar = new rl5.r(view.getContext());
            rVar.g(view, intValue, 0L, new el2.s(i0Var), new el2.t(i0Var, info), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            rVar.m();
        }
        return jz5.f0.f302826a;
    }
}
