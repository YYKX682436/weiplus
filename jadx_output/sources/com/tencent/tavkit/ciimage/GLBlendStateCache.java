package com.tencent.tavkit.ciimage;

/* loaded from: classes10.dex */
class GLBlendStateCache {
    private static final java.lang.String TAG = "GLBlendStateCache";
    private final int[] pNames = {32777, 32777, 34877, 32969, 32968, 32971, 32970};
    private final int[] params = new int[7];

    public synchronized void cache() {
        int i17 = 0;
        while (true) {
            int[] iArr = this.pNames;
            if (i17 < iArr.length) {
                android.opengl.GLES20.glGetIntegerv(iArr[i17], this.params, i17);
                i17++;
            }
        }
    }

    public synchronized void restore() {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "restore: params = " + java.util.Arrays.toString(this.params));
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendEquation(this.params[0]);
        int[] iArr = this.params;
        android.opengl.GLES20.glBlendEquationSeparate(iArr[1], iArr[2]);
        int[] iArr2 = this.params;
        android.opengl.GLES20.glBlendFuncSeparate(iArr2[3], iArr2[4], iArr2[5], iArr2[6]);
    }
}
