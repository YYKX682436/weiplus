package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f209202f = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".extra_url");

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f209203g = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".extra_action");

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f209204h = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".extra_params");

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f209205i = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".extra_chromePackage");

    /* renamed from: j, reason: collision with root package name */
    public static final java.lang.String f209206j = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".action_refresh");

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f209207k = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".no_activity_exception");

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f209208l = com.tencent.mm.ui.mmfb.sdk.l.class.getSimpleName().concat(".action_customTabRedirect");

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f209209m = "https://m.facebook.com/dialog/";

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f209210n = "https://graph.facebook.com/";

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f209211o = "https://api.facebook.com/restserver.php";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.ref.WeakReference f209212p;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f209213a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f209214b = 0;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.k f209215c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.mmfb.sdk.k f209216d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.mmfb.sdk.m f209217e;

    public l() {
        this.f209217e = null;
        this.f209217e = new com.tencent.mm.ui.mmfb.sdk.m();
    }

    public static android.os.Bundle e(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                try {
                    if (split.length == 2) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.tencent.mapsdk.internal.rv.f51270c), java.net.URLDecoder.decode(split[1], com.tencent.mapsdk.internal.rv.f51270c));
                    } else if (split.length == 1) {
                        bundle.putString(java.net.URLDecoder.decode(split[0], com.tencent.mapsdk.internal.rv.f51270c), "");
                    }
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }
        return bundle;
    }

    public void a(android.app.Activity activity, java.lang.String[] strArr, com.tencent.mm.ui.mmfb.sdk.k kVar) {
        this.f209215c = kVar;
        this.f209216d = new com.tencent.mm.ui.mmfb.sdk.j(this);
        com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler customTabLoginMethodHandler = new com.tencent.mm.ui.mmfb.sdk.CustomTabLoginMethodHandler(new com.tencent.mm.ui.mmfb.sdk.LoginClient(activity));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(str);
        }
        arrayList.clear();
        for (java.lang.String str2 : strArr) {
            arrayList.add(str2);
        }
        com.tencent.mm.ui.mmfb.sdk.LoginClient.Request request = new com.tencent.mm.ui.mmfb.sdk.LoginClient.Request(com.tencent.mm.ui.mmfb.sdk.u.NATIVE_WITH_FALLBACK, java.util.Collections.unmodifiableSet(new java.util.HashSet(arrayList)), com.tencent.mm.ui.mmfb.sdk.g.FRIENDS, "rerequest", "290293790992170", java.util.UUID.randomUUID().toString());
        android.os.Parcelable.Creator<com.tencent.mm.ui.mmfb.sdk.AccessToken> creator = com.tencent.mm.ui.mmfb.sdk.AccessToken.CREATOR;
        request.f209177i = false;
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Set set = request.f209173e;
        java.lang.String str3 = null;
        if (!(set == null || set.size() == 0)) {
            java.lang.String join = android.text.TextUtils.join(",", set);
            bundle.putString("scope", join);
            if (customTabLoginMethodHandler.f209188d == null) {
                customTabLoginMethodHandler.f209188d = new java.util.HashMap();
            }
            customTabLoginMethodHandler.f209188d.put("scope", join == null ? null : join.toString());
        }
        bundle.putString("default_audience", "friends");
        bundle.putString("state", new org.json.JSONObject().toString());
        bundle.putString("cbt", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        bundle.putString("ies", "0");
        bundle.putString("redirect_uri", customTabLoginMethodHandler.f209166h);
        bundle.putString("client_id", request.f209175g);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException unused) {
        }
        bundle.putString("e2e", jSONObject.toString());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", "rerequest");
        bundle.putString("login_behavior", "NATIVE_WITH_FALLBACK");
        bundle.putString("sdk", java.lang.String.format(java.util.Locale.ROOT, "android-%s", "android-8.2.0"));
        bundle.putString("sso", "chrome_custom_tab");
        bundle.putString("cct_prefetching", "0");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, "com.tencent.mm.plugin.account.ui.CustomTabMainActivity");
        intent.putExtra(f209203g, "oauth");
        intent.putExtra(f209204h, bundle);
        java.lang.String str4 = customTabLoginMethodHandler.f209164f;
        if (str4 == null) {
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getPackageManager().queryIntentServices(new android.content.Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null) {
                java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(com.tencent.mm.ui.mmfb.sdk.f.f209197a));
                java.util.Iterator<android.content.pm.ResolveInfo> it = queryIntentServices.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.content.pm.ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        str3 = serviceInfo.packageName;
                        break;
                    }
                }
            }
            customTabLoginMethodHandler.f209164f = str3;
            str4 = str3;
        }
        intent.putExtra(f209205i, str4);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(101);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/ui/mmfb/sdk/CustomTabLoginMethodHandler", "tryAuthorize", "(Landroid/app/Activity;[Ljava/lang/String;)I", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        h(activity);
        com.tencent.mm.ui.mmfb.sdk.i iVar = new com.tencent.mm.ui.mmfb.sdk.i(this);
        f209212p = new java.lang.ref.WeakReference(iVar);
        b4.d.a(activity).b(iVar, new android.content.IntentFilter(f209208l));
        jx3.f.INSTANCE.idkeyStat(582L, 0L, 1L, false);
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        long E1;
        if (i17 == 0) {
            if (i18 != -1) {
                if (i18 == 0) {
                    if (intent == null) {
                        this.f209215c.onCancel();
                        return;
                    } else {
                        intent.getStringExtra("error");
                        this.f209215c.c(new com.tencent.mm.ui.mmfb.sdk.h(intent.getStringExtra("error"), intent.getIntExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, -1), intent.getStringExtra("failing_url")));
                        return;
                    }
                }
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                stringExtra = intent.getStringExtra("error_type");
            }
            if (stringExtra == null) {
                g(intent.getStringExtra("access_token"));
                java.lang.String stringExtra2 = intent.getStringExtra("expires_in");
                if (stringExtra2 != null) {
                    if (stringExtra2.equals("0")) {
                        E1 = 0;
                    } else {
                        E1 = (com.tencent.mm.sdk.platformtools.t8.E1(stringExtra2) * 1000) + java.lang.System.currentTimeMillis();
                    }
                    this.f209214b = E1;
                }
                if (d()) {
                    this.f209215c.b(intent.getExtras());
                    return;
                } else {
                    this.f209215c.d(new com.tencent.mm.ui.mmfb.sdk.n("Failed to receive access token."));
                    return;
                }
            }
            if (stringExtra.equals("service_disabled") || stringExtra.equals("AndroidAuthKillSwitchException")) {
                new android.os.Bundle();
                throw null;
            }
            if (stringExtra.equals("access_denied") || stringExtra.equals("OAuthAccessDeniedException")) {
                this.f209215c.onCancel();
                return;
            }
            java.lang.String stringExtra3 = intent.getStringExtra("error_description");
            if (stringExtra3 != null) {
                stringExtra = stringExtra + ":" + stringExtra3;
            }
            this.f209215c.d(new com.tencent.mm.ui.mmfb.sdk.n(stringExtra));
        }
    }

    public void c(android.app.Activity activity) {
        if (this.f209217e != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("facebook destory, unInitSdk = ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", sb6.toString());
        }
        h(activity);
    }

    public boolean d() {
        return this.f209213a != null && (this.f209214b == 0 || java.lang.System.currentTimeMillis() < this.f209214b);
    }

    public java.lang.String f(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        java.lang.String d17;
        bundle.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_FORMAT, "json");
        if (d()) {
            bundle.putString("access_token", this.f209213a);
        }
        java.lang.String str3 = str != null ? f209210n + str : f209211o;
        if (str2.equals("GET")) {
            str3 = str3 + "?" + com.tencent.mm.ui.mmfb.sdk.o.b(bundle);
        }
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str3).openConnection();
        httpURLConnection.setConnectTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        httpURLConnection.setRequestProperty("User-Agent", java.lang.System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
        if (!str2.equals("GET")) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            for (java.lang.String str4 : bundle.keySet()) {
                if (bundle.getByteArray(str4) != null) {
                    bundle2.putByteArray(str4, bundle.getByteArray(str4));
                }
            }
            if (!bundle.containsKey(ya.b.METHOD)) {
                bundle.putString(ya.b.METHOD, str2);
            }
            if (bundle.containsKey("access_token")) {
                bundle.putString("access_token", java.net.URLDecoder.decode(bundle.getString("access_token")));
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.connect();
            java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write("--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str5 : bundle.keySet()) {
                if (bundle.getByteArray(str5) == null) {
                    sb6.append("Content-Disposition: form-data; name=\"" + str5 + "\"\r\n\r\n" + bundle.getString(str5));
                    sb6.append("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n");
                }
            }
            bufferedOutputStream.write(sb6.toString().getBytes());
            bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
            if (!bundle2.isEmpty()) {
                for (java.lang.String str6 : bundle2.keySet()) {
                    bufferedOutputStream.write(("Content-Disposition: form-data; filename=\"" + str6 + "\"\r\n").getBytes());
                    bufferedOutputStream.write("Content-Type: content/unknown\r\n\r\n".getBytes());
                    bufferedOutputStream.write(bundle2.getByteArray(str6));
                    bufferedOutputStream.write("\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n".getBytes());
                }
            }
            bufferedOutputStream.flush();
        }
        try {
            d17 = com.tencent.mm.ui.mmfb.sdk.o.d(httpURLConnection.getInputStream());
        } catch (java.io.FileNotFoundException unused) {
            d17 = com.tencent.mm.ui.mmfb.sdk.o.d(httpURLConnection.getErrorStream());
        }
        try {
            httpURLConnection.getInputStream().close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FacebookUtil", e17.getMessage());
        }
        httpURLConnection.disconnect();
        return d17;
    }

    public void g(java.lang.String str) {
        this.f209213a = str;
        java.lang.System.currentTimeMillis();
    }

    public void h(android.content.Context context) {
        try {
            java.lang.ref.WeakReference weakReference = f209212p;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "unregisterReceiver");
            b4.d.a(context).d((android.content.BroadcastReceiver) f209212p.get());
            f209212p = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FacebookLoginUI", "facebook destory, Exception = " + e17);
        }
    }
}
