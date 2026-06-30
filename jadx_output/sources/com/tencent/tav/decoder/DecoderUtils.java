package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class DecoderUtils {
    public static final java.lang.String MIME_AUDIO = "audio/";
    public static final java.lang.String MIME_VIDEO = "video/";
    public static final int TIMEOUT_US = 1000;

    public static long getAudioDuration(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i17 = 0; i17 < trackCount; i17++) {
                android.media.MediaFormat trackFormat = assetExtractor.getTrackFormat(i17);
                if (trackFormat.getString("mime").startsWith("audio/") && trackFormat.containsKey("durationUs")) {
                    return trackFormat.getLong("durationUs");
                }
            }
            return 0L;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0L;
        }
    }

    public static long getDuration(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            long j17 = 0;
            long j18 = 0;
            for (int i17 = 0; i17 < trackCount; i17++) {
                android.media.MediaFormat trackFormat = assetExtractor.getTrackFormat(i17);
                java.lang.String string = trackFormat.getString("mime");
                if (string.startsWith("video/")) {
                    if (trackFormat.containsKey("durationUs")) {
                        j17 = trackFormat.getLong("durationUs");
                    }
                } else if (string.startsWith("audio/") && trackFormat.containsKey("durationUs")) {
                    j18 = trackFormat.getLong("durationUs");
                }
            }
            return j17 > 0 ? j17 : j18;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return 0L;
        }
    }

    public static android.media.MediaFormat getFirstFormat(com.tencent.tav.extractor.AssetExtractor assetExtractor, java.lang.String str) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i17 = 0; i17 < trackCount; i17++) {
                android.media.MediaFormat trackFormat = assetExtractor.getTrackFormat(i17);
                if (trackFormat.getString("mime").startsWith(str)) {
                    return trackFormat;
                }
            }
            return null;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return null;
        }
    }

    public static int getFirstTrackIndex(com.tencent.tav.extractor.AssetExtractor assetExtractor, java.lang.String str) {
        try {
            int trackCount = assetExtractor.getTrackCount();
            for (int i17 = 0; i17 < trackCount; i17++) {
                if (assetExtractor.getTrackFormat(i17).getString("mime").startsWith(str)) {
                    return i17;
                }
            }
            return -1;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return -1;
        }
    }

    public static java.nio.ByteBuffer getInputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        return mediaCodecAnalyse.getCodec().getInputBuffer(i17);
    }

    public static com.tencent.tav.decoder.Rectangle getMatrixAndCropRect(com.tencent.tav.coremedia.CGSize cGSize, int i17, float f17, float f18, android.graphics.Point point, android.graphics.Matrix matrix) {
        float f19;
        float f27;
        while (i17 < 0) {
            i17 += 4;
        }
        int i18 = i17 % 4;
        getRotationMatrix(matrix, i18, cGSize.width, cGSize.height);
        com.tencent.tav.coremedia.CGSize transformedSize = getTransformedSize(cGSize, i18, f18);
        if (f18 <= 0.0f && f17 <= 1.0f) {
            return null;
        }
        com.tencent.tav.coremedia.CGSize cGSize2 = new com.tencent.tav.coremedia.CGSize();
        if (i18 % 2 == 1) {
            cGSize2.width = cGSize.height;
            cGSize2.height = cGSize.width;
        } else {
            cGSize2.width = cGSize.width;
            cGSize2.height = cGSize.height;
        }
        float f28 = transformedSize.width;
        float f29 = cGSize2.width;
        if (f28 != f29) {
            f27 = (f29 - f28) * 0.5f;
            f19 = 0.0f;
        } else {
            float f37 = transformedSize.height;
            float f38 = cGSize2.height;
            if (f37 != f38) {
                f19 = (f38 - f37) * 0.5f;
                f27 = 0.0f;
            } else {
                f19 = 0.0f;
                f27 = 0.0f;
            }
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setTranslate(-f27, -f19);
        float f39 = transformedSize.width;
        float f47 = transformedSize.height;
        float f48 = f39 / f17;
        float f49 = f47 / f17;
        float f57 = (f17 - 1.0f) / f17;
        float f58 = (((-f39) * 0.5f) * f57) - point.x;
        float f59 = (((-f47) * 0.5f) * f57) - point.y;
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        matrix3.setTranslate(f58, f59);
        float f66 = f27 - f58;
        float f67 = f19 - f59;
        matrix2.postConcat(matrix3);
        matrix2.postScale(f17, f17);
        android.graphics.Matrix matrix4 = new android.graphics.Matrix();
        matrix.invert(matrix4);
        android.graphics.RectF rectF = new android.graphics.RectF(f66, f67, f48 + f66, f49 + f67);
        matrix4.mapRect(rectF);
        com.tencent.tav.decoder.Rectangle rectangle = new com.tencent.tav.decoder.Rectangle(rectF.left, rectF.top, rectF.width(), rectF.height());
        float f68 = rectangle.f215334x;
        if (f68 < 0.0f) {
            rectangle.width += f68;
            rectangle.f215334x = 0.0f;
        }
        float f69 = rectangle.f215335y;
        if (f69 < 0.0f) {
            rectangle.height += f69;
            rectangle.f215335y = 0.0f;
        }
        float f76 = rectangle.f215334x;
        if (rectangle.width + f76 > cGSize.width) {
            rectangle.width = cGSize2.width - f76;
        }
        float f77 = rectangle.f215335y;
        if (rectangle.height + f77 > cGSize.height) {
            rectangle.height = cGSize2.height - f77;
        }
        matrix.postConcat(matrix2);
        return rectangle;
    }

    public static java.nio.ByteBuffer getOutputBuffer(com.tencent.tav.codec.MediaCodecAnalyse mediaCodecAnalyse, int i17) {
        return mediaCodecAnalyse.getCodec().getOutputBuffer(i17);
    }

    public static android.graphics.Matrix getPreferMatrix(com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.coremedia.CGSize cGSize2, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        getMatrixAndCropRect(cGSize2, i17, 1.0f, 0.0f, new android.graphics.Point(0, 0), matrix);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        com.tencent.tav.coremedia.CGSize transformedSize = getTransformedSize(cGSize2, i17, 0.0f);
        float f17 = transformedSize.width;
        float f18 = cGSize.width;
        float f19 = (f17 * 1.0f) / f18;
        float f27 = transformedSize.height;
        float f28 = cGSize.height;
        if (f19 > (1.0f * f27) / f28) {
            float f29 = f18 / f17;
            matrix2.setScale(f29, f29);
            matrix2.postTranslate(0.0f, java.lang.Math.round((cGSize.height - (transformedSize.height * f29)) * 0.5f));
        } else {
            float f37 = f28 / f27;
            matrix2.setScale(f37, f37);
            matrix2.postTranslate(java.lang.Math.round((cGSize.width - (transformedSize.width * f37)) * 0.5f), 0.0f);
        }
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static void getRotationMatrix(android.graphics.Matrix matrix, int i17, float f17, float f18) {
        float f19;
        float f27;
        float f28;
        int i18 = i17 % 4;
        if (i18 < 0) {
            i18 += 4;
        }
        float f29 = -1.0f;
        if (i18 != 1) {
            if (i18 == 2) {
                f28 = -1.0f;
                f19 = 0.0f;
                f27 = 0.0f;
            } else if (i18 != 3) {
                f29 = 1.0f;
                f28 = 1.0f;
                f19 = 0.0f;
                f17 = 0.0f;
                f18 = 0.0f;
                f27 = 0.0f;
            } else {
                f18 = f17;
                f27 = -1.0f;
                f19 = 1.0f;
                f17 = 0.0f;
                f29 = 0.0f;
            }
            matrix.setValues(new float[]{f29, f19, f17, f27, f28, f18, 0.0f, 0.0f, 1.0f});
        }
        f17 = f18;
        f19 = -1.0f;
        f27 = 1.0f;
        f18 = 0.0f;
        f29 = 0.0f;
        f28 = f29;
        matrix.setValues(new float[]{f29, f19, f17, f27, f28, f18, 0.0f, 0.0f, 1.0f});
    }

    public static com.tencent.tav.coremedia.CGSize getTransformedSize(com.tencent.tav.coremedia.CGSize cGSize, int i17, float f17) {
        com.tencent.tav.coremedia.CGSize m412clone = cGSize.m412clone();
        if (java.lang.Math.abs(i17) % 2 == 1) {
            float f18 = m412clone.width;
            m412clone.width = m412clone.height;
            m412clone.height = f18;
        }
        if (f17 > 0.0f) {
            float f19 = m412clone.width;
            if ((f19 * 1.0f) / m412clone.height > f17) {
                m412clone.width = (int) java.lang.Math.ceil(r2 * f17);
            } else {
                m412clone.height = (int) java.lang.Math.ceil((f19 * 1.0f) / f17);
            }
        }
        return m412clone;
    }

    private static void swap(float[] fArr, int i17, int i18) {
        float f17 = fArr[i17];
        fArr[i17] = fArr[i18];
        fArr[i18] = f17;
    }

    public static float[] to4x4OpenGL2DMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[16];
        if (matrix == null) {
            for (int i17 = 0; i17 < 16; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            float[] fArr2 = new float[9];
            matrix.getValues(fArr2);
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[3];
            fArr[2] = 0.0f;
            fArr[3] = fArr2[6];
            fArr[4] = fArr2[1];
            fArr[5] = fArr2[4];
            fArr[6] = 0.0f;
            fArr[7] = fArr2[7];
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            fArr[12] = fArr2[2];
            fArr[13] = fArr2[5];
            fArr[14] = 0.0f;
            fArr[15] = fArr2[8];
        }
        return fArr;
    }

    public static float[] toOpenGL2DMatrix(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        if (matrix == null) {
            for (int i17 = 0; i17 < 9; i17++) {
                fArr[i17] = i17 % 4 == 0 ? 1.0f : 0.0f;
            }
        } else {
            matrix.getValues(fArr);
            swap(fArr, 1, 3);
            swap(fArr, 2, 6);
            swap(fArr, 5, 7);
        }
        return fArr;
    }

    public static long getAudioDuration(long j17, int i17, int i18) {
        return (j17 * 1000000) / ((i17 * 2) * i18);
    }

    public static long getDuration(java.lang.String str) {
        try {
            com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
            assetExtractor.setDataSource(str);
            long duration = getDuration(assetExtractor);
            try {
                assetExtractor.release();
            } catch (java.lang.Error | java.lang.Exception unused) {
            }
            return duration;
        } catch (java.lang.Error | java.lang.Exception unused2) {
            return 0L;
        }
    }
}
