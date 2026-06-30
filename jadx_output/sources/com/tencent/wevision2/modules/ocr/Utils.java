package com.tencent.wevision2.modules.ocr;

/* loaded from: classes14.dex */
public class Utils {
    static {
        int i17 = fx5.a.f267157a;
    }

    public static native android.util.Size getPerspectiveWarppedImageSize(com.tencent.wevision2.base.PixelBuffer pixelBuffer, android.graphics.PointF[] pointFArr, int i17);

    public static native android.util.Size warpPerspective(com.tencent.wevision2.base.PixelBuffer pixelBuffer, android.graphics.PointF[] pointFArr, int i17, java.nio.ByteBuffer byteBuffer);

    public static com.tencent.wevision2.base.PixelBuffer warpPerspective(com.tencent.wevision2.base.PixelBuffer pixelBuffer, android.graphics.PointF[] pointFArr, int i17) {
        android.util.Size perspectiveWarppedImageSize;
        java.nio.ByteBuffer allocateDirect;
        android.util.Size warpPerspective;
        if (pixelBuffer == null || pointFArr == null || pointFArr.length != 4 || (perspectiveWarppedImageSize = getPerspectiveWarppedImageSize(pixelBuffer, pointFArr, i17)) == null || perspectiveWarppedImageSize.getWidth() <= 0 || perspectiveWarppedImageSize.getHeight() <= 0 || (warpPerspective = warpPerspective(pixelBuffer, pointFArr, i17, (allocateDirect = java.nio.ByteBuffer.allocateDirect(perspectiveWarppedImageSize.getWidth() * perspectiveWarppedImageSize.getHeight() * 4)))) == null || warpPerspective.getWidth() <= 0 || warpPerspective.getHeight() <= 0) {
            return null;
        }
        return new com.tencent.wevision2.base.PixelBuffer(warpPerspective.getWidth(), warpPerspective.getHeight(), pixelBuffer.getFormat(), allocateDirect);
    }
}
