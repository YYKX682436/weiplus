package qn2;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.i0 f365056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(qn2.i0 i0Var) {
        super(1);
        this.f365056d = i0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.cz1 it = (r45.cz1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        qn2.i0 i0Var = this.f365056d;
        km2.z zVar = ((on2.z2) i0Var.P0(on2.z2.class)).f347092m;
        java.lang.String str = null;
        r45.cz1 cz1Var2 = zVar != null ? zVar.f309232d : null;
        km2.z zVar2 = ((on2.z2) i0Var.P0(on2.z2.class)).f347092m;
        java.lang.Integer valueOf = zVar2 != null ? java.lang.Integer.valueOf(zVar2.f309229a) : null;
        java.lang.String string = it.getString(0);
        java.lang.String string2 = cz1Var2 != null ? cz1Var2.getString(0) : null;
        r45.ht1 ht1Var = ((on2.z2) i0Var.P0(on2.z2.class)).f347094o;
        if (ht1Var != null && (cz1Var = (r45.cz1) ht1Var.getCustom(1)) != null) {
            str = cz1Var.getString(0);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryVisitorCardPlugin", "computingAnimCallback,localStatus:" + valueOf + ", callbakcId:" + string + ",localId:" + string2 + ",recordId:" + str);
        if (valueOf != null && valueOf.intValue() == 2) {
            i0Var.y1(0);
            qn2.l1 l1Var = i0Var.D;
            if (l1Var != null) {
                if (cz1Var2 != null) {
                    it = cz1Var2;
                }
                l1Var.g(it);
            }
        }
        i0Var.u1(new qn2.d0(i0Var));
        return jz5.f0.f302826a;
    }
}
