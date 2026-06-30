package st2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(st2.h1 h1Var) {
        super(2);
        this.f412310d = h1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        l81.b1 b1Var = (l81.b1) obj2;
        if (b1Var != null) {
            st2.c2.f412249a.k(b1Var);
            st2.h1.b(this.f412310d, b1Var);
        }
        return jz5.f0.f302826a;
    }
}
