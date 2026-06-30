package gi1;

/* loaded from: classes9.dex */
public final class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.n5 f272237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272238e;

    public d(com.tencent.mm.plugin.appbrand.service.n5 n5Var, java.lang.String str) {
        this.f272237d = n5Var;
        this.f272238e = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f272238e;
        com.tencent.mm.plugin.appbrand.service.n5 n5Var = this.f272237d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiWxaRuntimeGetVoipCallSubIdStatus", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (n5Var != null) {
                ((com.tencent.mm.ui.chatting.viewitems.vi) n5Var).a(str2, -1, false);
            }
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeGetVoipCallSubIdStatusReq");
        r45.se7 se7Var = (r45.se7) fVar;
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeGetVoipCallSubIdStatusResp");
        r45.te7 te7Var = (r45.te7) fVar2;
        if (n5Var != null) {
            ((com.tencent.mm.ui.chatting.viewitems.vi) n5Var).a(se7Var.f385661d, te7Var.f386364d, true);
        }
        gi1.n.a(str2, te7Var.f386364d);
        return 0;
    }
}
