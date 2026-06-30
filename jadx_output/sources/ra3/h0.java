package ra3;

/* loaded from: classes12.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f393508a = new com.tencent.mm.sdk.platformtools.n3(xu5.b.a("LiteAppUtils"));

    /* renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f393509b = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f393510c = {"_display_name", "_data", "date_added"};

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f393511d = new ra3.c0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f393512e = new ra3.d0();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f393513f = new java.util.HashSet(java.util.Collections.singletonList(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID));

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f393514g = "ASCII\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f393515h = "UNICODE\u0000".getBytes(java.nio.charset.StandardCharsets.US_ASCII);

    public static int a(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("nextAnimIn")) {
            return com.tencent.mm.R.anim.f477886ea;
        }
        java.lang.String string = jSONObject.getString("nextAnimIn");
        java.util.Map map = f393511d;
        return !((java.util.HashMap) map).containsKey(string) ? com.tencent.mm.R.anim.f477886ea : ((java.lang.Integer) ((java.util.HashMap) map).get(string)).intValue();
    }

    public static int b(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("currentAnimOut")) {
            return com.tencent.mm.R.anim.f477882e6;
        }
        java.lang.String string = jSONObject.getString("currentAnimOut");
        java.util.Map map = f393512e;
        return !((java.util.HashMap) map).containsKey(string) ? com.tencent.mm.R.anim.f477882e6 : ((java.lang.Integer) ((java.util.HashMap) map).get(string)).intValue();
    }

    public static boolean c(android.graphics.Bitmap bitmap, java.lang.String str) {
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.e("LiteAppUtils", "bitmap is null");
            return false;
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("LiteAppUtils", "save temp file failed. path: %s", str);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r7, byte[] r8) {
        /*
            boolean r0 = com.tencent.mm.sdk.platformtools.x.f193064a
            java.lang.String r0 = "MicroMsg.BitmapUtil"
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L41
            r1.<init>(r8)     // Catch: java.lang.Exception -> L41
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch: java.lang.Exception -> L41
            r2.<init>(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "UserComment"
            java.lang.String r1 = r2.getAttribute(r1)     // Catch: java.lang.Exception -> L41
            if (r1 != 0) goto L2f
            java.lang.Class<k12.u> r2 = k12.u.class
            i95.m r2 = i95.n0.c(r2)     // Catch: java.lang.Exception -> L41
            k12.u r2 = (k12.u) r2     // Catch: java.lang.Exception -> L41
            h12.z r2 = (h12.z) r2     // Catch: java.lang.Exception -> L41
            r2.getClass()     // Catch: java.lang.Exception -> L41
            byte[] r8 = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeGetAigcInfoFromBuf(r8)     // Catch: java.lang.Exception -> L41
            if (r8 == 0) goto L50
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Exception -> L41
            r1.<init>(r8)     // Catch: java.lang.Exception -> L41
            goto L50
        L2f:
            java.lang.String r8 = "\"AIGC"
            boolean r8 = r1.contains(r8)     // Catch: java.lang.Exception -> L41
            if (r8 == 0) goto L4f
            java.lang.String r8 = "getAIGCInfoFromBuf. userComment: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L41
            com.tencent.mars.xlog.Log.i(r0, r8, r2)     // Catch: java.lang.Exception -> L41
            goto L50
        L41:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r1 = "getAIGCInfoFromBuf error %s"
            com.tencent.mars.xlog.Log.e(r0, r1, r8)
        L4f:
            r1 = 0
        L50:
            if (r1 == 0) goto Ld3
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto Ld3
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r8 = r1.getBytes(r8)
            r0 = 1
            byte[] r2 = ra3.h0.f393515h
            byte[] r3 = ra3.h0.f393514g
            r4 = 0
            if (r8 == 0) goto L7f
            int r5 = r8.length
            r6 = 8
            if (r5 >= r6) goto L6c
            goto L7f
        L6c:
            byte[] r5 = new byte[r6]
            java.lang.System.arraycopy(r8, r4, r5, r4, r6)
            boolean r8 = java.util.Arrays.equals(r5, r3)
            if (r8 != 0) goto L7d
            boolean r8 = java.util.Arrays.equals(r5, r2)
            if (r8 == 0) goto L7f
        L7d:
            r8 = r0
            goto L80
        L7f:
            r8 = r4
        L80:
            if (r8 == 0) goto L83
            goto Lcf
        L83:
            r8 = r4
        L84:
            int r5 = r1.length()
            if (r8 >= r5) goto L97
            char r5 = r1.charAt(r8)
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 <= r6) goto L94
            r0 = r4
            goto L97
        L94:
            int r8 = r8 + 1
            goto L84
        L97:
            if (r0 == 0) goto Lb1
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r8 = r1.getBytes(r8)
            int r0 = r3.length
            int r1 = r8.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.put(r3)
            r0.put(r8)
            byte[] r8 = r0.array()
            goto Lc8
        Lb1:
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_16BE
            byte[] r8 = r1.getBytes(r8)
            int r0 = r2.length
            int r1 = r8.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.put(r2)
            r0.put(r8)
            byte[] r8 = r0.array()
        Lc8:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            r1.<init>(r8, r0)
        Lcf:
            com.tencent.mm.sdk.platformtools.x.L0(r1, r7)
            goto Ldb
        Ld3:
            java.lang.String r7 = "LiteAppUtils"
            java.lang.String r8 = "userComment is null or empty"
            com.tencent.mars.xlog.Log.e(r7, r8)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ra3.h0.d(java.lang.String, byte[]):void");
    }

    public static java.lang.String[] e(java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String[] strArr = new java.lang.String[2];
        if (z17) {
            try {
                str = java.net.URLDecoder.decode(str, com.tencent.mapsdk.internal.rv.f51270c);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppUtils", e17, "", new java.lang.Object[0]);
            }
        }
        java.lang.String[] split = str.split("\\?");
        if (split.length > 1) {
            strArr[0] = split[0];
            str2 = split[1];
        } else if (str.contains("=")) {
            strArr[0] = null;
            str2 = split[0];
        } else {
            strArr[0] = split[0];
            str2 = null;
        }
        cl0.g gVar = new cl0.g();
        if (str2 != null) {
            for (java.lang.String str3 : str2.split("&")) {
                java.lang.String[] split2 = str3.split("=");
                if (split2 != null && split2.length >= 2) {
                    gVar.h(split2[0].trim(), split2[1].trim());
                }
            }
        }
        strArr[1] = gVar.toString();
        return strArr;
    }
}
