package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes13.dex */
public class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.tmsqmsp.oaid2.p0 f215635f = new com.tencent.tmsqmsp.oaid2.p0();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.tmsqmsp.oaid2.o0 f215636a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f215637b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f215638c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f215639d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public android.content.ServiceConnection f215640e = new com.tencent.tmsqmsp.oaid2.q1(this);

    public boolean a(android.content.Context context) {
        boolean z17 = false;
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (android.os.Build.VERSION.SDK_INT < 28 ? !(packageInfo == null || packageInfo.versionCode <= 0) : !(packageInfo == null || packageInfo.getLongVersionCode() < 1)) {
                z17 = true;
            }
        } catch (java.lang.Throwable unused) {
        }
        return z17;
    }

    public final java.lang.String b(android.content.Context context, java.lang.String str) {
        android.content.pm.Signature[] signatureArr;
        if (android.text.TextUtils.isEmpty(this.f215637b)) {
            this.f215637b = context.getPackageName();
        }
        if (android.text.TextUtils.isEmpty(this.f215638c)) {
            java.lang.String str2 = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f215637b, 64).signatures;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] digest = messageDigest.digest(byteArray);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (byte b17 : digest) {
                            sb6.append(java.lang.Integer.toHexString((b17 & 255) | 256).substring(1, 3));
                        }
                        str2 = sb6.toString();
                    }
                } catch (java.security.NoSuchAlgorithmException unused2) {
                }
            }
            this.f215638c = str2;
        }
        java.lang.String a17 = ((com.tencent.tmsqmsp.oaid2.o0.a.C0062a) this.f215636a).a(this.f215637b, this.f215638c, str);
        return android.text.TextUtils.isEmpty(a17) ? "" : a17;
    }

    public java.lang.String a(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        synchronized (this) {
            if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
                try {
                } catch (java.lang.Exception unused) {
                    str2 = "";
                }
                if (this.f215636a == null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setComponent(new android.content.ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
                    intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
                    try {
                        if (context.bindService(intent, this.f215640e, (context.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
                            synchronized (this.f215639d) {
                                try {
                                    this.f215639d.wait(3000L);
                                } catch (java.lang.Throwable unused2) {
                                }
                            }
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                    if (this.f215636a != null) {
                        str2 = b(context, str);
                    }
                    str2 = "";
                } else {
                    str2 = b(context, str);
                }
            } else {
                throw new java.lang.IllegalStateException("Cannot run on MainThread");
            }
        }
        return str2;
    }
}
