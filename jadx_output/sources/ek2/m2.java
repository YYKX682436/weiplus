package ek2;

/* loaded from: classes3.dex */
public final class m2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.l2 f253504u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(long j17, long j18, int i17, java.lang.String verificationId, ek2.l2 l2Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(verificationId, "verificationId");
        this.f253504u = l2Var;
        r45.cb2 cb2Var = new r45.cb2();
        cb2Var.set(4, java.lang.Long.valueOf(j17));
        cb2Var.set(3, java.lang.Long.valueOf(j18));
        cb2Var.set(5, java.lang.Integer.valueOf(i17));
        cb2Var.set(6, verificationId);
        cb2Var.set(1, db2.t4.f228171a.a(5281));
        cb2Var.set(2, xy2.c.f(this.f16135n));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cb2Var;
        r45.db2 db2Var = new r45.db2();
        db2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) db2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = db2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivesuspiciousverify";
        lVar.f70667d = 5281;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSuspiciousVerify", "init: liveId:" + j17 + ", objectId:" + j18 + ", scene:" + i17 + ", verification_id:" + verificationId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.db2 resp = (r45.db2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSuspiciousVerify", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.l2 l2Var = this.f253504u;
        if (l2Var != null) {
            dk2.a0 a0Var = (dk2.a0) l2Var;
            boolean z17 = a0Var.f233164a;
            dk2.g0 g0Var = a0Var.f233165b;
            if (!z17) {
                g0Var.d(false);
                return;
            }
            if (i17 == 0 && i18 == 0) {
                if (g0Var.f233470c != 4) {
                    pm0.v.X(new dk2.b0(g0Var));
                    return;
                }
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = g0Var.f233469b;
                android.content.Context context = k0Var != null ? k0Var.getContext() : null;
                if (context == null) {
                    return;
                }
                pm0.v.X(new dk2.c0(context, g0Var));
            }
        }
    }
}
