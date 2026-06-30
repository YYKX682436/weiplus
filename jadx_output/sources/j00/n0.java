package j00;

/* loaded from: classes9.dex */
public final class n0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f296841f;

    public n0(java.lang.String str, j00.k1 k1Var, com.tencent.mm.storage.f9 f9Var) {
        this.f296839d = str;
        this.f296840e = k1Var;
        this.f296841f = f9Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "updateGiftMsgByCgi, cgi response, giftMsgId: " + this.f296839d + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.MmecGetPresentOrderResp");
            ((ku5.t0) ku5.t0.f312615d).h(new j00.m0(this.f296840e, this.f296841f, (bw5.bf0) fVar), "MicroMsg.EcsGiftMsgService");
        }
        return 0;
    }
}
