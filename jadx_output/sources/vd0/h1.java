package vd0;

/* loaded from: classes11.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f435422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.api.BindFingerprintCallback f435424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd0.c2 f435425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.api.FingerprintVerifyParam f435426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f435427i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.k57 f435428m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback, wd0.c2 c2Var, com.tencent.mm.feature.setting.api.FingerprintVerifyParam fingerprintVerifyParam, vd0.v1 v1Var, r45.k57 k57Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435423e = i17;
        this.f435424f = bindFingerprintCallback;
        this.f435425g = c2Var;
        this.f435426h = fingerprintVerifyParam;
        this.f435427i = v1Var;
        this.f435428m = k57Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.h1(this.f435423e, this.f435424f, this.f435425g, this.f435426h, this.f435427i, this.f435428m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f435422d;
        int i18 = this.f435423e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.th thVar = new r45.th();
            wd0.f[] fVarArr = wd0.f.f444711d;
            r45.dy6 dy6Var = null;
            if (i18 == 2) {
                thVar.f386418d = 2;
                thVar.f386419e = null;
            } else {
                thVar.f386418d = i18;
                com.tencent.mm.feature.setting.api.FingerprintVerifyParam fingerprintVerifyParam = this.f435426h;
                if (fingerprintVerifyParam != null) {
                    this.f435427i.getClass();
                    dy6Var = new r45.dy6();
                    r45.gc6 gc6Var = new r45.gc6();
                    r45.hc6 hc6Var = new r45.hc6();
                    r45.ic6 ic6Var = new r45.ic6();
                    com.tencent.mm.feature.setting.api.AskParam askParam = fingerprintVerifyParam.f67817d;
                    gc6Var.f375095d = askParam.f67807e;
                    gc6Var.f375096e = askParam.f67808f;
                    com.tencent.mm.feature.setting.api.AuthKeyParam authKeyParam = fingerprintVerifyParam.f67818e;
                    java.lang.String str = authKeyParam.f67811e;
                    gc6Var.f375097f = str;
                    java.lang.String str2 = authKeyParam.f67812f;
                    gc6Var.f375098g = str2;
                    java.lang.String str3 = askParam.f67809g;
                    hc6Var.f376053d = str3;
                    hc6Var.f376054e = "920";
                    hc6Var.f376055f = str;
                    hc6Var.f376056g = str2;
                    ic6Var.f376935d = str3;
                    ic6Var.f376936e = "920";
                    ic6Var.f376937f = str;
                    ic6Var.f376938g = str2;
                    dy6Var.f372861e = gc6Var;
                    dy6Var.f372862f = hc6Var;
                    dy6Var.f372863g = ic6Var;
                    dy6Var.f372860d = str3.length() == 0 ? 1 : 2;
                    com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] cgiVerifyParam: " + dy6Var);
                }
                thVar.f386419e = dy6Var;
            }
            thVar.f386420f = new com.tencent.mm.protobuf.g(this.f435428m.toByteArray());
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 10842;
            lVar.f70666c = "/cgi-bin/micromsg-bin/bindfingerprintforlogin";
            lVar.f70664a = thVar;
            lVar.f70665b = new r45.uh();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            this.f435422d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] bindFingerprintCgi errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b + ", errMsg isNull: " + fVar.f70617c + ",opcode is " + i18);
        int i19 = fVar.f70616b;
        com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback = this.f435424f;
        bindFingerprintCallback.f67814e = i19;
        bindFingerprintCallback.f67813d = fVar.f70615a;
        java.lang.String str4 = fVar.f70617c;
        if (str4 != null) {
            bindFingerprintCallback.getClass();
            bindFingerprintCallback.f67815f = str4;
        }
        java.lang.String obj2 = ((r45.uh) fVar.f70618d).toString();
        bindFingerprintCallback.getClass();
        kotlin.jvm.internal.o.g(obj2, "<set-?>");
        bindFingerprintCallback.f67816g = obj2;
        this.f435425g.a(bindFingerprintCallback);
        return jz5.f0.f302826a;
    }
}
