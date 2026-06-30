package x51;

/* loaded from: classes12.dex */
public abstract class u1 {
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
    
        if (0 == 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.YYBMarketVerify"
            r2 = 0
            r3 = 0
            android.content.Context r8 = r7.createPackageContext(r8, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb
            goto L12
        Lb:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r4)
            r8 = r3
        L12:
            if (r8 != 0) goto L15
            return r2
        L15:
            android.content.res.AssetManager r4 = r8.getAssets()
            android.content.res.Resources r5 = new android.content.res.Resources
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r5.<init>(r4, r7, r3)
            android.content.res.XmlResourceParser r3 = b(r8, r4)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r3 != 0) goto L32
            if (r3 == 0) goto L31
            r3.close()
        L31:
            return r2
        L32:
            int r7 = r3.getEventType()     // Catch: org.xmlpull.v1.XmlPullParserException -> L37 java.io.IOException -> L77 java.lang.Throwable -> L9e
            goto L3e
        L37:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r0, r8)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            r7 = r2
        L3e:
            r8 = 1
            if (r7 == r8) goto La7
            r4 = 2
            if (r7 == r4) goto L45
            goto L8b
        L45:
            java.lang.String r4 = r3.getName()     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r6 != 0) goto L8b
            java.lang.String r6 = "manifest"
            boolean r4 = r4.equals(r6)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r4 == 0) goto L8b
            java.lang.String r7 = "versionCode"
            java.lang.String r4 = "http://schemas.android.com/apk/res/android"
            java.lang.String r7 = r3.getAttributeValue(r4, r7)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r7 == 0) goto L79
            java.lang.String r4 = "@"
            boolean r4 = r7.startsWith(r4)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r4 == 0) goto L79
            java.lang.String r8 = r7.substring(r8)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L79 java.lang.Throwable -> L9e
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L79 java.lang.Throwable -> L9e
            java.lang.String r7 = r5.getString(r8)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L79 java.lang.Throwable -> L9e
            goto L79
        L77:
            r7 = move-exception
            goto La0
        L79:
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            if (r8 == 0) goto L83
            r3.close()
            return r2
        L83:
            int r7 = com.tencent.mm.sdk.platformtools.t8.P(r7, r2)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            r3.close()
            return r7
        L8b:
            int r7 = r3.nextToken()     // Catch: java.io.IOException -> L90 org.xmlpull.v1.XmlPullParserException -> L97 java.lang.Throwable -> L9e
            goto L3e
        L90:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r4)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            goto L3e
        L97:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r4)     // Catch: java.io.IOException -> L77 java.lang.Throwable -> L9e
            goto L3e
        L9e:
            r7 = move-exception
            goto Lab
        La0:
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9e
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r0, r8)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto Laa
        La7:
            r3.close()
        Laa:
            return r2
        Lab:
            if (r3 == 0) goto Lb0
            r3.close()
        Lb0:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x51.u1.a(android.content.Context, java.lang.String):int");
    }

    public static android.content.res.XmlResourceParser b(android.content.Context context, android.content.res.AssetManager assetManager) {
        try {
            java.lang.String str = (java.lang.String) android.content.Context.class.getMethod("getPackageResourcePath", new java.lang.Class[0]).invoke(context, new java.lang.Object[0]);
            java.lang.reflect.Method method = android.content.res.AssetManager.class.getMethod("getCookieName", java.lang.Integer.TYPE);
            if (str == null && context.getPackageName().equals(com.eclipsesource.mmv8.Platform.ANDROID)) {
                str = "/system/framework/framework-res.apk";
            }
            for (int i17 = 1; i17 < 20; i17++) {
                if (str != null && str.equals(method.invoke(assetManager, java.lang.Integer.valueOf(i17)))) {
                    return assetManager.openXmlResourceParser(i17, com.tencent.tinker.loader.shareutil.ShareConstants.RES_MANIFEST);
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return assetManager.openXmlResourceParser(com.tencent.tinker.loader.shareutil.ShareConstants.RES_MANIFEST);
    }
}
