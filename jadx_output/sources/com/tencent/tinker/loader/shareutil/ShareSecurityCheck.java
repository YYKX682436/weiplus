package com.tencent.tinker.loader.shareutil;

/* loaded from: classes13.dex */
public class ShareSecurityCheck {
    private static final java.lang.String TAG = "Tinker.SecurityCheck";
    private static java.lang.String mPublicKeyMd5;
    private final android.content.Context mContext;
    private final java.util.HashMap<java.lang.String, java.lang.String> metaContentMap = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, java.lang.String> packageProperties = new java.util.HashMap<>();

    public ShareSecurityCheck(android.content.Context context) {
        this.mContext = context;
        if (mPublicKeyMd5 == null) {
            init(context);
        }
    }

    private boolean check(java.io.File file, java.security.cert.Certificate[] certificateArr) {
        if (certificateArr.length <= 0) {
            return false;
        }
        for (int length = certificateArr.length - 1; length >= 0; length--) {
            try {
            } catch (java.lang.Exception e17) {
                com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(TAG, file.getAbsolutePath(), e17);
            }
            if (mPublicKeyMd5.equals(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(certificateArr[length].getEncoded()))) {
                return true;
            }
        }
        return false;
    }

    private void init(android.content.Context context) {
        try {
            try {
                java.lang.String md52 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
                mPublicKeyMd5 = md52;
                if (md52 != null) {
                } else {
                    throw new com.tencent.tinker.loader.TinkerRuntimeException("get public key md5 is null");
                }
            } catch (java.lang.Exception e17) {
                throw new com.tencent.tinker.loader.TinkerRuntimeException("ShareSecurityCheck init public key fail", e17);
            }
        } finally {
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(null);
        }
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getMetaContentMap() {
        return this.metaContentMap;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getPackagePropertiesIfPresent() {
        java.lang.String[] split;
        if (!this.packageProperties.isEmpty()) {
            return this.packageProperties;
        }
        java.lang.String str = this.metaContentMap.get(com.tencent.tinker.loader.shareutil.ShareConstants.PACKAGE_META_FILE);
        if (str == null) {
            return null;
        }
        for (java.lang.String str2 : str.split("\n")) {
            if (str2 != null && str2.length() > 0 && !str2.startsWith("#") && (split = str2.split("=", 2)) != null && split.length >= 2) {
                this.packageProperties.put(split[0].trim(), split[1].trim());
            }
        }
        return this.packageProperties;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0099: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:54:0x0099 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean verifyPatchMetaSignature(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Tinker.SecurityCheck"
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(r12)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 1
            r3 = 0
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.util.Enumeration r3 = r4.entries()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
        L15:
            boolean r5 = r3.hasMoreElements()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 == 0) goto L60
            java.lang.Object r5 = r3.nextElement()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.util.jar.JarEntry r5 = (java.util.jar.JarEntry) r5     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 != 0) goto L24
            goto L15
        L24:
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.lang.String r7 = "META-INF/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r7 == 0) goto L31
            goto L15
        L31:
            java.lang.String r7 = "meta.txt"
            boolean r7 = r6.endsWith(r7)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r7 != 0) goto L3a
            goto L15
        L3a:
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r11.metaContentMap     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.lang.String r8 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.loadDigestes(r4, r5)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            r7.put(r6, r8)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            java.security.cert.Certificate[] r5 = r5.getCertificates()     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 == 0) goto L4f
            boolean r5 = r11.check(r12, r5)     // Catch: java.lang.Exception -> L71 java.lang.Throwable -> L98
            if (r5 != 0) goto L15
        L4f:
            r4.close()     // Catch: java.io.IOException -> L53
            goto L5f
        L53:
            r1 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r0, r12, r1)
        L5f:
            return r2
        L60:
            r4.close()     // Catch: java.io.IOException -> L64
            goto L70
        L64:
            r2 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r0, r12, r2)
        L70:
            return r1
        L71:
            r3 = move-exception
            goto L79
        L73:
            r1 = move-exception
            goto L9a
        L75:
            r4 = move-exception
            r10 = r4
            r4 = r3
            r3 = r10
        L79:
            com.tencent.tinker.loader.TinkerRuntimeException r5 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "ShareSecurityCheck file %s, size %d verifyPatchMetaSignature fail"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L98
            r7[r2] = r8     // Catch: java.lang.Throwable -> L98
            long r8 = r12.length()     // Catch: java.lang.Throwable -> L98
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L98
            r7[r1] = r2     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = java.lang.String.format(r6, r7)     // Catch: java.lang.Throwable -> L98
            r5.<init>(r1, r3)     // Catch: java.lang.Throwable -> L98
            throw r5     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r3 = r4
        L9a:
            if (r3 == 0) goto Lac
            r3.close()     // Catch: java.io.IOException -> La0
            goto Lac
        La0:
            r2 = move-exception
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.e(r0, r12, r2)
        Lac:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareSecurityCheck.verifyPatchMetaSignature(java.io.File):boolean");
    }
}
