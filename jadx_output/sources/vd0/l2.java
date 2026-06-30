package vd0;

/* loaded from: classes8.dex */
public final class l2 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelsimple.p0 p0Var = m1Var instanceof com.tencent.mm.modelsimple.p0 ? (com.tencent.mm.modelsimple.p0) m1Var : null;
            com.tencent.mm.network.v0 reqResp = p0Var != null ? p0Var.getReqResp() : null;
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            r45.tl3 tl3Var = obj instanceof r45.tl3 ? (r45.tl3) obj : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("afterNetSceneGetProfile resp:");
            sb6.append(tl3Var != null);
            com.tencent.mars.xlog.Log.i("MicorMsg.SettingFindMoreReddotService", sb6.toString());
            if (tl3Var != null) {
                ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ni(false);
            }
        }
    }
}
