package y;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f458412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yz5.l lVar) {
        super(1);
        this.f458412d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long j17 = ((p2.q) obj).f351396a;
        return new p2.q(p2.r.a(((java.lang.Number) this.f458412d.invoke(java.lang.Integer.valueOf((int) (j17 >> 32)))).intValue(), p2.q.b(j17)));
    }
}
