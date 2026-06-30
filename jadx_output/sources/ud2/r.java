package ud2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ud2.c0 c0Var) {
        super(3);
        this.f426649d = c0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent it = (android.content.Intent) obj3;
        kotlin.jvm.internal.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(it, "it");
        ud2.c0 c0Var = this.f426649d;
        c0Var.f426598i = null;
        ud2.c0.a(c0Var, it);
        return jz5.f0.f302826a;
    }
}
