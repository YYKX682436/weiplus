package hr;

/* loaded from: classes9.dex */
public final class b extends com.tencent.mm.modelbase.i {
    public b(java.lang.String groupId, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        r45.pl0 pl0Var = new r45.pl0();
        r45.ql0 ql0Var = new r45.ql0();
        pl0Var.f383150f = 0;
        pl0Var.f383148d = groupId;
        pl0Var.f383151g = i17;
        pl0Var.f383149e = null;
        pl0Var.f383152h = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? 1 : 0;
        pl0Var.f383153i = x51.j1.h(str, false);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pl0Var;
        lVar.f70665b = ql0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/exchangeemotionpack";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetNgStrength;
        lVar.f70668e = 213;
        lVar.f70669f = 1000000213;
        p(lVar.a());
    }
}
