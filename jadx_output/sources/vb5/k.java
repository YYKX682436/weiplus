package vb5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vb5.l f434852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.e f434853e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f434854f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vb5.l lVar, com.tencent.mm.ui.tipsbar.e eVar, boolean z17) {
        super(0);
        this.f434852d = lVar;
        this.f434853e = eVar;
        this.f434854f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vb5.l lVar = this.f434852d;
        lVar.f198580d.b0();
        com.tencent.mm.ui.tipsbar.e eVar = this.f434853e;
        boolean z17 = this.f434854f;
        java.lang.String x17 = lVar.f198580d.x();
        long j17 = lVar.f434858g;
        if (com.tencent.mm.storage.z3.R4(x17) || com.tencent.mm.storage.z3.T4(x17) || com.tencent.mm.storage.z3.p4(x17)) {
            boolean z18 = ((com.tencent.mm.ui.chatting.component.ej) ((sb5.p1) lVar.f198580d.f460708c.a(sb5.p1.class))).f198977e;
            java.lang.String str = lVar.f434856e;
            if (z18) {
                com.tencent.mars.xlog.Log.i(str, "pauseTipsBar in RecordSelect");
                lVar.q0();
            } else {
                try {
                    if (lVar.f198580d.i() == null) {
                        com.tencent.mars.xlog.Log.e(str, "prepareDataAndCommit getDataScope == null err");
                    } else {
                        yb5.q v17 = lVar.f198580d.v();
                        com.tencent.mm.sdk.coroutines.LifecycleScope i17 = lVar.f198580d.i();
                        if (i17 != null) {
                            v65.i.b(i17, null, new vb5.f(lVar, v17, j17, eVar, z17, null), 1, null);
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "", new java.lang.Object[0]);
                }
            }
        } else {
            lVar.n0();
            lVar.p0(z17);
        }
        return jz5.f0.f302826a;
    }
}
