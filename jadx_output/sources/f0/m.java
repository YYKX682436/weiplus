package f0;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.o f258151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f258152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f0.o oVar, java.util.List list) {
        super(1);
        this.f258151d = oVar;
        this.f258152e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = this.f258151d.f258163b;
        f0.q0 q0Var = (f0.q0) this.f258152e.get(intValue);
        return java.lang.Integer.valueOf(z17 ? q0Var.f258190e : q0Var.f258191f);
    }
}
