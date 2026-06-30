package nt3;

/* loaded from: classes14.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public int f339708a;

    public int a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.AbsShader", "loadShader");
        int[] iArr = new int[1];
        int glCreateShader = android.opengl.GLES20.glCreateShader(i17);
        if (glCreateShader == 0) {
            return 0;
        }
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Story.AbsShader", android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public int b(android.graphics.Bitmap bitmap, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Story.AbsShader", "loadTexture");
        if (bitmap != null) {
            if (i17 > 0) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
            }
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            android.opengl.GLES20.glBindTexture(3553, iArr[0]);
            i17 = iArr[0];
            android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
            android.opengl.GLES20.glTexParameteri(3553, 10242, 10497);
            android.opengl.GLES20.glTexParameteri(3553, 10243, 10497);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            if (z17) {
                bitmap.recycle();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Story.AbsShader", "loadTexture bitmap null");
        }
        return i17;
    }
}
