package ek2;

/* loaded from: classes.dex */
public final class g extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.f f253450u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253451v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, java.lang.String str, byte[] bArr, int i17, r45.ch1 msg, ek2.f fVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f253450u = fVar;
        this.f253451v = "CgiFinderAnchorInviteMicWithAudience";
        r45.mg1 mg1Var = new r45.mg1();
        mg1Var.set(4, java.lang.Long.valueOf(j17));
        mg1Var.set(1, db2.t4.f228171a.a(13907));
        mg1Var.set(5, java.lang.Long.valueOf(j18));
        mg1Var.set(6, str);
        mg1Var.set(8, xy2.c.f(this.f16135n));
        mg1Var.set(7, java.lang.Integer.valueOf(i17));
        mg1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        mg1Var.set(3, msg);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = mg1Var;
        r45.ng1 ng1Var = new r45.ng1();
        ng1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ng1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ng1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveanchorinvitemicwithaudience";
        lVar.f70667d = 13907;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ng1 resp = (r45.ng1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253451v, "onCgiEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        ek2.f fVar2 = this.f253450u;
        if (i17 == 0 && i18 == 0) {
            if (fVar2 != null) {
                fVar2.a(resp);
            }
        } else if (fVar2 != null) {
            fVar2.b(i17, i18, str);
        }
    }
}
