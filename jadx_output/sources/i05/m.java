package i05;

/* loaded from: classes4.dex */
public final class m implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f286591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i05.j f286592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286593f;

    public m(long j17, i05.j jVar, java.lang.String str) {
        this.f286591d = j17;
        this.f286592e = jVar;
        this.f286593f = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        long j17;
        long a17 = c01.id.a() - this.f286591d;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(m1Var.getType());
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[3] = str == null ? "" : str;
        objArr[4] = java.lang.Long.valueOf(a17);
        com.tencent.mars.xlog.Log.i("WxImeHelper", "verifyIdentityToken type:%d errType:%d errCode:%d errMsg:%s, diffTime:%s", objArr);
        java.util.HashMap i19 = kz5.c1.i(new jz5.l("command_time_consume", java.lang.Long.valueOf(a17)));
        i05.j jVar = this.f286592e;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            jz5.f0 f0Var = null;
            i05.g gVar = fVar instanceof i05.g ? (i05.g) fVar : null;
            if (gVar != null) {
                i05.j jVar2 = this.f286592e;
                i05.i iVar = gVar.f286572d;
                jz5.f0 f0Var2 = jz5.f0.f302826a;
                if (iVar != null) {
                    com.tencent.mars.xlog.Log.i("WxImeHelper", "verifyIdentityToken KeyBoardVerifyWxTokenResponse, err_code:" + iVar.f286576d + ", err_msg:" + iVar.f286577e + ", ts:" + iVar.f286578f + ", expire:" + iVar.f286579g);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putString("mmkv_key_verify_token_success_str", this.f286593f);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype").putLong("mmkv_key_verify_token_valid_time", c01.id.b() + (iVar.f286579g * 1000));
                    i05.j.b(jVar2, 0L, null, i19, 2, null);
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.e("WxImeHelper", "verifyIdentityToken responseProtoBuf kb_resp null");
                    j17 = -1;
                    jVar2.a(-1L, "responseProtoBuf responseProtoBuf kb_resp null", i19);
                } else {
                    j17 = -1;
                }
                f0Var = f0Var2;
            } else {
                j17 = -1;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("WxImeHelper", "verifyIdentityToken responseProtoBuf as KeyBoardVerifyWxTokenResponse null");
                jVar.a(j17, "responseProtoBuf as KeyBoardVerifyWxTokenResponse null", i19);
            }
        } else {
            jVar.a(-1L, "errType:" + i17 + ";errCode:" + i18 + ";errMsg:" + str, i19);
        }
        return 0;
    }
}
