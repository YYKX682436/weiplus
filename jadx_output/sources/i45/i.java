package i45;

/* loaded from: classes4.dex */
public final class i implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f288412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i45.d f288413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288414f;

    public i(long j17, i45.d dVar, java.lang.String str) {
        this.f288412d = j17;
        this.f288413e = dVar;
        this.f288414f = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        long j17;
        long a17 = c01.id.a() - this.f288412d;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(m1Var.getType());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[3] = str == null ? "" : str;
        objArr[4] = java.lang.Long.valueOf(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxImeHelper", "verifyIdentityToken type:%d errType:%d errCode:%d errMsg:%s, diffTime:%s", objArr);
        java.util.HashMap i19 = kz5.c1.i(new jz5.l("command_time_consume", java.lang.Long.valueOf(a17)));
        i45.d dVar = this.f288413e;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            jz5.f0 f0Var = null;
            r45.n44 n44Var = fVar instanceof r45.n44 ? (r45.n44) fVar : null;
            if (n44Var != null) {
                i45.d dVar2 = this.f288413e;
                r45.vy6 vy6Var = n44Var.f381075d;
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (vy6Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxImeHelper", "verifyIdentityToken KeyBoardVerifyWxTokenResponse, err_code:" + vy6Var.f388677d + ", err_msg:" + vy6Var.f388678e + ", ts:" + vy6Var.f388679f + ", expire:" + vy6Var.f388680g);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putString("mmkv_key_verify_token_success_str", this.f288414f);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_verify_token_valid_time", c01.id.b() + (vy6Var.f388680g * 1000));
                    i45.d.b(dVar2, 0L, null, i19, 2, null);
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WxImeHelper", "verifyIdentityToken responseProtoBuf kb_resp null");
                    j17 = -1;
                    dVar2.a(-1L, "responseProtoBuf responseProtoBuf kb_resp null", i19);
                } else {
                    j17 = -1;
                }
                f0Var = f0Var2;
            } else {
                j17 = -1;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxImeHelper", "verifyIdentityToken responseProtoBuf as KeyBoardVerifyWxTokenResponse null");
                dVar.a(j17, "responseProtoBuf as KeyBoardVerifyWxTokenResponse null", i19);
            }
        } else {
            dVar.a(-1L, "errType:" + i17 + ";errCode:" + i18 + ";errMsg:" + str, i19);
        }
        return 0;
    }
}
