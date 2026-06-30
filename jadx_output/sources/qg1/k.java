package qg1;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f362771m;

    /* renamed from: n, reason: collision with root package name */
    public final int f362772n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f362773o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f362774p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile java.util.HashMap f362775q = new java.util.HashMap();

    public k(java.lang.String str, int i17, java.util.List list, boolean z17, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.launching.nb nbVar) {
        this.f362771m = str;
        this.f362772n = i17;
        this.f362773o = qualitySession;
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        r45.wb7 wb7Var = new r45.wb7();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            qg1.o oVar = (qg1.o) it.next();
            r45.vb7 vb7Var = new r45.vb7();
            vb7Var.f388085d = oVar.f362785a;
            vb7Var.f388086e = oVar.f362786b;
            vb7Var.f388087f = oVar.f362787c;
            wb7Var.f389047d.add(vb7Var);
        }
        wb7Var.f389048e = wo.w0.m();
        wb7Var.f389049f = android.os.Build.BRAND;
        wb7Var.f389050g = android.os.Build.MANUFACTURER;
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        wb7Var.f389051h = str3;
        wb7Var.f389054n = str3;
        wb7Var.f389055o = android.os.Build.VERSION.INCREMENTAL;
        wb7Var.f389056p = android.os.Build.DISPLAY;
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader a17 = com.tencent.mm.plugin.appbrand.appcache.x7.a();
        if (a17 != null) {
            wb7Var.f389052i = a17.W0();
            wb7Var.f389053m = a17.i();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5124;
        lVar.f70666c = "/cgi-bin/mmgame-bin/getwxagameabtestinfo";
        lVar.f70664a = wb7Var;
        lVar.f70665b = new r45.xb7();
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            qg1.o oVar2 = (qg1.o) it6.next();
            sb6.append("{appId:");
            sb6.append(oVar2.f362785a);
            sb6.append(", appType:");
            sb6.append(oVar2.f362786b);
            sb6.append(", versionType:");
            sb6.append(oVar2.f362787c);
            sb6.append("}");
        }
        sb6.append("]");
        objArr[2] = sb6.toString();
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = this.f362773o.f88134d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, instanceId:%s", objArr);
    }

    public static java.lang.String s(java.lang.String str, int i17, int i18) {
        return str + (i17 == 1 ? "_weApp" : i17 == 2 ? "_plugin" : "") + i18;
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        byte[] byteArray;
        r45.vb7 vb7Var;
        r45.xb7 xb7Var = (r45.xb7) fVar;
        if (xb7Var == null) {
            str2 = "NULL";
        } else if (xb7Var.f389963d == null) {
            str2 = "NULL_API_INFO_LIST";
        } else {
            str2 = "API_INFO_LIST SIZE:" + xb7Var.f389963d.size();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f362774p), str2);
        if (i17 != 0 || i18 != 0 || xb7Var == null || (linkedList = xb7Var.f389963d) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.yb7 yb7Var = (r45.yb7) it.next();
            if (!((yb7Var == null || (vb7Var = yb7Var.f390952d) == null || vb7Var.f388085d == null || yb7Var.f390953e == null) ? false : true)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql: error! response is invalid");
                break;
            }
            java.lang.String str3 = yb7Var.f390952d.f388085d;
            r45.l63 l63Var = yb7Var.f390954f;
            if (l63Var != null) {
                try {
                    byteArray = l63Var.toByteArray();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "getGameRewardDataByteArray error: ", e17);
                }
                com.tencent.mm.plugin.appbrand.launching.o9 o9Var = (com.tencent.mm.plugin.appbrand.launching.o9) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.o9.class);
                r45.vb7 vb7Var2 = yb7Var.f390952d;
                int i19 = vb7Var2.f388086e;
                int i27 = vb7Var2.f388087f;
                byte[] g17 = yb7Var.f390953e.g();
                o9Var.getClass();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.M0(g17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo,invalid input %s", str3);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "insertOrUpdate, appId:%s , appType :%d, versionType :%d", str3, java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
                    com.tencent.mm.plugin.appbrand.launching.n9 n9Var = new com.tencent.mm.plugin.appbrand.launching.n9();
                    n9Var.field_appId = str3;
                    n9Var.field_appType = i19;
                    n9Var.field_versionType = i27;
                    n9Var.field_permissionBytes = g17;
                    boolean z17 = o9Var.get(n9Var, new java.lang.String[0]);
                    n9Var.field_permissionBytes = g17;
                    n9Var.field_gameRewardsData = byteArray;
                    if (z17 ? o9Var.update(n9Var, new java.lang.String[0]) : o9Var.insert(n9Var)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo appId:%s ok", str3);
                    }
                }
                java.util.HashMap hashMap = this.f362775q;
                r45.vb7 vb7Var3 = yb7Var.f390952d;
                hashMap.put(s(str3, vb7Var3.f388086e, vb7Var3.f388087f), new com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle(yb7Var.f390953e.g(), byteArray));
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:wxaAppidABTest AppId:%s, size:%d", str3, java.lang.Integer.valueOf(yb7Var.f390953e.g().length));
            }
            byteArray = null;
            com.tencent.mm.plugin.appbrand.launching.o9 o9Var2 = (com.tencent.mm.plugin.appbrand.launching.o9) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.o9.class);
            r45.vb7 vb7Var22 = yb7Var.f390952d;
            int i192 = vb7Var22.f388086e;
            int i272 = vb7Var22.f388087f;
            byte[] g172 = yb7Var.f390953e.g();
            o9Var2.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaAppidABTestInfoStorage", "setWxaAppidABTestInfo,invalid input %s", str3);
            java.util.HashMap hashMap2 = this.f362775q;
            r45.vb7 vb7Var32 = yb7Var.f390952d;
            hashMap2.put(s(str3, vb7Var32.f388086e, vb7Var32.f388087f), new com.tencent.mm.plugin.appbrand.permission.appidABTest.AppRuntimeAppidABTestPermissionBundle(yb7Var.f390953e.g(), byteArray));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaAppidABTestInfo", "zbql:wxaAppidABTest AppId:%s, size:%d", str3, java.lang.Integer.valueOf(yb7Var.f390953e.g().length));
        }
        if (this.f362774p) {
            return;
        }
        java.lang.String str4 = this.f362771m;
        int i28 = this.f362772n;
        java.lang.String str5 = this.f362773o.f88134d;
        java.util.HashMap hashMap3 = this.f362775q;
        com.tencent.mm.plugin.appbrand.launching.x2 j17 = com.tencent.mm.plugin.appbrand.launching.x2.j(str5);
        if (j17 != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str4;
            objArr[1] = java.lang.Integer.valueOf(i28);
            objArr[2] = str5;
            objArr[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyAppidABTestPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr);
            if (j17.f85369n != null) {
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) j17.f85369n.a(0);
                if (appBrandSysConfigWC == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyAppidABTestPermissionInfoUpdate null config with appId(%s)", str4);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = str4;
                    objArr2[1] = java.lang.Integer.valueOf(i28);
                    objArr2[2] = str5;
                    objArr2[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]", objArr2);
                    appBrandSysConfigWC.C = hashMap3;
                    j17.f85369n = nm5.j.d(appBrandSysConfigWC, null, j17.S);
                }
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[4];
                objArr3[0] = str4;
                objArr3[1] = java.lang.Integer.valueOf(i28);
                objArr3[2] = str5;
                objArr3[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifyAppidABTestPermissionInfoUpdate] set mMaybeUpdatedAppidABTestPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]", objArr3);
                j17.f85383x1 = hashMap3;
            }
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[4];
            objArr4[0] = str4;
            objArr4[1] = java.lang.Integer.valueOf(i28);
            objArr4[2] = str5;
            objArr4[3] = java.lang.Integer.valueOf(hashMap3 == null ? 0 : hashMap3.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyAppidABTestPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr4);
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper = new com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper();
            iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper.f84427d = str4;
            iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper.f84428e = i28;
            iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper.f84429f = hashMap3;
            com.tencent.mm.plugin.appbrand.task.ipc.l.a(str4, iLaunchWxaAppInfoNotify$AppidABTestIpcWrapper);
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr5 = new java.lang.Object[4];
            objArr5[0] = str4;
            objArr5[1] = java.lang.Integer.valueOf(i28);
            objArr5[2] = str5;
            objArr5[3] = java.lang.Integer.valueOf(hashMap3 != null ? hashMap3.size() : 0);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", th6, "notifyAppidABTestPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], appidABTestMapSize:[%d]", objArr5);
        }
    }
}
