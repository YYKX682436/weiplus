package o25;

/* loaded from: classes4.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f342516d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f342517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f342519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342521i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o25.c2 f342523n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.String str3, java.lang.String str4, o25.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f342518f = str;
        this.f342519g = context;
        this.f342520h = str2;
        this.f342521i = str3;
        this.f342522m = str4;
        this.f342523n = c2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        o25.f2 f2Var = new o25.f2(this.f342518f, this.f342519g, this.f342520h, this.f342521i, this.f342522m, this.f342523n, continuation);
        f2Var.f342517e = obj;
        return f2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((o25.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f342516d;
        java.lang.String str2 = this.f342521i;
        java.lang.String str3 = this.f342520h;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str4 = this.f342518f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f342517e;
                r01.a2 a2Var = new r01.a2();
                r45.m15 m15Var = (r45.m15) a2Var.f68420a;
                m15Var.f380071d = str3;
                m15Var.f380072e = str2;
                this.f342517e = y0Var;
                this.f342516d = 1;
                obj = a2Var.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            r45.n15 n15Var = (r45.n15) obj;
            r45.al alVar = n15Var.f380993d;
            java.lang.String obj2 = (alVar == null || (str = alVar.f370077d) == null) ? null : r26.n0.u0(str).toString();
            if (obj2 == null || obj2.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", cgi response invalid");
                return f0Var;
            }
            r45.al alVar2 = n15Var.f380993d;
            r45.xa xaVar = alVar2 != null ? alVar2.f370078e : null;
            if (xaVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", cgi response invalid");
                return f0Var;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", obj2);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, n15Var.f380994e);
            java.lang.String str5 = "sourceType=APP&sourceAppId=" + str3;
            java.lang.String str6 = this.f342522m;
            if (!(str6 == null || str6.length() == 0)) {
                str5 = str6 + '&' + str5;
            }
            bundle.putString("query", str5);
            bundle.putLong("timeout", xaVar.f389904d);
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, xaVar.f389909i);
            bundle.putBoolean("withDownloadLoading", xaVar.f389913p);
            bundle.putBoolean("isHalfScreen", xaVar.f389907g == 2);
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            liteAppReferrerInfo.scene = com.tencent.liteapp.gen.LiteAppOpenScene.OPEN_SDK;
            liteAppReferrerInfo.sceneId = str3;
            bundle.putParcelable("liteappReferrerInfo", liteAppReferrerInfo);
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            o25.c2 c2Var = this.f342523n;
            sVar.f144167d = new o25.e2(str4, str3, str2, c2Var);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(this.f342519g, bundle, xaVar.f389905e, xaVar.f389906f, sVar, new o25.d2(str4, c2Var, str3, str2));
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenBusinessViewAsLiteAppHandler", "handle for sessionId:" + str4 + ", send cgi failed " + e17);
            return f0Var;
        }
    }
}
