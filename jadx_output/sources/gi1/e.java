package gi1;

/* loaded from: classes9.dex */
public final class e implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.o5 f272239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272241f;

    public e(com.tencent.mm.plugin.appbrand.service.o5 o5Var, java.lang.String str, int i17) {
        this.f272239d = o5Var;
        this.f272240e = str;
        this.f272241f = i17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2 = this.f272240e;
        com.tencent.mm.plugin.appbrand.service.o5 o5Var = this.f272239d;
        int i19 = this.f272241f;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CgiWxaRuntimeSetVoipCallSubIdStatus", "onResp, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (o5Var != null) {
                ((com.tencent.mm.ui.chatting.viewitems.wi) o5Var).a(str2, i19, false);
            }
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.WxaRuntimeSetVoipCallSubIdStatusReq");
        r45.ve7 ve7Var = (r45.ve7) fVar;
        if (o5Var != null) {
            ((com.tencent.mm.ui.chatting.viewitems.wi) o5Var).a(ve7Var.f388179d, i19, true);
        }
        gi1.n.a(str2, i19);
        return 0;
    }
}
