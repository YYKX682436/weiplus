package e20;

/* loaded from: classes9.dex */
public final class b implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pq.a f246467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20.h f246468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f246469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f246470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f246471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f246472f;

    public b(pq.a aVar, e20.h hVar, l81.b1 b1Var, kotlin.jvm.internal.c0 c0Var, java.lang.String str, boolean z17) {
        this.f246467a = aVar;
        this.f246468b = hVar;
        this.f246469c = b1Var;
        this.f246470d = c0Var;
        this.f246471e = str;
        this.f246472f = z17;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void c(com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.api.WeAppExportColdLaunchInfoBundle weAppExportColdLaunchInfoBundle;
        com.tencent.mm.plugin.appbrand.api.WeAppExportWarmLaunchInfoBundle weAppExportWarmLaunchInfoBundle;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLaunchComplete appId:");
        l81.b1 b1Var = this.f246469c;
        sb6.append(b1Var.f317014b);
        sb6.append(", username:");
        sb6.append(b1Var.f317012a);
        sb6.append(", isWarmLaunch:");
        boolean z17 = false;
        sb6.append(weAppExportLaunchInfoBundle != null && weAppExportLaunchInfoBundle.f74976f);
        sb6.append(", onCompleteHandled: ");
        kotlin.jvm.internal.c0 c0Var = this.f246470d;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", sb6.toString());
        boolean z18 = c0Var.f310112d;
        java.lang.String str2 = this.f246471e;
        if (z18) {
            com.tencent.mars.xlog.Log.w("ECS_O.Router.Wxa", "onLaunchComplete already handled " + str2);
            return;
        }
        c0Var.f310112d = true;
        if (this.f246472f) {
            this.f246468b.getClass();
            if (weAppExportLaunchInfoBundle != null) {
                int ordinal = weAppExportLaunchInfoBundle.f74981n.ordinal();
                if (ordinal == 1) {
                    str = "webview";
                } else if (ordinal == 2) {
                    str = "skyline";
                }
                if (!(weAppExportLaunchInfoBundle == null && weAppExportLaunchInfoBundle.f74976f) && (weAppExportWarmLaunchInfoBundle = weAppExportLaunchInfoBundle.f74978h) != null) {
                    z20.e eVar = z20.e.f469543e;
                    z20.b bVar = new z20.b();
                    bVar.f469537a = eVar;
                    bw5.q9 q9Var = new bw5.q9();
                    q9Var.f31999d = "ecso_open";
                    q9Var.f32013u[1] = true;
                    java.lang.String str3 = str;
                    q9Var.c(java.lang.System.currentTimeMillis());
                    q9Var.b(2);
                    bVar.f469538b = q9Var;
                    bVar.f(str2);
                    bVar.c("native_LaunchComplete");
                    bVar.f469538b.f32012t.add("wxa_service");
                    jz5.l lVar = new jz5.l("isWarmLaunch", "1");
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(weAppExportLaunchInfoBundle.f74975e);
                    kotlin.jvm.internal.o.g(valueOf, "<this>");
                    jz5.l lVar2 = new jz5.l("isPreRender", valueOf.toString());
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(weAppExportWarmLaunchInfoBundle.f74984f.ordinal());
                    kotlin.jvm.internal.o.g(valueOf2, "<this>");
                    bVar.e(kz5.c1.k(lVar, lVar2, new jz5.l("entryPageNavigationType", valueOf2.toString()), new jz5.l("start_mode", "hot"), new jz5.l("version", weAppExportLaunchInfoBundle.f74980m), new jz5.l("render_mode", str3)));
                    bVar.d();
                    if (weAppExportWarmLaunchInfoBundle.f74984f != l81.a1.f317007e) {
                        z20.e eVar2 = z20.e.f469544f;
                        z20.b bVar2 = new z20.b();
                        bVar2.f469537a = eVar2;
                        bw5.q9 q9Var2 = new bw5.q9();
                        q9Var2.f31999d = "ecso_open";
                        q9Var2.f32013u[1] = true;
                        q9Var2.c(java.lang.System.currentTimeMillis());
                        q9Var2.b(2);
                        bVar2.f469538b = q9Var2;
                        bVar2.f(str2);
                        bVar2.c("native_done");
                        bVar2.a();
                        return;
                    }
                    return;
                }
                if (weAppExportLaunchInfoBundle != null && !weAppExportLaunchInfoBundle.f74976f) {
                    z17 = true;
                }
                if (z17 || (weAppExportColdLaunchInfoBundle = weAppExportLaunchInfoBundle.f74977g) == null) {
                }
                int i17 = weAppExportLaunchInfoBundle.f74974d;
                z20.e eVar3 = z20.e.f469543e;
                z20.b bVar3 = new z20.b();
                bVar3.f469537a = eVar3;
                bw5.q9 q9Var3 = new bw5.q9();
                q9Var3.f31999d = "ecso_open";
                q9Var3.f32013u[1] = true;
                q9Var3.c(java.lang.System.currentTimeMillis());
                q9Var3.b(2);
                bVar3.f469538b = q9Var3;
                bVar3.f(str2);
                bVar3.c("native_LaunchComplete");
                bVar3.f469538b.f32012t.add("wxa_service");
                jz5.l lVar3 = new jz5.l("isWarmLaunch", "0");
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf((i17 / 10) % 10);
                kotlin.jvm.internal.o.g(valueOf3, "<this>");
                jz5.l lVar4 = new jz5.l("preloadAppServiceType", valueOf3.toString());
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17 % 10);
                kotlin.jvm.internal.o.g(valueOf4, "<this>");
                bVar3.e(kz5.c1.k(lVar3, lVar4, new jz5.l("preloadWebViewType", valueOf4.toString()), new jz5.l("start_mode", "cold"), new jz5.l("version", weAppExportLaunchInfoBundle.f74980m), new jz5.l("render_mode", str)));
                bVar3.d();
                for (java.util.Map.Entry entry : kz5.c1.k(new jz5.l("wxa_TotalStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74959d)), new jz5.l("wxa_TotalEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74960e)), new jz5.l("wxa_GetContactStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74961f)), new jz5.l("wxa_GetContactEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74962g)), new jz5.l("wxa_RscPreStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74963h)), new jz5.l("wxa_RscPreEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74964i)), new jz5.l("wxa_LaunchStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74965m)), new jz5.l("wxa_LaunchEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74966n)), new jz5.l("wxa_PkgPreStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74967o)), new jz5.l("wxa_PkgPreEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74968p)), new jz5.l("wxa_JsApiPreStart", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74969q)), new jz5.l("wxa_JsApiPreEnd", java.lang.Long.valueOf(weAppExportColdLaunchInfoBundle.f74970r))).entrySet()) {
                    java.lang.String str4 = (java.lang.String) entry.getKey();
                    long longValue = ((java.lang.Number) entry.getValue()).longValue();
                    if (longValue > 0) {
                        z20.e eVar4 = z20.e.f469543e;
                        z20.b bVar4 = new z20.b();
                        bVar4.f469537a = eVar4;
                        bw5.q9 q9Var4 = new bw5.q9();
                        q9Var4.f31999d = "ecso_open";
                        q9Var4.f32013u[1] = true;
                        q9Var4.c(java.lang.System.currentTimeMillis());
                        q9Var4.b(2);
                        bVar4.f469538b = q9Var4;
                        bVar4.f(str2);
                        bVar4.c(str4);
                        bVar4.f469538b.c(longValue);
                        bVar4.a();
                    }
                }
                return;
            }
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
            if (!(weAppExportLaunchInfoBundle == null && weAppExportLaunchInfoBundle.f74976f)) {
            }
            if (weAppExportLaunchInfoBundle != null) {
                z17 = true;
            }
            if (z17) {
            }
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "onAppBrandUIEnter");
        yz5.p pVar = this.f246467a.f357553c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f28492d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f28496h;
            zArr[1] = true;
            i8Var.f28493e = this.f246468b.f414550a;
            zArr[2] = true;
            pVar.invoke(bw5.j8.EcsOpenEventType_wxaDidShow, i8Var);
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("ECS_O.Router.Wxa", "onAppBrandUIExit");
        yz5.p pVar = this.f246467a.f357553c;
        if (pVar != null) {
            bw5.i8 i8Var = new bw5.i8();
            i8Var.f28492d = bw5.k8.EcsOpenPlatform_Native;
            boolean[] zArr = i8Var.f28496h;
            zArr[1] = true;
            i8Var.f28493e = this.f246468b.f414550a;
            zArr[2] = true;
            pVar.invoke(bw5.j8.EcsOpenEventType_wxaDidExit, i8Var);
        }
    }
}
