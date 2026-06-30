package el2;

/* loaded from: classes3.dex */
public final class e2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f253785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f253786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f253787f;

    public e2(el2.i2 i2Var, r45.f52 f52Var, java.lang.Boolean bool) {
        this.f253785d = i2Var;
        this.f253786e = f52Var;
        this.f253787f = bool;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.protobuf.g gVar;
        java.lang.String str;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        el2.i2 i2Var = this.f253785d;
        com.tencent.mars.xlog.Log.i(i2Var.f253829m, "joinLive = " + booleanValue + ", live = " + i2Var.Z6());
        xy2.b bVar = xy2.b.f458155b;
        r45.f52 f52Var = this.f253786e;
        pm0.z.b(bVar, "pollingPromoteInfoWithoutJoinLive", booleanValue, null, null, false, false, new el2.d2(i2Var, f52Var), 60, null);
        if (booleanValue) {
            if (f52Var == null) {
                so2.j5 j5Var = ((mm2.f6) i2Var.business(mm2.f6.class)).f329049w;
                f52Var = j5Var != null ? zl2.r4.f473950a.J2(j5Var) : null;
            }
            long j17 = ((mm2.f6) i2Var.business(mm2.f6.class)).L;
            r45.qc2 qc2Var = new r45.qc2();
            qc2Var.set(0, java.lang.Long.valueOf(f52Var != null ? f52Var.getLong(4) : j17));
            if (f52Var == null || (gVar = f52Var.getByteString(6)) == null) {
                gVar = ((mm2.f6) i2Var.business(mm2.f6.class)).M;
            }
            boolean z17 = true;
            qc2Var.set(1, gVar);
            qc2Var.set(2, f52Var != null ? f52Var.getByteString(2) : null);
            java.lang.Boolean bool = this.f253787f;
            if (bool != null) {
                z17 = bool.booleanValue();
            } else if (j17 <= 0) {
                z17 = false;
            }
            qc2Var.set(3, java.lang.Boolean.valueOf(z17));
            if (f52Var == null || (str = f52Var.getString(13)) == null) {
                str = "";
            }
            qc2Var.set(4, str);
            qc2Var.set(5, ((mm2.f6) i2Var.business(mm2.f6.class)).N);
            com.tencent.mars.xlog.Log.i(i2Var.f253829m, "[startPollingPromoteInfoInternal-" + i2Var.Z6() + "] req:" + pm0.b0.g(qc2Var));
            dk2.ef.f233392k.e(10, qc2Var, new el2.h2(i2Var, r45.rc2.class), false);
        }
        return jz5.f0.f302826a;
    }
}
