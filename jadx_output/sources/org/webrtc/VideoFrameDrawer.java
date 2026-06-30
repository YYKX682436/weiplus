package org.webrtc;

/* loaded from: classes16.dex */
public class VideoFrameDrawer {
    public static final java.lang.String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private org.webrtc.VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final android.graphics.Point renderSize = new android.graphics.Point();
    private final org.webrtc.VideoFrameDrawer.YuvUploader yuvUploader = new org.webrtc.VideoFrameDrawer.YuvUploader(null);
    private final android.graphics.Matrix renderMatrix = new android.graphics.Matrix();

    /* renamed from: org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[org.webrtc.VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[org.webrtc.VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[org.webrtc.VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class YuvUploader {
        private java.nio.ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public /* synthetic */ YuvUploader(org.webrtc.VideoFrameDrawer.AnonymousClass1 anonymousClass1) {
            this();
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                android.opengl.GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(org.webrtc.VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new java.nio.ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i17, int i18, int[] iArr, java.nio.ByteBuffer[] byteBufferArr) {
            java.nio.ByteBuffer byteBuffer;
            java.nio.ByteBuffer byteBuffer2;
            int i19 = i17 / 2;
            int[] iArr2 = {i17, i19, i19};
            int i27 = i18 / 2;
            int[] iArr3 = {i18, i27, i27};
            int i28 = 0;
            for (int i29 = 0; i29 < 3; i29++) {
                int i37 = iArr[i29];
                int i38 = iArr2[i29];
                if (i37 > i38) {
                    i28 = java.lang.Math.max(i28, i38 * iArr3[i29]);
                }
            }
            if (i28 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i28)) {
                this.copyBuffer = java.nio.ByteBuffer.allocateDirect(i28);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i39 = 0; i39 < 3; i39++) {
                    this.yuvTextures[i39] = org.webrtc.GlUtil.generateTexture(3553);
                }
            }
            for (int i47 = 0; i47 < 3; i47++) {
                android.opengl.GLES20.glActiveTexture(33984 + i47);
                android.opengl.GLES20.glBindTexture(3553, this.yuvTextures[i47]);
                int i48 = iArr[i47];
                int i49 = iArr2[i47];
                if (i48 == i49) {
                    byteBuffer = byteBufferArr[i47];
                } else {
                    org.webrtc.YuvHelper.copyPlane(byteBufferArr[i47], i48, this.copyBuffer, i49, i49, iArr3[i47]);
                    byteBuffer = this.copyBuffer;
                }
                android.opengl.GLES20.glTexImage2D(3553, 0, 6409, iArr2[i47], iArr3[i47], 0, 6409, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, byteBuffer);
            }
            return this.yuvTextures;
        }
    }

    private void calculateTransformedRenderSize(int i17, int i18, android.graphics.Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i17;
            this.renderHeight = i18;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i19 = 0; i19 < 3; i19++) {
            float[] fArr = this.dstPoints;
            int i27 = i19 * 2;
            int i28 = i27 + 0;
            fArr[i28] = fArr[i28] * i17;
            int i29 = i27 + 1;
            fArr[i29] = fArr[i29] * i18;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f17, float f18, float f19, float f27) {
        return (int) java.lang.Math.round(java.lang.Math.hypot(f19 - f17, f27 - f18));
    }

    public static void drawTexture(org.webrtc.RendererCommon.GlDrawer glDrawer, org.webrtc.VideoFrame.TextureBuffer textureBuffer, android.graphics.Matrix matrix, int i17, int i18, int i19, int i27, int i28, int i29) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(textureBuffer.getTransformMatrix());
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = org.webrtc.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int i37 = org.webrtc.VideoFrameDrawer.AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[textureBuffer.getType().ordinal()];
        if (i37 == 1) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i17, i18, i19, i27, i28, i29);
        } else {
            if (i37 != 2) {
                throw new java.lang.RuntimeException("Unknown texture type.");
            }
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i17, i18, i19, i27, i28, i29);
        }
    }

    public void drawFrame(org.webrtc.VideoFrame videoFrame, org.webrtc.RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, null);
    }

    public org.webrtc.VideoFrame.Buffer prepareBufferForViewportSize(org.webrtc.VideoFrame.Buffer buffer, int i17, int i18) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }

    public void drawFrame(org.webrtc.VideoFrame videoFrame, org.webrtc.RendererCommon.GlDrawer glDrawer, android.graphics.Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(org.webrtc.VideoFrame videoFrame, org.webrtc.RendererCommon.GlDrawer glDrawer, android.graphics.Matrix matrix, int i17, int i18, int i19, int i27) {
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        if (this.renderWidth > 0 && this.renderHeight > 0) {
            boolean z17 = videoFrame.getBuffer() instanceof org.webrtc.VideoFrame.TextureBuffer;
            this.renderMatrix.reset();
            this.renderMatrix.preTranslate(0.5f, 0.5f);
            if (!z17) {
                this.renderMatrix.preScale(1.0f, -1.0f);
            }
            this.renderMatrix.preRotate(videoFrame.getRotation());
            this.renderMatrix.preTranslate(-0.5f, -0.5f);
            if (matrix != null) {
                this.renderMatrix.preConcat(matrix);
            }
            if (z17) {
                this.lastI420Frame = null;
                drawTexture(glDrawer, (org.webrtc.VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i17, i18, i19, i27);
                return;
            }
            if (videoFrame != this.lastI420Frame) {
                this.lastI420Frame = videoFrame;
                org.webrtc.VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), org.webrtc.RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i17, i18, i19, i27);
            return;
        }
        org.webrtc.Logging.w(TAG, "Illegal frame size: " + this.renderWidth + "x" + this.renderHeight);
    }
}
