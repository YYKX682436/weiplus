package jy3;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jy3.b f302503f = new jy3.b(null);

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f302504d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f302505e;

    public c() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.go();
        lVar.f70665b = new r45.ho();
        lVar.f70666c = "/cgi-bin/mmiot-bin/mmiot/mmiot_build_device_secure_channel";
        lVar.f70667d = 5043;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f302505e = lVar.a();
    }

    public final com.tencent.mm.protobuf.g H(java.lang.String base64) {
        kotlin.jvm.internal.o.g(base64, "base64");
        try {
            return new com.tencent.mm.protobuf.g(android.util.Base64.decode(base64, 0));
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "decodeBase64.:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    public final r45.ho I() {
        com.tencent.mm.modelbase.o oVar = this.f302505e;
        if (oVar != null) {
            kotlin.jvm.internal.o.d(oVar);
            if (oVar.f70711b.f70700a != null) {
                kotlin.jvm.internal.o.d(oVar);
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelResp");
                return (r45.ho) fVar;
            }
        }
        return null;
    }

    public final void J(jy3.a handShakeBody) {
        kotlin.jvm.internal.o.g(handShakeBody, "handShakeBody");
        com.tencent.mm.modelbase.o oVar = this.f302505e;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70710a.f70684a : null;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelReq");
        r45.go goVar = (r45.go) fVar;
        goVar.f375390g = handShakeBody.f302493a;
        r45.j40 j40Var = new r45.j40();
        j40Var.f377571d = H(handShakeBody.f302494b);
        j40Var.f377573f = H(handShakeBody.f302495c);
        j40Var.f377574g = H(handShakeBody.f302496d);
        goVar.f375387d = j40Var;
        r45.l40 l40Var = new r45.l40();
        l40Var.f379122d = H(handShakeBody.f302497e);
        goVar.f375388e = l40Var;
        r45.c40 c40Var = new r45.c40();
        c40Var.f371261d = H(handShakeBody.f302498f);
        c40Var.f371262e = H(handShakeBody.f302499g);
        c40Var.f371263f = handShakeBody.f302500h;
        c40Var.f371265h = handShakeBody.f302502j;
        c40Var.f371264g = handShakeBody.f302501i;
        goVar.f375389f = c40Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f302504d = u0Var;
        return dispatch(sVar, this.f302505e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5043;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.NetSceneBuildDeviceSecureChannel", "onGYNetEnd netId = " + i17 + " errType = " + i18 + " errCode = " + i19 + ' ' + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f302504d;
        kotlin.jvm.internal.o.d(u0Var);
        u0Var.onSceneEnd(i18, i19, str, this);
    }
}
