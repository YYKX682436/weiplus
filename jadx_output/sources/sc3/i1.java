package sc3;

/* loaded from: classes7.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(sc3.k1 k1Var) {
        super(1);
        this.f406458d = k1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List descriptors = (java.util.List) obj;
        kotlin.jvm.internal.o.g(descriptors, "descriptors");
        sc3.k1 k1Var = this.f406458d;
        java.lang.String str = k1Var.Q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainScriptProvided with descriptors: ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(descriptors, 10));
        java.util.Iterator it = descriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((lc3.g0) it.next()).toString());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!k1Var.O0()) {
            k1Var.N0();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("not parallel mode. manually trigger load config ");
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = k1Var.f406482n;
            if (mBBuildConfig == null) {
                kotlin.jvm.internal.o.o("config");
                throw null;
            }
            sb7.append(mBBuildConfig.f147819f);
            com.tencent.mars.xlog.Log.i(k1Var.Q, sb7.toString());
        }
        k1Var.M0().Z(new sc3.x0(k1Var));
        k1Var.M0().C(-8);
        k1Var.M0().resume();
        k1Var.M0().post(new sc3.h1(k1Var, descriptors));
        return jz5.f0.f302826a;
    }
}
