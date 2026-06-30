package org.webrtc;

/* loaded from: classes14.dex */
public class GlTextureFrameBuffer {
    private int frameBufferId;
    private int height;
    private final int pixelFormat;
    private int textureId;
    private int width;

    public GlTextureFrameBuffer(int i17) {
        switch (i17) {
            case com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB /* 6407 */:
            case com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA /* 6408 */:
            case 6409:
                this.pixelFormat = i17;
                this.width = 0;
                this.height = 0;
                return;
            default:
                throw new java.lang.IllegalArgumentException("Invalid pixel format: " + i17);
        }
    }

    public int getFrameBufferId() {
        return this.frameBufferId;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTextureId() {
        return this.textureId;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.textureId}, 0);
        this.textureId = 0;
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferId = 0;
        this.width = 0;
        this.height = 0;
    }

    public void setSize(int i17, int i18) {
        if (i17 <= 0 || i18 <= 0) {
            throw new java.lang.IllegalArgumentException("Invalid size: " + i17 + "x" + i18);
        }
        if (i17 == this.width && i18 == this.height) {
            return;
        }
        this.width = i17;
        this.height = i18;
        if (this.textureId == 0) {
            this.textureId = org.webrtc.GlUtil.generateTexture(3553);
        }
        if (this.frameBufferId == 0) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
            this.frameBufferId = iArr[0];
        }
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(3553, this.textureId);
        int i19 = this.pixelFormat;
        android.opengl.GLES20.glTexImage2D(3553, 0, i19, i17, i18, 0, i19, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
        org.webrtc.GlUtil.checkNoGLES2Error("GlTextureFrameBuffer setSize");
        android.opengl.GLES20.glBindFramebuffer(36160, this.frameBufferId);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
        int glCheckFramebufferStatus = android.opengl.GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
        } else {
            throw new java.lang.IllegalStateException("Framebuffer not complete, status: " + glCheckFramebufferStatus);
        }
    }
}
