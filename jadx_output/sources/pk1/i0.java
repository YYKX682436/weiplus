package pk1;

/* loaded from: classes12.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.l0 f355455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pk1.l0 l0Var) {
        super(2);
        this.f355455d = l0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        pk1.l0 l0Var = this.f355455d;
        com.tencent.mars.xlog.Log.i(l0Var.f355470h, "progressCallback, finished: " + longValue + ", total: " + longValue2);
        yz5.p pVar = l0Var.f355468f;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        }
        pk1.v vVar = l0Var.f355471i;
        if (longValue >= longValue2) {
            pk1.z.f355530a.d(vVar);
        } else {
            pk1.z.f355530a.e(vVar);
        }
        return jz5.f0.f302826a;
    }
}
