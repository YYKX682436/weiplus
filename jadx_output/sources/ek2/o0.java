package ek2;

/* loaded from: classes.dex */
public final class o0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.n0 f253509u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253510v;

    public o0(r45.kv0 kv0Var, java.lang.String str, byte[] bArr, byte[] bArr2, byte[] bArr3, r45.rn1 rn1Var, ek2.n0 n0Var) {
        super(null, 1, null);
        this.f253509u = n0Var;
        this.f253510v = "Finder.CgiFinderLiveCandidate";
        r45.n71 n71Var = new r45.n71();
        n71Var.set(1, kv0Var);
        n71Var.set(2, str);
        n71Var.set(4, com.tencent.mm.protobuf.g.b(bArr));
        n71Var.set(3, com.tencent.mm.protobuf.g.b(bArr3));
        n71Var.set(5, com.tencent.mm.protobuf.g.b(bArr2));
        n71Var.set(6, rn1Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = n71Var;
        r45.o71 o71Var = new r45.o71();
        o71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) o71Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = o71Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlivemiccandidatelist";
        lVar.f70667d = 6845;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.o71 resp = (r45.o71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253510v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.n0 n0Var = this.f253509u;
        if (n0Var != null) {
            n0Var.a(i17, i18, str, resp);
        }
    }
}
