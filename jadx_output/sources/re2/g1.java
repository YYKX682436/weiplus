package re2;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f394415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(re2.h1 h1Var, yz5.p pVar) {
        super(2);
        this.f394415d = h1Var;
        this.f394416e = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.e(this.f394415d.f394427s, "create failed: errCode=" + intValue + ", errMsg=" + str);
        yz5.p pVar = this.f394416e;
        if (pVar != null) {
            pVar.invoke(java.lang.Integer.valueOf(intValue), str);
        }
        return jz5.f0.f302826a;
    }
}
