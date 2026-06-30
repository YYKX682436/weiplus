package dt1;

/* loaded from: classes12.dex */
public abstract class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f243124h = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: d, reason: collision with root package name */
    public final r45.fr f243125d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f243126e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f243127f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.qr f243128g;

    public a(int i17, r45.fr pack) {
        kotlin.jvm.internal.o.g(pack, "pack");
        this.f243125d = pack;
        r45.qr qrVar = new r45.qr();
        this.f243128g = qrVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        qrVar.f384217e = pack;
        qrVar.f384216d = i17;
        lVar.f70664a = qrVar;
        r45.rr rrVar = new r45.rr();
        rrVar.setBaseResponse(new r45.ie());
        rrVar.getBaseResponse().f376960e = new r45.du5();
        lVar.f70665b = rrVar;
        lVar.f70666c = "/cgi-bin/micromsg-bin/bypsend";
        lVar.f70667d = 3862;
        this.f243126e = lVar.a();
    }

    public long H() {
        return 0L;
    }

    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
    }

    public void J(r45.rr resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f243127f = u0Var;
        f243124h.add(java.lang.Long.valueOf(H()));
        return dispatch(sVar, this.f243126e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3862;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mm.protobuf.f fVar = this.f243126e.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BypSendResponse");
        r45.rr rrVar = (r45.rr) fVar;
        com.tencent.mars.xlog.Log.i("Byp.CgiBypSend", "[onCgiBack] errType=" + i18 + " errCode=" + i19 + " errMsg=" + str + " resp=" + rrVar);
        f243124h.remove(java.lang.Long.valueOf(H()));
        if (i18 == 0 && i19 == 0) {
            J(rrVar);
        } else {
            I(i18, i19, str, rrVar);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f243127f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
