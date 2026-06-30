package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes8.dex */
public final class o0 implements zg0.o3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f183330a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f183331b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f183332c = jz5.h.b(com.tencent.mm.plugin.webview.modeltools.h0.f183259d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f183333d = jz5.h.b(com.tencent.mm.plugin.webview.modeltools.i0.f183287d);

    public static final java.lang.Object a(com.tencent.mm.plugin.webview.modeltools.o0 o0Var, android.content.Context context, java.util.ArrayList arrayList, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        o0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.webview.modeltools.l0 l0Var = new com.tencent.mm.plugin.webview.modeltools.l0(nVar);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        ((sb0.f) jVar).getClass();
        j35.u.k(context, 0, l0Var, strArr, "", "", str, null);
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static final java.lang.Object b(com.tencent.mm.plugin.webview.modeltools.o0 o0Var, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        o0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        db5.e1.K(context, false, "", str, context.getString(com.tencent.mm.R.string.a4f), context.getString(com.tencent.mm.R.string.a4j), new com.tencent.mm.plugin.webview.modeltools.m0(nVar), new com.tencent.mm.plugin.webview.modeltools.n0(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final void c(boolean z17, java.lang.String str, java.lang.String str2, android.webkit.GeolocationPermissions.Callback callback) {
        if (callback != null) {
            callback.invoke(str2, z17, false);
        }
        if (str == null) {
            return;
        }
        java.lang.String y17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d.y(str);
        this.f183330a.put(y17, java.lang.Boolean.valueOf(z17));
        e().G("##allow##".concat(y17), z17);
    }

    public final void d(android.webkit.PermissionRequest permissionRequest, java.lang.String str, boolean z17, boolean z18) {
        if (z17) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
        if (z18) {
            this.f183331b.put(f(permissionRequest, str), java.lang.Boolean.valueOf(z17));
        }
    }

    public final com.tencent.mm.sdk.platformtools.o4 e() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f183333d).getValue();
    }

    public final java.lang.String f(android.webkit.PermissionRequest permissionRequest, java.lang.String str) {
        java.lang.String[] resources = permissionRequest.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        java.lang.String str2 = "";
        for (java.lang.String str3 : resources) {
            if (!(str2 == null || r26.n0.N(str2))) {
                str2 = str2 + '-';
            }
            str2 = str2 + str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str != null ? com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d.y(str) : null);
        sb6.append('-');
        sb6.append(str2);
        return sb6.toString();
    }

    public void g(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, android.webkit.GeolocationPermissions.Callback callback) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, origin = %s", str4);
        if (str == null || r26.n0.N(str)) {
            if (callback != null) {
                callback.invoke(str4, false, false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt, url is null");
            return;
        }
        java.lang.String y17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d.y(str);
        java.util.HashMap hashMap = this.f183330a;
        if (hashMap.containsKey(y17)) {
            java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(y17);
            if (bool == null) {
                bool = java.lang.Boolean.TRUE;
            }
            boolean booleanValue = bool.booleanValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt use cache, allow = " + booleanValue);
            if (callback != null) {
                callback.invoke(str4, booleanValue, false);
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long q17 = e().q(y17, 0L);
        long abs = java.lang.Math.abs(currentTimeMillis - q17);
        jz5.g gVar = this.f183332c;
        if (abs < ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() * 3600000 && e().f("##allow##".concat(y17))) {
            boolean i18 = e().i("##allow##".concat(y17), true);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPermissionRequestHelper", "onGeolocationPermissionsShowPrompt less than " + ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() + " hour(lastShowTime=" + q17 + ", allow=" + i18 + "), do not show alert.");
            if (i18) {
                c(i18, str, str4, callback);
                return;
            }
        }
        e().B(y17, currentTimeMillis);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.webview.modeltools.j0(context, this, str4, str, callback, str2, i17, str3, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.webkit.PermissionRequest r18, android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.modeltools.o0.h(android.webkit.PermissionRequest, android.content.Context, java.lang.String):void");
    }
}
