package com.tencent.tavkit.ciimage;

/* loaded from: classes14.dex */
public class TAVGLUtils {
    private byte _hellAccFlag_;

    private static com.tencent.tav.coremedia.TextureInfo checkTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo.textureType == 3553) {
            return textureInfo;
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = new com.tencent.tav.coremedia.TextureInfo(com.tencent.tav.decoder.RenderContext.createTexture(3553), 3553, textureInfo.width, textureInfo.height, null, 0);
        com.tencent.tavkit.ciimage.TextureFilter textureFilter = new com.tencent.tavkit.ciimage.TextureFilter();
        textureFilter.setOutputTextureInfo(textureInfo2);
        textureFilter.applyFilter(textureInfo, null, textureInfo.getTextureMatrix(), 1.0f, null);
        return textureInfo2;
    }

    public static android.graphics.Bitmap saveBitmap(int i17, int i18, int i19) {
        return saveBitmap(i17, 3553, i18, i19);
    }

    public static android.graphics.Bitmap saveBitmap(int i17, int i18, int i19, int i27) {
        return saveBitmap(new com.tencent.tav.coremedia.TextureInfo(i17, i18, i19, i27, 0));
    }

    public static android.graphics.Bitmap saveBitmap(com.tencent.tavkit.ciimage.CIImage cIImage) {
        com.tencent.tav.coremedia.TextureInfo newTextureInfo = com.tencent.tavkit.ciimage.CIContext.newTextureInfo(cIImage.getSize().width, cIImage.getSize().height);
        com.tencent.tavkit.ciimage.CIImageFilter cIImageFilter = new com.tencent.tavkit.ciimage.CIImageFilter();
        cIImageFilter.setOutputTextureInfo(newTextureInfo);
        cIImage.draw(cIImageFilter);
        return saveBitmap(newTextureInfo);
    }

    public static android.graphics.Bitmap saveBitmap(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        com.tencent.tav.coremedia.TextureInfo checkTextureInfo = checkTextureInfo(textureInfo);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, checkTextureInfo.textureID, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(checkTextureInfo.width * checkTextureInfo.height * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, checkTextureInfo.width, checkTextureInfo.height, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        int i17 = checkTextureInfo.width;
        int i18 = checkTextureInfo.height;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tavkit/ciimage/TAVGLUtils", "saveBitmap", "(Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tavkit/ciimage/TAVGLUtils", "saveBitmap", "(Lcom/tencent/tav/coremedia/TextureInfo;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }
}
