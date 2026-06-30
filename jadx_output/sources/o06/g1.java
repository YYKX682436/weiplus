package o06;

/* loaded from: classes15.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n16.c f341958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(n16.c cVar) {
        super(1);
        this.f341958d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.c it = (n16.c) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(!it.d() && kotlin.jvm.internal.o.b(it.e(), this.f341958d));
    }
}
