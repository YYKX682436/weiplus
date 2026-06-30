package f0;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f258011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f258012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z17, java.util.List list) {
        super(1);
        this.f258011d = z17;
        this.f258012e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f0.q0 q0Var = (f0.q0) ((f0.k) this.f258012e.get(((java.lang.Number) obj).intValue()));
        return java.lang.Integer.valueOf(this.f258011d ? q0Var.f258190e : q0Var.f258191f);
    }
}
