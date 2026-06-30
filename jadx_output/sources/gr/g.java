package gr;

/* loaded from: classes9.dex */
public final class g extends com.tencent.mm.modelbase.i {
    public g(int i17, java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.rp3 rp3Var = new r45.rp3();
        r45.sp3 sp3Var = new r45.sp3();
        r45.zq6 zq6Var = new r45.zq6();
        zq6Var.f392311d = i17;
        zq6Var.f392312e = finderUsername;
        rp3Var.f385074d = zq6Var;
        rp3Var.f385075e = gVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = rp3Var;
        lVar.f70665b = sp3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getugcemojilist";
        lVar.f70667d = 10742;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        az2.k.f16139a.a(10742);
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }
}
