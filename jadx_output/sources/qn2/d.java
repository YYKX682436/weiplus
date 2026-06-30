package qn2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.n f365051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qn2.n nVar) {
        super(1);
        this.f365051d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 cz1Var2;
        r45.cz1 cz1Var3;
        r45.cz1 it = (r45.cz1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qn2.n nVar = this.f365051d;
        km2.z zVar = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
        java.lang.String str = null;
        java.lang.Integer valueOf = zVar != null ? java.lang.Integer.valueOf(zVar.f309229a) : null;
        java.lang.String string = it.getString(0);
        km2.z zVar2 = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
        java.lang.String string2 = (zVar2 == null || (cz1Var3 = zVar2.f309232d) == null) ? null : cz1Var3.getString(0);
        r45.ht1 ht1Var = ((on2.z2) nVar.P0(on2.z2.class)).f347094o;
        if (ht1Var != null && (cz1Var2 = (r45.cz1) ht1Var.getCustom(1)) != null) {
            str = cz1Var2.getString(0);
        }
        com.tencent.mars.xlog.Log.i(nVar.B, "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + string + ",recordId:" + str + ",localId id:" + string2);
        if (valueOf != null && valueOf.intValue() == 2) {
            km2.z zVar3 = ((on2.z2) nVar.P0(on2.z2.class)).f347092m;
            if (zVar3 != null && (cz1Var = zVar3.f309232d) != null) {
                it = cz1Var;
            }
            qn2.n.z1(nVar, it);
        }
        nVar.u1(new qn2.c(nVar));
        return jz5.f0.f302826a;
    }
}
