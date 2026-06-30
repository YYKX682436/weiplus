package org.webrtc;

/* loaded from: classes14.dex */
public final class YuvConverter {
    private static final java.lang.String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final java.lang.String TAG = "YuvConverter";
    private final org.webrtc.GlGenericDrawer drawer;
    private final org.webrtc.GlTextureFrameBuffer i420TextureFrameBuffer;
    private final org.webrtc.YuvConverter.ShaderCallbacks shaderCallbacks;
    private final org.webrtc.ThreadUtils.ThreadChecker threadChecker;
    private final org.webrtc.VideoFrameDrawer videoFrameDrawer;

    /* loaded from: classes14.dex */
    public static class ShaderCallbacks implements org.webrtc.GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] yCoeffs = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] uCoeffs = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] vCoeffs = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};

        private ShaderCallbacks() {
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(org.webrtc.GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // org.webrtc.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(org.webrtc.GlShader glShader, float[] fArr, int i17, int i18, int i19, int i27) {
            android.opengl.GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i28 = this.xUnitLoc;
            float f17 = this.stepSize;
            float f18 = i17;
            android.opengl.GLES20.glUniform2f(i28, (fArr[0] * f17) / f18, (f17 * fArr[1]) / f18);
        }

        public void setPlaneU() {
            this.coeffs = uCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneV() {
            this.coeffs = vCoeffs;
            this.stepSize = 2.0f;
        }

        public void setPlaneY() {
            this.coeffs = yCoeffs;
            this.stepSize = 1.0f;
        }
    }

    public YuvConverter() {
        this(new org.webrtc.VideoFrameDrawer());
    }

    private org.webrtc.VideoFrame.I420Buffer convertInternal(org.webrtc.VideoFrame.TextureBuffer textureBuffer) {
        org.webrtc.VideoFrame.TextureBuffer textureBuffer2 = (org.webrtc.VideoFrame.TextureBuffer) this.videoFrameDrawer.prepareBufferForViewportSize(textureBuffer, textureBuffer.getWidth(), textureBuffer.getHeight());
        int width = textureBuffer2.getWidth();
        int height = textureBuffer2.getHeight();
        int i17 = ((width + 7) / 8) * 8;
        int i18 = (height + 1) / 2;
        int i19 = height + i18;
        final java.nio.ByteBuffer nativeAllocateByteBuffer = org.webrtc.JniCommon.nativeAllocateByteBuffer(i17 * i19);
        int i27 = i17 / 4;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        this.i420TextureFrameBuffer.setSize(i27, i19);
        android.opengl.GLES20.glBindFramebuffer(36160, this.i420TextureFrameBuffer.getFrameBufferId());
        org.webrtc.GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        org.webrtc.VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, 0, 0, i27, height);
        this.shaderCallbacks.setPlaneU();
        int i28 = i27 / 2;
        org.webrtc.VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, 0, height, i28, i18);
        this.shaderCallbacks.setPlaneV();
        org.webrtc.VideoFrameDrawer.drawTexture(this.drawer, textureBuffer2, matrix, width, height, i28, height, i28, i18);
        android.opengl.GLES20.glReadPixels(0, 0, this.i420TextureFrameBuffer.getWidth(), this.i420TextureFrameBuffer.getHeight(), com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, nativeAllocateByteBuffer);
        org.webrtc.GlUtil.checkNoGLES2Error("YuvConverter.convert");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        int i29 = (i17 * height) + 0;
        int i37 = i17 / 2;
        int i38 = i29 + i37;
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i29);
        java.nio.ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i29);
        int i39 = ((i18 - 1) * i17) + i37;
        nativeAllocateByteBuffer.limit(i29 + i39);
        java.nio.ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i38);
        nativeAllocateByteBuffer.limit(i38 + i39);
        java.nio.ByteBuffer slice3 = nativeAllocateByteBuffer.slice();
        textureBuffer2.release();
        return org.webrtc.JavaI420Buffer.wrap(width, height, slice, i17, slice2, i17, slice3, i17, new java.lang.Runnable() { // from class: org.webrtc.YuvConverter$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    public org.webrtc.VideoFrame.I420Buffer convert(org.webrtc.VideoFrame.TextureBuffer textureBuffer) {
        try {
            return convertInternal(textureBuffer);
        } catch (android.opengl.GLException e17) {
            org.webrtc.Logging.w(TAG, "Failed to convert TextureBuffer", e17);
            return null;
        }
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.videoFrameDrawer.release();
        this.threadChecker.detachThread();
    }

    public YuvConverter(org.webrtc.VideoFrameDrawer videoFrameDrawer) {
        org.webrtc.ThreadUtils.ThreadChecker threadChecker = new org.webrtc.ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new org.webrtc.GlTextureFrameBuffer(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA);
        org.webrtc.YuvConverter.ShaderCallbacks shaderCallbacks = new org.webrtc.YuvConverter.ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new org.webrtc.GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        this.videoFrameDrawer = videoFrameDrawer;
        threadChecker.detachThread();
    }
}
