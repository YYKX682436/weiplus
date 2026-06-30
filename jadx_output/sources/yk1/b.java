package yk1;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f462773a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f462774b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f462775c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f462776d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f462777e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f462778f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, com.tencent.wxmm.v2encoder.enumCODEC_vcodec2, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:39:0x00ed
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.ByteArrayInputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.zip.GZIPInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static byte[] a(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk1.b.a(java.lang.String, int):byte[]");
    }

    public static int b(byte[] bArr, int i17, byte[] bArr2, int i18, int i19) {
        int i27;
        int i28;
        if (bArr == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Source array was null.");
            return 0;
        }
        if (bArr2 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Destination array was null.");
            return 0;
        }
        if (i17 < 0 || (i27 = i17 + 3) >= bArr.length) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "srcOffset < 0 || srcOffset + 3 >= source.length");
            return 0;
        }
        if (i18 < 0 || (i28 = i18 + 2) >= bArr2.length) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Destination array with length cannot have offset of and still store three bytes.");
            return 0;
        }
        byte[] e17 = e(i19);
        byte b17 = bArr[i17 + 2];
        if (b17 == 61) {
            bArr2[i18] = (byte) ((((e17[bArr[i17 + 1]] & 255) << 12) | ((e17[bArr[i17]] & 255) << 18)) >>> 16);
            return 1;
        }
        byte b18 = bArr[i27];
        if (b18 == 61) {
            int i29 = ((e17[bArr[i17 + 1]] & 255) << 12) | ((e17[bArr[i17]] & 255) << 18) | ((e17[b17] & 255) << 6);
            bArr2[i18] = (byte) (i29 >>> 16);
            bArr2[i18 + 1] = (byte) (i29 >>> 8);
            return 2;
        }
        int i37 = ((e17[bArr[i17 + 1]] & 255) << 12) | ((e17[bArr[i17]] & 255) << 18) | ((e17[b17] & 255) << 6) | (e17[b18] & 255);
        bArr2[i18] = (byte) (i37 >> 16);
        bArr2[i18 + 1] = (byte) (i37 >> 8);
        bArr2[i28] = (byte) i37;
        return 3;
    }

    public static byte[] c(byte[] bArr, int i17, int i18, byte[] bArr2, int i19, int i27) {
        byte[] bArr3 = (i27 & 16) == 16 ? f462775c : (i27 & 32) == 32 ? f462777e : f462773a;
        int i28 = (i18 > 1 ? (bArr[i17 + 1] << 24) >>> 16 : 0) | (i18 > 0 ? (bArr[i17] << 24) >>> 8 : 0) | (i18 > 2 ? (bArr[i17 + 2] << 24) >>> 24 : 0);
        if (i18 == 1) {
            bArr2[i19] = bArr3[i28 >>> 18];
            bArr2[i19 + 1] = bArr3[(i28 >>> 12) & 63];
            bArr2[i19 + 2] = 61;
            bArr2[i19 + 3] = 61;
            return bArr2;
        }
        if (i18 == 2) {
            bArr2[i19] = bArr3[i28 >>> 18];
            bArr2[i19 + 1] = bArr3[(i28 >>> 12) & 63];
            bArr2[i19 + 2] = bArr3[(i28 >>> 6) & 63];
            bArr2[i19 + 3] = 61;
            return bArr2;
        }
        if (i18 != 3) {
            return bArr2;
        }
        bArr2[i19] = bArr3[i28 >>> 18];
        bArr2[i19 + 1] = bArr3[(i28 >>> 12) & 63];
        bArr2[i19 + 2] = bArr3[(i28 >>> 6) & 63];
        bArr2[i19 + 3] = bArr3[i28 & 63];
        return bArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static java.lang.String d(byte[] bArr, int i17, int i18, int i19) {
        byte[] bArr2;
        ?? r27;
        yk1.a aVar;
        yk1.a aVar2;
        ?? r47;
        java.lang.Object obj;
        if (bArr == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Cannot serialize a null array.");
            bArr2 = new byte[0];
        } else if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Cannot have negative offset: " + i17);
            bArr2 = new byte[0];
        } else if (i18 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "Cannot have length offset: " + i18);
            bArr2 = new byte[0];
        } else if (i17 + i18 > bArr.length) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.Base64", "off + len > source.length  ");
            bArr2 = new byte[0];
        } else if ((i19 & 2) != 0) {
            yk1.a aVar3 = null;
            try {
                r27 = new java.io.ByteArrayOutputStream();
                try {
                    aVar = new yk1.a(r27, i19 | 1);
                    try {
                        r47 = new java.util.zip.GZIPOutputStream(aVar);
                    } catch (java.io.IOException e17) {
                        e = e17;
                        r47 = 0;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        try {
                            aVar3.close();
                        } catch (java.lang.Exception unused) {
                        }
                        try {
                            aVar.close();
                        } catch (java.lang.Exception unused2) {
                        }
                        try {
                            r27.close();
                            throw th;
                        } catch (java.lang.Exception unused3) {
                            throw th;
                        }
                    }
                } catch (java.io.IOException e18) {
                    e = e18;
                    obj = null;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    aVar = null;
                }
            } catch (java.io.IOException e19) {
                e = e19;
                aVar2 = null;
                r47 = 0;
            } catch (java.lang.Throwable th8) {
                th = th8;
                r27 = 0;
                aVar = null;
            }
            try {
                r47.write(bArr, i17, i18);
                r47.close();
                try {
                    r47.close();
                } catch (java.lang.Exception unused4) {
                }
                try {
                    aVar.close();
                } catch (java.lang.Exception unused5) {
                }
                try {
                    r27.close();
                } catch (java.lang.Exception unused6) {
                }
                bArr2 = r27.toByteArray();
            } catch (java.io.IOException e27) {
                e = e27;
                aVar3 = aVar;
                obj = r47;
                aVar2 = aVar3;
                aVar3 = r27;
                r47 = obj;
                try {
                    throw e;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    aVar = aVar2;
                    r27 = aVar3;
                    aVar3 = r47;
                    aVar3.close();
                    aVar.close();
                    r27.close();
                    throw th;
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                aVar3 = r47;
                aVar3.close();
                aVar.close();
                r27.close();
                throw th;
            }
        } else {
            boolean z17 = (i19 & 8) != 0;
            int i27 = ((i18 / 3) * 4) + (i18 % 3 > 0 ? 4 : 0);
            if (z17) {
                i27 += i27 / 76;
            }
            int i28 = i27;
            byte[] bArr3 = new byte[i28];
            int i29 = i18 - 2;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            while (i37 < i29) {
                int i47 = i37;
                c(bArr, i37 + i17, 3, bArr3, i38, i19);
                int i48 = i39 + 4;
                if (!z17 || i48 < 76) {
                    i39 = i48;
                } else {
                    bArr3[i38 + 4] = 10;
                    i38++;
                    i39 = 0;
                }
                i37 = i47 + 3;
                i38 += 4;
            }
            int i49 = i37;
            if (i49 < i18) {
                c(bArr, i49 + i17, i18 - i49, bArr3, i38, i19);
                i38 += 4;
            }
            int i57 = i38;
            if (i57 <= i28 - 1) {
                byte[] bArr4 = new byte[i57];
                java.lang.System.arraycopy(bArr3, 0, bArr4, 0, i57);
                bArr2 = bArr4;
            } else {
                bArr2 = bArr3;
            }
        }
        try {
            return new java.lang.String(bArr2, "US-ASCII");
        } catch (java.io.UnsupportedEncodingException unused7) {
            return new java.lang.String(bArr2);
        }
    }

    public static final byte[] e(int i17) {
        return (i17 & 16) == 16 ? f462776d : (i17 & 32) == 32 ? f462778f : f462774b;
    }
}
