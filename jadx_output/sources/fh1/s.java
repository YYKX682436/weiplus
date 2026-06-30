package fh1;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f262592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f262593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f262595g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fh1.x0 f262596h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262597i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262598m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fh1.z zVar, java.lang.String str, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo, fh1.x0 x0Var, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f262593e = zVar;
        this.f262594f = str;
        this.f262595g = wxaPkgWrappingInfo;
        this.f262596h = x0Var;
        this.f262597i = str2;
        this.f262598m = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fh1.s(this.f262593e, this.f262594f, this.f262595g, this.f262596h, this.f262597i, this.f262598m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fh1.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f262592d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fh1.z zVar = this.f262593e;
            this.f262592d = 1;
            obj = zVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                fh1.x0 x0Var = this.f262596h;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str2 = this.f262594f;
                java.lang.String str3 = this.f262597i;
                java.lang.String str4 = this.f262598m;
                jSONObject.put("appId", str2);
                jSONObject.put("envVersion", str3);
                jSONObject.put("appPath", str4);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                x0Var.G1("onMiniprogramPackageReady", jSONObject2);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.p pVar = com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.v.f84319b;
        java.lang.String c17 = this.f262593e.c();
        if (this.f262593e.f262635i != null) {
            str = com.tencent.mm.plugin.magicbrush.a5.f147843h;
            if (str == null) {
                str = "";
            }
        } else {
            str = com.tencent.mm.plugin.magicbrush.a5.f147843h;
            kotlin.jvm.internal.o.d(str);
        }
        java.lang.String str5 = str;
        java.lang.String str6 = this.f262594f;
        java.lang.String c18 = this.f262593e.c();
        fh1.z zVar2 = this.f262593e;
        com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs mBFramePkgManagementFsIPCInitArgs = new com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs(c18, zVar2.f262629c, zVar2.f262630d);
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f262595g;
        this.f262592d = 2;
        if (pVar.a(c17, str5, str6, mBFramePkgManagementFsIPCInitArgs, wxaPkgWrappingInfo, this) == aVar) {
            return aVar;
        }
        fh1.x0 x0Var2 = this.f262596h;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String str22 = this.f262594f;
        java.lang.String str32 = this.f262597i;
        java.lang.String str42 = this.f262598m;
        jSONObject3.put("appId", str22);
        jSONObject3.put("envVersion", str32);
        jSONObject3.put("appPath", str42);
        java.lang.String jSONObject22 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject22, "toString(...)");
        x0Var2.G1("onMiniprogramPackageReady", jSONObject22);
        return f0Var;
    }
}
