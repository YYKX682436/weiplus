package ek2;

/* loaded from: classes.dex */
public final class k0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.j0 f253487u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f253488v;

    public k0(long j17, long j18, java.lang.String str, byte[] bArr, int i17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3, ek2.j0 j0Var) {
        super(null, 1, null);
        this.f253487u = j0Var;
        this.f253488v = "Finder.CgiFinderLiveBatchGetMicContact";
        r45.cm1 cm1Var = new r45.cm1();
        cm1Var.set(3, java.lang.Long.valueOf(j17));
        cm1Var.set(1, db2.t4.f228171a.a(4224));
        cm1Var.set(4, java.lang.Long.valueOf(j18));
        cm1Var.set(5, str);
        cm1Var.set(2, com.tencent.mm.protobuf.g.b(bArr));
        cm1Var.set(7, xy2.c.f(this.f16135n));
        cm1Var.set(11, java.lang.Integer.valueOf(i17));
        cm1Var.set(8, linkedList);
        cm1Var.set(9, linkedList2);
        cm1Var.set(10, linkedList3);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cm1Var;
        r45.dm1 dm1Var = new r45.dm1();
        dm1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dm1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = dm1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivebatchgetmiccontact";
        lVar.f70667d = 4224;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dm1 resp = (r45.dm1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253488v, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.j0 j0Var = this.f253487u;
        if (j0Var != null) {
            pm0.v.X(new yi2.f0(((yi2.g0) j0Var).f462513a, resp));
        }
    }
}
