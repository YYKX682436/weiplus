package db2;

/* loaded from: classes2.dex */
public final class n1 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var, java.lang.String str, java.lang.String str2) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        bw5.u6 u6Var = new bw5.u6();
        u6Var.f33742d = finderUsername;
        boolean[] zArr = u6Var.f33747i;
        zArr[2] = true;
        u6Var.f33744f = gVar;
        zArr[4] = true;
        u6Var.f33745g = str == null ? "" : str;
        zArr[5] = true;
        u6Var.f33746h = str2;
        zArr[6] = true;
        lVar.f70664a = u6Var;
        bw5.v6 v6Var = new bw5.v6();
        v6Var.BaseResponse = new r45.ie();
        v6Var.f34164g[1] = true;
        r45.ie baseResponse = v6Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = v6Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getfinderhomepageproducttab";
        lVar.f70667d = 21912;
        p(lVar.a());
    }
}
