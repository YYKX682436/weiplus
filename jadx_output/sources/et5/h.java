package et5;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f256676a;

    static {
        zs5.n0 n0Var = zs5.n0.f475450a;
        boolean z17 = ((zs5.a0) ((jz5.n) zs5.n0.f475451b).getValue()) == zs5.a0.f475317e;
        f256676a = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxQBarUtil", "WxQBarUtil.init enableCrossPlatform: %s", java.lang.Boolean.valueOf(z17));
    }

    public static int a(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, int i17, int i18) {
        if (byteBuffer == null || byteBuffer2 == null) {
            return -1;
        }
        return com.tencent.wechat.aff.iam_scan.c.f216974b.i(byteBuffer2, byteBuffer, i17, i18);
    }

    public static void b(com.tencent.wechat.aff.iam_scan.f fVar, android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            com.tencent.wechat.aff.iam_scan.t tVar = new com.tencent.wechat.aff.iam_scan.t();
            tVar.f217131d = bitmap.getWidth();
            tVar.f217132e = bitmap.getHeight();
            fVar.f217004d.add(tVar);
        }
    }

    public static java.nio.ByteBuffer c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    public static java.nio.ByteBuffer d(android.graphics.Bitmap bitmap) {
        try {
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(allocateDirect);
            return allocateDirect;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxQBarUtil", th6, "buildByteBufferFromBitmap exception", new java.lang.Object[0]);
            return null;
        }
    }

    public static int e(java.nio.ByteBuffer byteBuffer, int[] iArr, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        if (!f256676a) {
            return -1;
        }
        com.tencent.wechat.aff.iam_scan.u a17 = com.tencent.wechat.aff.iam_scan.c.f216974b.a(str, i17, i18, str2, i19, byteBuffer);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxQBarUtil", "encode failed, result null");
            return -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxQBarUtil", "encode result: %d, size: %d, %d", java.lang.Integer.valueOf(a17.f217136d), java.lang.Integer.valueOf(a17.f217137e), java.lang.Integer.valueOf(a17.f217138f));
        if (iArr != null && iArr.length >= 2) {
            iArr[0] = a17.f217137e;
            iArr[1] = a17.f217138f;
        }
        return a17.f217136d;
    }

    public static byte[] f(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        if (byteBuffer.remaining() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxQBarUtil", "getDataFromByteBuffer remaining 0");
            return null;
        }
        int position = byteBuffer.position();
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return bArr;
    }

    public static int g(int i17) {
        if (i17 != 17) {
            return i17 != 842094169 ? -1 : 4;
        }
        return 3;
    }
}
