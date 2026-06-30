package ee1;

/* loaded from: classes4.dex */
public final class h extends com.tencent.mm.modelbase.i {
    public h(java.lang.String appId, java.util.List fpanidList, java.util.List issuerIdList) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(fpanidList, "fpanidList");
        kotlin.jvm.internal.o.g(issuerIdList, "issuerIdList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rs0();
        lVar.f70665b = new r45.ss0();
        lVar.f70666c = "/cgi-bin/mmpay-bin/industry/nfccards/filtervalidnfccardlist";
        lVar.f70667d = 2770;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.m mVar = a17.f70710a;
        com.tencent.mm.protobuf.f fVar = mVar.f70684a;
        r45.rs0 rs0Var = fVar instanceof r45.rs0 ? (r45.rs0) fVar : null;
        if (rs0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestProtoBuf is not FilterValidNfcCardListRequest, actual=");
            com.tencent.mm.protobuf.f fVar2 = mVar.f70684a;
            sb6.append(fVar2 != null ? fVar2.getClass().getName() : null);
            throw new java.lang.IllegalStateException(sb6.toString().toString());
        }
        rs0Var.f385169d = appId;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(fpanidList);
        rs0Var.f385170e = linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.addAll(issuerIdList);
        rs0Var.f385171f = linkedList2;
        p(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNFCCardFilter", "init, appId=%s, fpanidListSize=%d, issuerIdListSize=%d", appId, java.lang.Integer.valueOf(fpanidList.size()), java.lang.Integer.valueOf(issuerIdList.size()));
    }
}
