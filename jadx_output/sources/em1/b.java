package em1;

/* loaded from: classes7.dex */
public class b extends com.tencent.mm.plugin.appbrand.x9 {
    @Override // com.tencent.mm.plugin.appbrand.x9
    public void a(java.util.ArrayList arrayList, java.lang.String str, boolean z17, java.lang.String str2) {
        super.a(arrayList, str, z17, str2);
        arrayList.add(new em1.o(this.f92381a.X0() + "shared_buffer.js", ik1.f.e("wxa_library/shared_buffer.js"), (java.lang.String) null, this.f92381a.getAppId(), this.f92381a.H0()));
        arrayList.add(new em1.o(this.f92381a.X0() + "android.js", ik1.f.e("wxa_library/android.js"), (java.lang.String) null, this.f92381a.getAppId(), this.f92381a.H0()));
        arrayList.add(new em1.o(this.f92381a.X0() + "lazy_load.js", ik1.f.e("wxa_library/lazy_load.js"), (java.lang.String) null, this.f92381a.getAppId(), this.f92381a.H0()));
        arrayList.add(e("WAWorker.js"));
        if (u46.l.c("wxlib", str2) || com.tencent.mm.plugin.appbrand.appcache.g0.b(this.f92381a.t3().f74805p.f77281g)) {
            return;
        }
        arrayList.add(new cl.j3(this.f92381a.X0() + "WASourceMap.js", com.tencent.mm.plugin.appbrand.nf.c(this.f92381a)));
        arrayList.add(new cl.j3(this.f92381a.X0() + "sourcemapSysinfo", java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", android.os.Build.VERSION.RELEASE)));
    }

    @Override // com.tencent.mm.plugin.appbrand.x9
    public cl.l3 b() {
        return new em1.a(this, this.f92391k);
    }

    @Override // com.tencent.mm.plugin.appbrand.x9
    public cl.j3 e(java.lang.String str) {
        java.lang.String M = this.f92381a.x().M(str);
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
        v8ScriptEvaluateRequest.scriptText = M;
        v8ScriptEvaluateRequest.scriptType = 3;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWorkerContainerLU", "getCommLibScript(%s), fd is null, fallback to createTextEvalRequest", str);
        java.lang.String str2 = this.f92381a.X0() + com.tencent.mm.plugin.appbrand.appstorage.l1.i(str);
        java.lang.String str3 = androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED + this.f92381a.x().i();
        v8ScriptEvaluateRequest.scriptName = str2;
        v8ScriptEvaluateRequest.cacheCategory = str;
        v8ScriptEvaluateRequest.cacheKey = str3;
        em1.o oVar = new em1.o(str2, v8ScriptEvaluateRequest, (java.lang.String) null, this.f92381a.getAppId(), this.f92381a.H0());
        oVar.f255068f = this.f92381a.x();
        return oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.x9
    public cl.j3 f(java.lang.String str) {
        cl.j3 j3Var;
        if (android.text.TextUtils.isEmpty(this.f92381a.a1(str))) {
            com.tencent.mm.plugin.appbrand.appcache.x3 openReadPartialInfo = com.tencent.mm.plugin.appbrand.appcache.la.o(this.f92381a.t3(), false).openReadPartialInfo(str);
            if (openReadPartialInfo == null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                com.tencent.mm.plugin.appbrand.e9 e9Var = this.f92381a;
                objArr[0] = e9Var != null ? e9Var.getAppId() : null;
                objArr[1] = str;
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWorkerContainerLU", "getUsrScript for appId:%s, path:%s, file not found", objArr);
                return null;
            }
            java.lang.String str2 = this.f92381a.b1() + str;
            j3Var = new cl.j3(str2, com.tencent.mm.plugin.appbrand.utils.e3.d(str, openReadPartialInfo, str2));
        } else {
            j3Var = super.f(str);
        }
        return new em1.o(j3Var, com.tencent.mm.plugin.appbrand.nf.a(this.f92381a.t3(), str, this.f92381a.b1()), this.f92381a.getAppId(), this.f92381a.H0());
    }
}
