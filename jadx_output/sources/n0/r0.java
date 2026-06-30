package n0;

/* loaded from: classes14.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f333692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(yz5.a aVar) {
        super(3);
        this.f333692d = aVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.d4 rememberManager = (n0.d4) obj3;
        kotlin.jvm.internal.o.g((n0.e) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(rememberManager, "rememberManager");
        yz5.a effect = this.f333692d;
        kotlin.jvm.internal.o.g(effect, "effect");
        ((java.util.ArrayList) ((n0.i1) rememberManager).f333536d).add(effect);
        return jz5.f0.f302826a;
    }
}
