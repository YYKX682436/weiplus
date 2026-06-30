package jd0;

@j95.b
/* loaded from: classes10.dex */
public class w1 extends i95.w implements kd0.k2 {
    public android.graphics.Bitmap Ai(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, int i17, double d17) {
        int[] iArr = new int[2];
        boolean z17 = et5.h.f256676a;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
        int e17 = et5.h.e(allocateDirect, iArr, str, 12, i17, com.tencent.mapsdk.internal.rv.f51270c, -1);
        byte[] f17 = et5.h.f(allocateDirect);
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createAvatarQRCodeBitmap result: %d, matrix: %s", java.lang.Integer.valueOf(e17), f17);
        if (f17 != null && e17 == 0) {
            android.graphics.Bitmap a17 = x45.a.a(context, bitmap, f17, iArr, d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", a17);
            return a17;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        return null;
    }

    public android.graphics.Bitmap Bi(android.content.Context context, java.lang.String str, int i17, int i18) {
        return x45.a.b(context, str, i17, i18, 0.1d);
    }

    public android.graphics.Bitmap wi(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, int i17) {
        int[] iArr = new int[2];
        boolean z17 = et5.h.f256676a;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL);
        int e17 = et5.h.e(allocateDirect, iArr, str, 12, i17, com.tencent.mapsdk.internal.rv.f51270c, -1);
        byte[] f17 = et5.h.f(allocateDirect);
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createQRCodeBitmap result: %d, matrix: %s", java.lang.Integer.valueOf(e17), f17);
        if (f17 != null && e17 == 0) {
            android.graphics.Bitmap a17 = x45.a.a(context, bitmap, f17, iArr, 0.1d);
            com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "createBitmap %s", a17);
            return a17;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e17);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeBitmapFactory", "result %d %s", valueOf, com.tencent.mm.sdk.platformtools.z3.b(true));
        return null;
    }
}
