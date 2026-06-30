package vh0;

/* loaded from: classes8.dex */
public final class e2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final vh0.e2 f436852d = new vh0.e2();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = i18 != 0;
        if (!z17 && i17 != 0) {
            z17 = true;
        }
        if (!z17 && oVar == null) {
            z17 = true;
        }
        boolean z18 = (z17 || oVar.f70711b.f70700a != null) ? z17 : true;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModServiceAgreementReq");
        r45.to4 to4Var = (r45.to4) fVar;
        java.util.LinkedList<r45.r6> agreement_info = to4Var.f386634e;
        kotlin.jvm.internal.o.f(agreement_info, "agreement_info");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(agreement_info, 10));
        for (r45.r6 r6Var : agreement_info) {
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(r6Var.f384567d), java.lang.Integer.valueOf(r6Var.f384568e)));
        }
        if (z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotAgreementService", "[-] modserviceagreement cgi fail, errCode: " + i18 + ", errType: " + i17 + ", errMsg: " + str + ". op: " + to4Var.f386633d + ", rec: " + arrayList + ", resp: " + oVar.f70711b.f70700a);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotAgreementService", "[+] modserviceagreement cgi success, op: " + to4Var.f386633d + ", rec: " + arrayList);
        }
        return 0;
    }
}
