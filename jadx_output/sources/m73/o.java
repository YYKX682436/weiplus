package m73;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.p0 p0Var = m1Var instanceof com.tencent.mm.modelsimple.p0 ? (com.tencent.mm.modelsimple.p0) m1Var : null;
            com.tencent.mm.network.v0 reqResp = p0Var != null ? p0Var.getReqResp() : null;
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            if ((obj instanceof r45.tl3 ? (r45.tl3) obj : null) != null) {
                o73.j Bi = ((m73.q) i95.n0.c(m73.q.class)).Bi();
                java.lang.String a17 = en1.a.a();
                kotlin.jvm.internal.o.f(a17, "username(...)");
                Bi.b4(a17);
            }
        }
    }
}
