package f1;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.y f258520d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(f1.y yVar) {
        super(1);
        this.f258520d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        double doubleValue = ((java.lang.Number) obj).doubleValue();
        return (java.lang.Double) this.f258520d.f258532m.invoke(java.lang.Double.valueOf(e06.p.d(doubleValue, r8.f258524e, r8.f258525f)));
    }
}
