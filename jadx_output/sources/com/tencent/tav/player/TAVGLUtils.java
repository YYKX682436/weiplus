package com.tencent.tav.player;

/* loaded from: classes14.dex */
public class TAVGLUtils {
    private static final java.lang.String TAG = "TAVGLUtils";
    private byte _hellAccFlag_;

    public static java.lang.String convertStreamToString(java.io.InputStream inputStream) {
        java.util.Scanner useDelimiter = new java.util.Scanner(inputStream, com.tencent.mapsdk.internal.rv.f51270c).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static boolean isSupportGLOES3() {
        java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
        return glGetString != null && glGetString.contains("GL_OES_EGL_image_external_essl3");
    }

    public static boolean isSupportGLSL3() {
        java.lang.String glGetString = android.opengl.GLES20.glGetString(35724);
        return glGetString != null && glGetString.contains("OpenGL ES GLSL ES 3");
    }

    public static float lerp(float f17, float f18, float f19) {
        return (f17 * (1.0f - f19)) + (f18 * f19);
    }

    public static java.lang.String loadShaderCode(android.content.Context context, java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(str);
                java.lang.String convertStreamToString = convertStreamToString(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return convertStreamToString;
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "loadShaderCode", e17);
            if (inputStream == null) {
                return "";
            }
            try {
                inputStream.close();
                return "";
            } catch (java.io.IOException unused3) {
                return "";
            }
        }
    }

    public static android.graphics.Bitmap saveBitmap(int i17, int i18, int i19) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glBindTexture(3553, i17);
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18 * i19 * 4);
        allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        android.opengl.GLES20.glReadPixels(0, 0, i18, i19, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_4444;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/player/TAVGLUtils", "saveBitmap", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/tav/player/TAVGLUtils", "saveBitmap", "(III)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        return createBitmap;
    }
}
