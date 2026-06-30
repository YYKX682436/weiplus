package w44;

/* loaded from: classes4.dex */
public abstract class d implements p64.a, p64.b {

    /* renamed from: d, reason: collision with root package name */
    public w44.b f442897d;

    public static /* synthetic */ org.json.JSONObject h(w44.d dVar, java.lang.String str, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeParamInvalidError");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            throw unsupportedOperationException;
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        org.json.JSONObject g17 = dVar.g(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeParamInvalidError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return g17;
    }

    public static /* synthetic */ org.json.JSONObject k(w44.d dVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeReturnError");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            throw unsupportedOperationException;
        }
        if ((i18 & 4) != 0) {
            jSONObject = null;
        }
        org.json.JSONObject j17 = dVar.j(i17, str, jSONObject);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeReturnError$default", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return j17;
    }

    @Override // p64.b
    public android.os.Bundle a(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            android.os.Bundle o17 = o(bVar, bundle);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return o17;
        } catch (java.lang.Throwable unused) {
            if (bVar != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("error", -1);
                ((r64.b) bVar).e(bundle2);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return null;
        }
    }

    public final void b(org.json.JSONObject obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("backToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(obj, "obj");
        try {
            if (this.f442897d != null) {
                w44.b d17 = d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
                yz5.l lVar = d17.f442894d;
                if (lVar != null) {
                    lVar.invoke(obj);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("backToJS", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public abstract void c(w44.b bVar, org.json.JSONObject jSONObject);

    public final w44.b d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        w44.b bVar = this.f442897d;
        if (bVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            return bVar;
        }
        kotlin.jvm.internal.o.o("apiEnv");
        throw null;
    }

    public final void e(w44.b env, org.json.JSONObject data) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        this.f442897d = env;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setApiEnv", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            c(env, data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAdJs.Simple", "there is some exception in js " + th6.getMessage() + '!');
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            org.json.JSONObject k17 = k(this, 609999, "fail:there is some exception", null, 4, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            b(k17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public final boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRunInMainProcess", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        boolean n17 = com.tencent.mm.sdk.platformtools.x2.n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRunInMainProcess", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return n17;
    }

    public final org.json.JSONObject g(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeParamInvalidError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(msg, "msg");
        org.json.JSONObject k17 = k(this, 6, "fail:param invalid", null, 4, null);
        if (msg.length() > 0) {
            k17.put("errMsg", msg);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeParamInvalidError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return k17;
    }

    public final android.os.Bundle i(android.os.Bundle p17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeRemoteCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(p17, "p");
        o64.a aVar = new o64.a();
        aVar.c(this);
        aVar.d(this);
        q64.a a17 = aVar.a();
        android.os.Bundle c17 = a17 != null ? ((r64.b) a17).c(p17) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRemoteCall", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return c17;
    }

    public final org.json.JSONObject j(int i17, java.lang.String msg, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeReturnError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(msg, "msg");
        if (jSONObject != null) {
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", msg);
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("errCode", i17);
            jSONObject.put("errMsg", msg);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeReturnError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return jSONObject;
    }

    public final org.json.JSONObject l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", 0);
        jSONObject.put("errMsg", "ok");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return jSONObject;
    }

    public final org.json.JSONObject m(org.json.JSONObject obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        kotlin.jvm.internal.o.g(obj, "obj");
        obj.put("errCode", 0);
        obj.put("errMsg", "ok");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeReturnOK", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return obj;
    }

    public void n(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClientRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }

    public android.os.Bundle o(q64.b bVar, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onServerRun", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        return null;
    }

    @Override // p64.a
    public void onCallbackFromServer(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
        try {
            n(bundle);
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            org.json.JSONObject k17 = k(this, 609999, "fail:there is some exception", null, 4, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeGeneralError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
            b(k17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.SimpleAsyncJsApi");
    }
}
