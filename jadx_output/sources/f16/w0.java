package f16;

/* loaded from: classes16.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.l2 f258781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(o06.l2 l2Var) {
        super(1);
        this.f258781d = l2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o06.d it = (o06.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        f26.o0 type = ((r06.t1) ((o06.l2) it.W().get(((r06.s1) this.f258781d).f368522i))).getType();
        kotlin.jvm.internal.o.f(type, "getType(...)");
        return type;
    }
}
