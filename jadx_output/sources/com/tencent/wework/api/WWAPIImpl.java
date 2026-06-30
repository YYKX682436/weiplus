package com.tencent.wework.api;

/* loaded from: classes13.dex */
public class WWAPIImpl extends com.tencent.wework.api.AbsWwAPIImpl {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f220135d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f220136b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f220137c;

    static {
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImpl.1
            {
                add("com.tencent.weworklocal");
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new java.util.ArrayList<java.lang.String>() { // from class: com.tencent.wework.api.WWAPIImpl.2
            {
                add("com.tencent.wework");
            }
        };
    }

    public WWAPIImpl(android.content.Context context) {
        super(context);
        new java.util.HashMap();
        new android.content.BroadcastReceiver() { // from class: com.tencent.wework.api.WWAPIImpl.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                try {
                    com.tencent.wework.api.WWAPIImpl wWAPIImpl = com.tencent.wework.api.WWAPIImpl.this;
                    int i17 = com.tencent.wework.api.WWAPIImpl.f220135d;
                    wWAPIImpl.getClass();
                    intent.getScheme();
                    throw null;
                } catch (java.lang.Throwable unused) {
                }
            }
        };
        this.f220137c = null;
        this.f220136b = context;
        this.f220137c = context.getSharedPreferences("wxwork_wwapi_store", 0);
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

    @Override // com.tencent.wework.api.IWWAPI
    public boolean a(com.tencent.wework.api.model.BaseMessage baseMessage, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        return false;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean b(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeDefault) {
            return h("com.tencent.wework") >= 20104;
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork) {
            return (h("com.tencent.wework") >= 20104) || i("wxwork");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal) {
            return i("wxworkgovuniform");
        }
        if (wWAppType == com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxworkWithoutSaas) {
            return i("wxwork");
        }
        return false;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean c(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        return false;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public java.lang.String d(com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        return null;
    }

    @Override // com.tencent.wework.api.IWWAPI
    public boolean e() {
        return h("com.tencent.wework") > 20104;
    }

    public final int h(java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = this.f220136b.getPackageManager().getPackageInfo(str, 128);
            if (packageInfo == null) {
                return 0;
            }
            return packageInfo.versionCode;
        } catch (java.lang.Throwable unused) {
            return 0;
        }
    }

    public final boolean i(java.lang.String str) {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = this.f220136b.getPackageManager().queryIntentActivities(new android.content.Intent("com.tencent.wework.api.sharemsg", android.net.Uri.parse(str + "://jump")), 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0 && h(queryIntentActivities.get(0).activityInfo.applicationInfo.packageName) >= 1030040000;
    }

    public boolean j(java.lang.String str) {
        java.lang.String str2;
        try {
            str2 = g(this.f220136b.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (java.lang.Throwable unused) {
            str2 = "";
        }
        return "011A40266C8C75D181DDD8E4DDC50075".equals(str2);
    }
}
