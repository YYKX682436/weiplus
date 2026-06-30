package com.tencent.thumbplayer.core.postprocessor.group;

/* loaded from: classes14.dex */
public interface IFilterGroup {
    static void checkGlError(java.lang.String str) {
        if (android.opengl.GLES20.glGetError() != 0) {
            throw new java.lang.RuntimeException(str);
        }
    }

    void destroyBuffers();

    void genOESTexture();

    int getOESTextureid();

    void process(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, int i27, boolean z17, int i28);
}
