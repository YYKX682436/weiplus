package qg3;

/* loaded from: classes2.dex */
public final class n0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f362833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ev f362834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362835f;

    public n0(int i17, bw5.ev evVar, yz5.l lVar) {
        this.f362833d = i17;
        this.f362834e = evVar;
        this.f362835f = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", "fetchChannelFlow onCgiBack pullType:" + this.f362833d + ", errType:" + i17 + ", errCode:" + i18);
        yz5.l lVar = this.f362835f;
        if (i17 == 0 && i18 == 0 && oVar.f70711b.f70700a != null) {
            qg3.p1 p1Var = (qg3.p1) qg3.p1.f362843d.a();
            bw5.ev evVar = this.f362834e;
            urgen.ur_54A4.UR_1007.UR_7A24(p1Var.getCppPointer(), evVar != null ? evVar.toByteArray() : null);
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            bw5.wp wpVar = fVar instanceof bw5.wp ? (bw5.wp) fVar : null;
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mainFlowResp:");
                sb6.append((wpVar == null || (linkedList2 = wpVar.f34808e) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
                com.tencent.mars.xlog.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
                if ((wpVar == null || (linkedList = wpVar.f34808e) == null || linkedList.size() != 0) ? false : true) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 10022, 7);
                }
                byte[] byteArray = wpVar != null ? wpVar.toByteArray() : null;
                if (byteArray == null) {
                    byteArray = new byte[0];
                }
                lVar.invoke(byteArray);
            } catch (java.lang.Exception e17) {
                lVar.invoke(new byte[0]);
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
            }
        } else {
            lVar.invoke(new byte[0]);
        }
        return 0;
    }
}
