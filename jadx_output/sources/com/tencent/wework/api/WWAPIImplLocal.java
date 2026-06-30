package com.tencent.wework.api;

/* loaded from: classes13.dex */
public final class WWAPIImplLocal extends com.tencent.wework.api.AbsWwAPIImpl {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f220139e;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f220140b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.BroadcastReceiver f220141c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f220142d;

    static {
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.1
            {
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.2
            {
                add("com.tencent.wework");
            }
        };
        f220139e = new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImplLocal.3
            {
                add("011A40266C8C75D181DDD8E4DDC50075");
                add("F5BF8B3B1B616EFEF88681716C061BA4");
                add("99A7B5BDA8615128675831C01F208344");
                add("B374B823AD2BF3F216AC8F67B86CE189");
            }
        };
    }

    public WWAPIImplLocal(android.content.Context context) {
        super(context);
        new java.util.HashMap();
        this.f220141c = new android.content.BroadcastReceiver() { // from class: com.tencent.wework.api.WWAPIImplLocal.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    com.tencent.wework.api.WWAPIImplLocal wWAPIImplLocal = com.tencent.wework.api.WWAPIImplLocal.this;
                    java.util.ArrayList arrayList = com.tencent.wework.api.WWAPIImplLocal.f220139e;
                    wWAPIImplLocal.getClass();
                    intent.getScheme();
                    throw null;
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        this.f220142d = null;
        this.f220140b = context;
        this.f220142d = context.getSharedPreferences("wxwork_wwapi_store", 0);
    }

    public static java.lang.String g(byte[] bArr) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(digest.length * 2);
            for (byte b17 : digest) {
                sb6.append(java.lang.Integer.toHexString((b17 & 240) >>> 4));
                sb6.append(java.lang.Integer.toHexString(b17 & 15));
            }
            return sb6.toString().toUpperCase();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    @Override // com.tencent.wework.api.IWWAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.wework.api.model.BaseMessage r29, com.tencent.wework.api.IWWAPI.WWAppType r30) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.WWAPIImplLocal.a(com.tencent.wework.api.model.BaseMessage, com.tencent.wework.api.IWWAPI$WWAppType):boolean");
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean b(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeDefault) {
            return i("com.tencent.wework") >= 20104;
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork) {
            return (i("com.tencent.wework") >= 20104) || j("wxwork");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal) {
            return j("wxworkgovuniform");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return j("wxwork");
        }
        return false;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean c(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeDefault) {
            return k("com.tencent.wework");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork) {
            return k("com.tencent.wework") || k("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxwork://jump")));
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal) {
            return k("com.tencent.wwgovernment") || f(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse("wxworkgovuniform://jump")));
        }
        return false;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public java.lang.String d(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        return wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal ? "政务微信" : "企业微信";
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean e() {
        return i("com.tencent.wework") > 20104;
    }

    public final java.lang.String h(android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f220140b.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "";
    }

    public final int i(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = this.f220140b.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public final boolean j(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f220140b.getPackageManager().queryIntentActivities(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse(str + "://jump")), 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0 && i(queryIntentActivities.get(0).activityInfo.applicationInfo.packageName) >= 1030040000;
    }

    public boolean k(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = g(this.f220140b.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return f220139e.contains(str2);
    }
}
