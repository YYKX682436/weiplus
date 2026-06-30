package pk1;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.q f355482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pk1.q qVar) {
        super(1);
        this.f355482d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        pk1.q qVar = this.f355482d;
        pk1.q.X(qVar, longValue);
        pk1.q.Y(qVar, longValue);
        return jz5.f0.f302826a;
    }
}
