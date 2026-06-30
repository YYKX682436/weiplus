package uy5;

/* loaded from: classes13.dex */
public final class a implements io.flutter.plugin.common.MethodChannel.MethodCallHandler, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f432021d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f432022e;

    public final java.lang.String a(android.content.pm.PackageManager packageManager) {
        java.lang.String b17;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                android.content.Context context = this.f432021d;
                kotlin.jvm.internal.o.d(context);
                android.content.pm.SigningInfo signingInfo = packageManager.getPackageInfo(context.getPackageName(), 134217728).signingInfo;
                if (signingInfo == null) {
                    return null;
                }
                if (signingInfo.hasMultipleSigners()) {
                    android.content.pm.Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    kotlin.jvm.internal.o.f(apkContentsSigners, "getApkContentsSigners(...)");
                    byte[] byteArray = ((android.content.pm.Signature) kz5.z.L(apkContentsSigners)).toByteArray();
                    kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                    b17 = b(byteArray);
                } else {
                    android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    kotlin.jvm.internal.o.f(signingCertificateHistory, "getSigningCertificateHistory(...)");
                    byte[] byteArray2 = ((android.content.pm.Signature) kz5.z.L(signingCertificateHistory)).toByteArray();
                    kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                    b17 = b(byteArray2);
                }
            } else {
                android.content.Context context2 = this.f432021d;
                kotlin.jvm.internal.o.d(context2);
                android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(context2.getPackageName(), 64).signatures;
                boolean z17 = true;
                if (signatureArr != null) {
                    if (!(signatureArr.length == 0)) {
                        z17 = false;
                    }
                }
                if (z17) {
                    return null;
                }
                kotlin.jvm.internal.o.d(signatureArr);
                if (kz5.z.L(signatureArr) == null) {
                    return null;
                }
                byte[] byteArray3 = ((android.content.pm.Signature) kz5.z.L(signatureArr)).toByteArray();
                kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
                b17 = b(byteArray3);
            }
            return b17;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public final java.lang.String b(byte[] bArr) {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.o.d(digest);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[digest.length * 2];
        int length = digest.length;
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = digest[i17] & 255;
            int i19 = i17 * 2;
            cArr2[i19] = cArr[i18 >>> 4];
            cArr2[i19 + 1] = cArr[i18 & 15];
        }
        return new java.lang.String(cArr2);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f432021d = binding.getApplicationContext();
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f432022e = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f432021d = null;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f432022e;
        kotlin.jvm.internal.o.d(methodChannel);
        methodChannel.setMethodCallHandler(null);
        this.f432022e = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str;
        java.lang.CharSequence loadLabel;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        try {
            if (!kotlin.jvm.internal.o.b(call.method, "getAll")) {
                result.notImplemented();
                return;
            }
            android.content.Context context = this.f432021d;
            kotlin.jvm.internal.o.d(context);
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            android.content.Context context2 = this.f432021d;
            kotlin.jvm.internal.o.d(context2);
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            java.lang.String a17 = a(packageManager);
            android.content.Context context3 = this.f432021d;
            kotlin.jvm.internal.o.d(context3);
            android.content.pm.PackageManager packageManager2 = context3.getPackageManager();
            android.content.Context context4 = this.f432021d;
            kotlin.jvm.internal.o.d(context4);
            java.lang.String packageName = context4.getPackageName();
            int i17 = android.os.Build.VERSION.SDK_INT;
            java.lang.String initiatingPackageName = i17 >= 30 ? packageManager2.getInstallSourceInfo(packageName).getInitiatingPackageName() : packageManager2.getInstallerPackageName(packageName);
            long j17 = packageInfo.firstInstallTime;
            long j18 = packageInfo.lastUpdateTime;
            java.util.HashMap hashMap = new java.util.HashMap();
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            java.lang.String str2 = "";
            if (applicationInfo == null || (loadLabel = applicationInfo.loadLabel(packageManager)) == null || (str = loadLabel.toString()) == null) {
                str = "";
            }
            hashMap.put("appName", str);
            android.content.Context context5 = this.f432021d;
            kotlin.jvm.internal.o.d(context5);
            hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, context5.getPackageName());
            java.lang.String str3 = packageInfo.versionName;
            if (str3 != null) {
                str2 = str3;
            }
            hashMap.put("version", str2);
            hashMap.put("buildNumber", java.lang.String.valueOf(i17 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
            if (a17 != null) {
                hashMap.put("buildSignature", a17);
            }
            if (initiatingPackageName != null) {
                hashMap.put("installerStore", initiatingPackageName);
            }
            hashMap.put("installTime", java.lang.String.valueOf(j17));
            hashMap.put(dm.i4.COL_UPDATETIME, java.lang.String.valueOf(j18));
            result.success(hashMap);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            result.error("Name not found", e17.getMessage(), null);
        }
    }
}
