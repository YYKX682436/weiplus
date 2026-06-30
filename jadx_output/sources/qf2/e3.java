package qf2;

/* loaded from: classes.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.f f362352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362354h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362355i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f362356m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(xg2.h hVar, kotlin.coroutines.Continuation continuation, az2.f fVar, yz5.l lVar, qf2.q3 q3Var, java.lang.String str) {
        super(2, continuation);
        this.f362351e = hVar;
        this.f362352f = fVar;
        this.f362353g = lVar;
        this.f362354h = q3Var;
        this.f362355i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.e3(this.f362351e, continuation, this.f362352f, this.f362353g, this.f362354h, this.f362355i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.m52 m52Var;
        java.lang.String string;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f362350d;
        yz5.l lVar = this.f362353g;
        az2.f fVar = this.f362352f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.m52 m52Var2 = (r45.m52) ((xg2.i) this.f362351e).f454393b;
            com.tencent.mm.protobuf.g byteString = m52Var2.getByteString(1);
            qf2.q3 q3Var = this.f362354h;
            if (byteString == null && ((r45.qp1) m52Var2.getCustom(4)) != null) {
                r45.qp1 qp1Var = (r45.qp1) m52Var2.getCustom(4);
                if (qp1Var != null && (string = qp1Var.getString(1)) != null) {
                    db5.t7.makeText(q3Var.O6(), string, 0).show();
                }
                fVar.b();
                lVar.invoke(java.lang.Boolean.FALSE);
                return jz5.f0.f302826a;
            }
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context O6 = q3Var.O6();
            com.tencent.mm.protobuf.g byteString2 = m52Var2.getByteString(1);
            byte[] g17 = byteString2 != null ? byteString2.g() : null;
            if (g17 == null) {
                g17 = new byte[0];
            }
            this.f362356m = m52Var2;
            this.f362350d = 1;
            java.lang.Object Mk = ((c61.l7) b6Var).Mk(O6, g17, this.f362355i, this);
            if (Mk == aVar) {
                return aVar;
            }
            m52Var = m52Var2;
            obj = Mk;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m52Var = (r45.m52) this.f362356m;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar2 = (jz5.l) obj;
        com.tencent.mars.xlog.Log.i("FinderLivePayMicControl", "addPayPriceRequest success, pay result: " + lVar2 + " session_id: " + m52Var.getString(3));
        fVar.b();
        lVar.invoke(lVar2.f302833d);
        return jz5.f0.f302826a;
    }
}
