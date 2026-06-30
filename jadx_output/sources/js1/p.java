package js1;

/* loaded from: classes4.dex */
public final class p implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final js1.p f301496d = new js1.p();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            r45.mu3 mu3Var = fVar instanceof r45.mu3 ? (r45.mu3) fVar : null;
            if (mu3Var != null) {
                js1.s sVar = js1.s.f301499a;
                ((ku5.t0) ku5.t0.f312615d).h(new js1.r(mu3Var), "TransferRequestTokenManager");
                return 0;
            }
        }
        js1.s sVar2 = js1.s.f301499a;
        ((ku5.t0) ku5.t0.f312615d).h(js1.q.f301497d, "TransferRequestTokenManager");
        return 0;
    }
}
