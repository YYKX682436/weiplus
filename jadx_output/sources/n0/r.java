package n0;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f333690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f333691e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.p pVar, java.lang.Object obj) {
        super(3);
        this.f333690d = pVar;
        this.f333691e = obj;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        this.f333690d.invoke(applier.a(), this.f333691e);
        return jz5.f0.f302826a;
    }
}
