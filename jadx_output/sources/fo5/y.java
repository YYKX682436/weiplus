package fo5;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er4.r f265152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(er4.r rVar) {
        super(1);
        this.f265152d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l callback = (yz5.l) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        ((jp5.o) i95.n0.c(jp5.o.class)).we(this.f265152d);
        callback.invoke(java.lang.Boolean.TRUE);
        return jz5.f0.f302826a;
    }
}
