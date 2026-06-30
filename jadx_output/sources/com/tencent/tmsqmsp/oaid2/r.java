package com.tencent.tmsqmsp.oaid2;

/* loaded from: classes8.dex */
public class r {

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f215648a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f215649b;

        public a(java.lang.String str, boolean z17) {
            this.f215648a = str;
            this.f215649b = z17;
        }

        public final java.lang.String a() {
            return this.f215648a;
        }

        public final boolean b() {
            return this.f215649b;
        }
    }

    private static boolean a(android.content.Context context, java.lang.String str) {
        return b(context, str) != null;
    }

    private static java.lang.String b(android.content.Context context) {
        if (!a(context, "com.huawei.hwid")) {
            if (a(context, "com.huawei.hms")) {
                return "com.huawei.hms";
            }
            if (a(context, "com.huawei.hwid.tv")) {
                return "com.huawei.hwid.tv";
            }
        }
        return "com.huawei.hwid";
    }

    public static com.tencent.tmsqmsp.oaid2.r.a a(android.content.Context context) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            com.tencent.tmsqmsp.oaid2.t0.a("Cannot be called from the main thread");
            return null;
        }
        try {
            java.lang.String b17 = b(context);
            if (context.getPackageManager().getPackageInfo(b17, 128) == null) {
                return null;
            }
            com.tencent.tmsqmsp.oaid2.s sVar = new com.tencent.tmsqmsp.oaid2.s();
            android.content.Intent intent = new android.content.Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(b17);
            if (context.bindService(intent, sVar, (context.getApplicationInfo().targetSdkVersion < 34 || android.os.Build.VERSION.SDK_INT < 34) ? 1 : 513)) {
                com.tencent.tmsqmsp.oaid2.t0.b("bind ok");
                try {
                    try {
                        if (sVar.f215658a) {
                            try {
                                context.unbindService(sVar);
                            } catch (java.lang.Throwable unused) {
                            }
                            return null;
                        }
                        sVar.f215658a = true;
                        com.tencent.tmsqmsp.oaid2.u a17 = com.tencent.tmsqmsp.oaid2.u.a.a(sVar.f215659b.take());
                        com.tencent.tmsqmsp.oaid2.r.a aVar = new com.tencent.tmsqmsp.oaid2.r.a(a17.m(), a17.h());
                        try {
                            context.unbindService(sVar);
                        } catch (java.lang.Throwable unused2) {
                        }
                        return aVar;
                    } finally {
                        try {
                            context.unbindService(sVar);
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                } catch (android.os.RemoteException unused4) {
                    com.tencent.tmsqmsp.oaid2.t0.a("bind hms service RemoteException");
                    try {
                        return null;
                    } catch (java.lang.Throwable unused5) {
                        return null;
                    }
                } catch (java.lang.Throwable unused6) {
                    com.tencent.tmsqmsp.oaid2.t0.a("bind hms service InterruptedException");
                    return null;
                }
            }
            com.tencent.tmsqmsp.oaid2.t0.a("bind failed");
            return null;
        } catch (java.lang.Throwable unused7) {
            com.tencent.tmsqmsp.oaid2.t0.a("pkg not found");
            return null;
        }
    }

    private static android.content.pm.PackageInfo b(android.content.Context context, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str) && context != null) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                return packageManager.getPackageInfo(str, 128);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.tencent.tmsqmsp.oaid2.t0.a("getPackageInfo NameNotFoundException");
            } catch (java.lang.Throwable unused2) {
                com.tencent.tmsqmsp.oaid2.t0.a("getPackageInfo Exception");
                return null;
            }
        }
        return null;
    }
}
