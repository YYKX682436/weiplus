package qg1;

/* loaded from: classes7.dex */
public class m extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f362777o;

    /* renamed from: p, reason: collision with root package name */
    public final int f362778p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.zd7 f362779q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.QualitySession f362780r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.kb f362781s;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct f362783u;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f362782t = false;

    /* renamed from: v, reason: collision with root package name */
    public volatile java.util.HashMap f362784v = new java.util.HashMap();

    public m(java.lang.String str, int i17, java.util.List list, boolean z17, java.lang.String str2, com.tencent.mm.plugin.appbrand.report.quality.QualitySession session, com.tencent.mm.plugin.appbrand.launching.kb kbVar, r45.y50 y50Var) {
        this.f362777o = str;
        this.f362778p = i17;
        this.f362780r = session;
        this.f362781s = kbVar;
        kotlin.jvm.internal.o.g(session, "session");
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct();
        weAppQualitySystemJsApiInfoCGIStruct.f62753e = weAppQualitySystemJsApiInfoCGIStruct.b("AppId", session.f88135e, true);
        weAppQualitySystemJsApiInfoCGIStruct.f62752d = weAppQualitySystemJsApiInfoCGIStruct.b("InstanceId", session.f88134d, true);
        int i18 = session.f88136f;
        weAppQualitySystemJsApiInfoCGIStruct.f62755g = i18 != 1 ? i18 != 2 ? i18 != 3 ? null : cm.l0.demo : cm.l0.debug : cm.l0.release;
        weAppQualitySystemJsApiInfoCGIStruct.f62756h = session.f88137g;
        weAppQualitySystemJsApiInfoCGIStruct.f62758j = session.f88138h;
        weAppQualitySystemJsApiInfoCGIStruct.f62754f = session.f88139i;
        if (0 == weAppQualitySystemJsApiInfoCGIStruct.f62763o) {
            weAppQualitySystemJsApiInfoCGIStruct.f62763o = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        }
        this.f362783u = weAppQualitySystemJsApiInfoCGIStruct;
        weAppQualitySystemJsApiInfoCGIStruct.f62762n = z17 ? cm.m0.sync : cm.m0.async;
        weAppQualitySystemJsApiInfoCGIStruct.f62763o = com.tencent.mm.plugin.appbrand.report.quality.u.c();
        this.f362779q = new r45.zd7();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            qg1.p pVar = (qg1.p) it.next();
            r45.be7 be7Var = new r45.be7();
            be7Var.f370712d = pVar.f362788a;
            be7Var.f370713e = pVar.f362789b;
            this.f362779q.f391945d.add(be7Var);
        }
        r45.zd7 zd7Var = this.f362779q;
        java.util.Objects.requireNonNull(y50Var);
        zd7Var.f391946e = y50Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3827;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaattr/wxajsapiinfo";
        lVar.f70664a = this.f362779q;
        lVar.f70665b = new r45.ae7();
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            qg1.p pVar2 = (qg1.p) it6.next();
            sb6.append("{appId:");
            sb6.append(pVar2.f362788a);
            sb6.append(", appType:");
            sb6.append(pVar2.f362789b);
            sb6.append("}");
        }
        sb6.append("]");
        objArr[2] = sb6.toString();
        objArr[3] = java.lang.Boolean.valueOf(z17);
        objArr[4] = str2;
        objArr[5] = session.f88134d;
        objArr[6] = wz0.a.a(y50Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "<init> appId:%s, versionType:%d, appIdList:%s, sync:%b, sessionId:%s, instanceId:%s, source:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public r45.y50 A() {
        return this.f362779q.f391946e;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        return this.f362780r.f88134d;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(int i17, int i18, java.lang.String str, r45.ae7 ae7Var, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualitySystemJsApiInfoCGIStruct weAppQualitySystemJsApiInfoCGIStruct = this.f362783u;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            weAppQualitySystemJsApiInfoCGIStruct.f62760l = currentTimeMillis;
            weAppQualitySystemJsApiInfoCGIStruct.f62757i = currentTimeMillis - weAppQualitySystemJsApiInfoCGIStruct.f62759k;
            if (th1.a.a(i17, i18, ae7Var)) {
                weAppQualitySystemJsApiInfoCGIStruct.f62761m = 0L;
            } else {
                weAppQualitySystemJsApiInfoCGIStruct.f62761m = 1L;
            }
            weAppQualitySystemJsApiInfoCGIStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.CgiWxaJsApiInfo", "quality report e = %s", e17);
        }
        boolean z18 = ((r45.zd7) this.f70646f.f70710a.f70684a).f391946e.f390798e;
        if (ae7Var == null) {
            str2 = "NULL";
        } else if (ae7Var.f369974d == null) {
            str2 = "NULL_API_INFO_LIST";
        } else {
            str2 = "API_INFO_LIST SIZE:" + ae7Var.f369974d.size();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "onCgiBack, errType %d, errCode %d, errMsg %s, req[sync %B], resp[%s], isForPreRender[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(this.f362782t), str2, java.lang.Boolean.valueOf(z18));
        if (i17 != 0 || i18 != 0 || ae7Var == null || (linkedList = ae7Var.f369974d) == null) {
            if (!this.f362782t || z18) {
                return;
            }
            com.tencent.mm.plugin.appbrand.launching.ib.b(com.tencent.mm.plugin.appbrand.utils.s0.b(com.tencent.mm.R.string.f490252pc, java.lang.String.format(java.util.Locale.US, " (%d,%d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18))), this.f362781s);
            return;
        }
        try {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ce7 ce7Var = (r45.ce7) it.next();
                if (ce7Var.f371514f == 0) {
                    r45.be7 be7Var = ce7Var.f371512d;
                    java.lang.String str3 = be7Var.f370712d;
                    if (be7Var.f370713e == 2) {
                        com.tencent.mm.plugin.appbrand.launching.q9 aj6 = com.tencent.mm.plugin.appbrand.app.r9.aj();
                        byte[] byteArray = ce7Var.f371513e.toByteArray();
                        aj6.getClass();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !com.tencent.mm.sdk.platformtools.t8.M0(byteArray)) {
                            if (aj6.D0(str3, byteArray)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData appId:%s ok", str3);
                            }
                            this.f362784v.put(str3, new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle(ce7Var.f371513e));
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "wxaJs plugin AppId:%s,jsApiControlBytes:%d,bg:%d,suspend:%d", str3, java.lang.Integer.valueOf(ce7Var.f371513e.f370425d.f192156a.length), java.lang.Integer.valueOf(((com.tencent.mm.protobuf.g) ce7Var.f371513e.f370426e.get(0)).f192156a.length), java.lang.Integer.valueOf(((com.tencent.mm.protobuf.g) ce7Var.f371513e.f370426e.get(1)).f192156a.length));
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid input %s", str3);
                        this.f362784v.put(str3, new com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle(ce7Var.f371513e));
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiWxaJsApiInfo", "wxaJs plugin AppId:%s,jsApiControlBytes:%d,bg:%d,suspend:%d", str3, java.lang.Integer.valueOf(ce7Var.f371513e.f370425d.f192156a.length), java.lang.Integer.valueOf(((com.tencent.mm.protobuf.g) ce7Var.f371513e.f370426e.get(0)).f192156a.length), java.lang.Integer.valueOf(((com.tencent.mm.protobuf.g) ce7Var.f371513e.f370426e.get(1)).f192156a.length));
                    }
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.CgiWxaJsApiInfo", e18, "IOException", new java.lang.Object[0]);
        }
        if (this.f362782t) {
            return;
        }
        java.lang.String str4 = this.f362777o;
        int i19 = this.f362778p;
        java.lang.String str5 = this.f362783u.f62752d;
        java.util.HashMap hashMap = this.f362784v;
        com.tencent.mm.plugin.appbrand.launching.x2 j17 = com.tencent.mm.plugin.appbrand.launching.x2.j(str5);
        if (j17 != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = str4;
            objArr[1] = java.lang.Integer.valueOf(i19);
            objArr[2] = str5;
            objArr[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update deferred process] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr);
            if (j17.f85369n != null) {
                com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) j17.f85369n.a(0);
                if (appBrandSysConfigWC == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "notifyLaunchInfoUpdate null config with appId(%s)", str4);
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = str4;
                    objArr2[1] = java.lang.Integer.valueOf(i19);
                    objArr2[2] = str5;
                    objArr2[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] fillLaunchConfig to pending launchResult appId[%s] type[%d] instanceId[%s] info[%d]", objArr2);
                    appBrandSysConfigWC.B = hashMap;
                    j17.f85369n = nm5.j.d(appBrandSysConfigWC, null, j17.S);
                }
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[4];
                objArr3[0] = str4;
                objArr3[1] = java.lang.Integer.valueOf(i19);
                objArr3[2] = str5;
                objArr3[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "[ILaunchWxaAppInfoNotify][notifPluginPermissionInfoUpdate] set mMaybeUpdatedPluginPermissionMap appId[%s] type[%d] instanceId[%s] info[%d]", objArr3);
                j17.f85373p1 = hashMap;
            }
        }
        try {
            java.lang.Object[] objArr4 = new java.lang.Object[4];
            objArr4[0] = str4;
            objArr4[1] = java.lang.Integer.valueOf(i19);
            objArr4[2] = str5;
            objArr4[3] = java.lang.Integer.valueOf(hashMap == null ? 0 : hashMap.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr4);
            com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper iLaunchWxaAppInfoNotify$PluginIpcWrapper = new com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper();
            iLaunchWxaAppInfoNotify$PluginIpcWrapper.f84433d = str4;
            iLaunchWxaAppInfoNotify$PluginIpcWrapper.f84434e = i19;
            iLaunchWxaAppInfoNotify$PluginIpcWrapper.f84435f = hashMap;
            com.tencent.mm.plugin.appbrand.task.ipc.l.a(str4, iLaunchWxaAppInfoNotify$PluginIpcWrapper);
        } catch (java.lang.Throwable th6) {
            java.lang.Object[] objArr5 = new java.lang.Object[4];
            objArr5[0] = str4;
            objArr5[1] = java.lang.Integer.valueOf(i19);
            objArr5[2] = str5;
            objArr5[3] = java.lang.Integer.valueOf(hashMap != null ? hashMap.size() : 0);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ILaunchWxaAppInfoNotify.INSTANCE[permission]", th6, "notifyPluginPermissionInfoUpdate [update remote] appId[%s], type[%d], instanceId[%s], pluginMapSize:[%d]", objArr5);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    public final synchronized pq5.g l() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f362783u.f62759k = java.lang.System.currentTimeMillis();
        return super.l();
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public com.tencent.mm.modelbase.f t() {
        this.f362782t = true;
        return com.tencent.mm.modelbase.l3.a(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String y() {
        return this.f362777o;
    }
}
