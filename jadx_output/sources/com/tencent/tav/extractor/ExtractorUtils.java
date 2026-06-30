package com.tencent.tav.extractor;

/* loaded from: classes14.dex */
public class ExtractorUtils {
    public static final java.lang.String MIME_AUDIO = "audio/";
    public static final java.lang.String MIME_VIDEO = "video/";

    public static void applyMirror(android.graphics.Matrix matrix, int i17, int i18, int i19) {
        if (matrix == null) {
            return;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (i17 == 1) {
            matrix2.postScale(-1.0f, 1.0f);
            matrix2.postTranslate(i18, 0.0f);
        } else if (i17 == 2) {
            matrix2.postScale(1.0f, -1.0f);
            matrix2.postTranslate(0.0f, i19);
        } else if (i17 == 3) {
            matrix2.postScale(-1.0f, -1.0f);
            matrix2.postTranslate(i18, i19);
        }
        matrix.postConcat(matrix2);
    }

    public static int getFrameRate(android.media.MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return 0;
        }
        try {
            if (mediaFormat.containsKey("frame-rate")) {
                return mediaFormat.getInteger("frame-rate");
            }
            return 0;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0;
        }
    }

    public static int getPreferRotation(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        try {
            android.media.MediaFormat firstFormat = com.tencent.tav.decoder.DecoderUtils.getFirstFormat(assetExtractor, "video/");
            if (firstFormat == null || !firstFormat.containsKey("rotation-degrees")) {
                return 0;
            }
            return firstFormat.getInteger("rotation-degrees") / 90;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0;
        }
    }

    public static com.tencent.tav.coremedia.CGSize getVideoSize(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        try {
            android.media.MediaFormat firstFormat = com.tencent.tav.decoder.DecoderUtils.getFirstFormat(assetExtractor, "video/");
            com.tencent.tav.coremedia.CGSize cGSize = new com.tencent.tav.coremedia.CGSize();
            if (firstFormat != null) {
                if (firstFormat.containsKey("display-width")) {
                    cGSize.width = firstFormat.getInteger("display-width");
                } else {
                    cGSize.width = firstFormat.getInteger("width");
                }
                if (firstFormat.containsKey("display-height")) {
                    cGSize.height = firstFormat.getInteger("display-height");
                } else {
                    cGSize.height = firstFormat.getInteger("height");
                }
            }
            return cGSize;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return new com.tencent.tav.coremedia.CGSize();
        }
    }

    public static boolean isSameExtractor(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack2) {
        java.lang.String str;
        return (decoderAssetTrack != null && decoderAssetTrack2 != null) && (str = decoderAssetTrack.assetPath) != null && str.equals(decoderAssetTrack2.assetPath);
    }
}
