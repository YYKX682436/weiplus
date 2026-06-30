package org.webrtc;

/* loaded from: classes14.dex */
public class GlUtil {

    /* loaded from: classes14.dex */
    public static class GlOutOfMemoryException extends android.opengl.GLException {
        public GlOutOfMemoryException(int i17, java.lang.String str) {
            super(i17, str);
        }
    }

    private GlUtil() {
    }

    public static void checkNoGLES2Error(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError != 0) {
            if (glGetError == 1285) {
                throw new org.webrtc.GlUtil.GlOutOfMemoryException(glGetError, str);
            }
            throw new android.opengl.GLException(glGetError, str + ": GLES20 error: " + glGetError);
        }
    }

    public static java.nio.FloatBuffer createFloatBuffer(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateTexture(int i17) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i18 = iArr[0];
        android.opengl.GLES20.glBindTexture(i17, i18);
        android.opengl.GLES20.glTexParameterf(i17, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(i17, 10242, 33071.0f);
        android.opengl.GLES20.glTexParameterf(i17, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i18;
    }
}
