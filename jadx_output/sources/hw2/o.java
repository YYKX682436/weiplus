package hw2;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os5.p f285546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hw2.t tVar, os5.p pVar) {
        super(1);
        this.f285545d = tVar;
        this.f285546e = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        os5.p pVar = this.f285546e;
        return java.lang.Integer.valueOf(this.f285545d.a(pVar != null ? pVar.getSuit() : 0, intValue));
    }
}
