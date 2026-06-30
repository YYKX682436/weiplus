package cp4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f221040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cp4.r rVar) {
        super(2);
        this.f221040d = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        cp4.r rVar = this.f221040d;
        ((zu3.d) rVar.f221070u.get(intValue)).f475792g.clear();
        rVar.f221063n.setVisibility(booleanValue ? 0 : 4);
        rVar.f221071v = booleanValue;
        ju3.c0 c0Var = ju3.c0.f301908v2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_1_INT", intValue);
        rVar.f465332d.w(c0Var, bundle);
        return jz5.f0.f302826a;
    }
}
