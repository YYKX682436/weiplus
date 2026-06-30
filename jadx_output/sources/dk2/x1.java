package dk2;

/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f234296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f234297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(dk2.r4 r4Var, int i17, yz5.q qVar) {
        super(2);
        this.f234295d = r4Var;
        this.f234296e = i17;
        this.f234297f = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = this.f234295d.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doLoadMoreGiftByGroup onProcessComplete groupId:");
        int i17 = this.f234296e;
        sb6.append(i17);
        sb6.append(", cgiErrType:");
        sb6.append(intValue);
        sb6.append(", cgiErrCode:");
        sb6.append(intValue2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.q qVar = this.f234297f;
        if (intValue == 0 && intValue2 == 0) {
            dk2.vc vcVar = (dk2.vc) dk2.ef.O.get(java.lang.Integer.valueOf(i17));
            if (qVar != null) {
                qVar.invoke(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(intValue2), java.lang.Boolean.valueOf(vcVar != null ? vcVar.f234246a : false));
            }
        } else if (qVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            qVar.invoke(bool, java.lang.Integer.valueOf(intValue2), bool);
        }
        return jz5.f0.f302826a;
    }
}
