package pk2;

/* loaded from: classes3.dex */
public final class va extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.xa f356314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f356315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(pk2.o9 o9Var, pk2.xa xaVar, boolean z17) {
        super(1);
        this.f356313d = o9Var;
        this.f356314e = xaVar;
        this.f356315f = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.LinkedList<r45.ix0> list;
        hn0.r rVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        pk2.o9 o9Var = this.f356313d;
        java.lang.String str = o9Var.f356072a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("p2p switch resp.isSuccess=");
        sb6.append(fVar != null ? java.lang.Boolean.valueOf(fVar.b()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.lang.Object[] objArr = fVar != null && fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str2 = o9Var.f356072a;
        if (objArr == true) {
            r45.ml1 ml1Var = (r45.ml1) fVar.f70618d;
            if (ml1Var == null || (list = ml1Var.getList(1)) == null) {
                return null;
            }
            for (r45.ix0 ix0Var : list) {
                if (ix0Var.getInteger(0) == 1) {
                    int integer = ix0Var.getInteger(1);
                    if (integer == 0) {
                        r45.q82 q82Var = (r45.q82) ((mm2.e1) this.f356314e.f364427a.c(mm2.e1.class)).f328988r.getCustom(9);
                        boolean z17 = this.f356315f;
                        if (q82Var != null) {
                            q82Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
                        }
                        co0.s u07 = dk2.ef.f233372a.u0();
                        kn0.g gVar = (u07 == null || (rVar = u07.R1) == null) ? null : rVar.f282410b;
                        if (gVar != null) {
                            gVar.f309552s = z17;
                        }
                        tn0.w0 w0Var = dk2.ef.f233378d;
                        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
                        if (sVar != null) {
                            sVar.W0();
                        }
                        com.tencent.mars.xlog.Log.i(str2, "real success, enableP2P=" + z17);
                    } else {
                        com.tencent.mars.xlog.Log.i(str2, "retCode=" + integer);
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i(str2, "p2p switch operation failed");
        }
        return f0Var;
    }
}
