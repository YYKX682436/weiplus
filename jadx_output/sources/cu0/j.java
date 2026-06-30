package cu0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f222319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cu0.x xVar, int i17, yz5.l lVar) {
        super(1);
        this.f222318d = xVar;
        this.f222319e = i17;
        this.f222320f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        this.f222318d.f222353c.e(intValue / this.f222319e);
        this.f222320f.invoke(java.lang.Integer.valueOf(intValue));
        return jz5.f0.f302826a;
    }
}
