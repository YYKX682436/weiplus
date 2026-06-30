package com.tencent.tav.decoder;

/* loaded from: classes10.dex */
public class CodecHelper {
    public static int HARD_CODE_PARALLEL_COUNT = -1;
    public static final int MAX_BIT_RATE = 8000000;
    private static final java.lang.String TAG = "CodecHelper";

    public static boolean checkAudioOutSupported(int i17, int i18, int i19, java.lang.String str) {
        boolean z17;
        java.util.List<android.media.MediaCodecInfo> encoderCodecInfo = encoderCodecInfo(str);
        if (encoderCodecInfo.size() > 0) {
            java.util.Iterator<android.media.MediaCodecInfo> it = encoderCodecInfo.iterator();
            while (it.hasNext()) {
                android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = it.next().getCapabilitiesForType(str).getAudioCapabilities();
                boolean contains = audioCapabilities.getBitrateRange().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i17));
                boolean z18 = audioCapabilities.getMaxInputChannelCount() >= i18;
                android.util.Range<java.lang.Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
                int length = supportedSampleRateRanges.length;
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        z17 = false;
                        break;
                    }
                    if (supportedSampleRateRanges[i27].contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i19))) {
                        z17 = true;
                        break;
                    }
                    i27++;
                }
                if (contains && z18 && z17) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkVideoOutSupported(int i17, int i18, int i19, int i27, java.lang.String str) {
        java.util.List<android.media.MediaCodecInfo> encoderCodecInfo = encoderCodecInfo(str);
        if (encoderCodecInfo.size() <= 0) {
            return false;
        }
        java.util.Iterator<android.media.MediaCodecInfo> it = encoderCodecInfo.iterator();
        while (it.hasNext()) {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = it.next().getCapabilitiesForType(str).getVideoCapabilities();
            boolean contains = videoCapabilities.getBitrateRange().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i27));
            boolean contains2 = videoCapabilities.getSupportedFrameRates().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(i19));
            boolean isSizeSupported = videoCapabilities.isSizeSupported(i17, i18);
            if (contains && contains2 && isSizeSupported) {
                return true;
            }
        }
        return false;
    }

    public static int clampHeight(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        return mediaCodecInfo == null ? i17 : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedHeights().clamp(java.lang.Integer.valueOf(i17)).intValue();
    }

    public static int clampWidth(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17) {
        return mediaCodecInfo == null ? i17 : mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getSupportedWidths().clamp(java.lang.Integer.valueOf(i17)).intValue();
    }

    public static com.tencent.tav.coremedia.CGSize correctSupportSize(com.tencent.tav.coremedia.CGSize cGSize, java.lang.String str) {
        int i17 = (int) cGSize.width;
        int i18 = (int) cGSize.height;
        int codecCount = android.media.MediaCodecList.getCodecCount();
        android.media.MediaCodecInfo mediaCodecInfo = null;
        for (int i19 = 0; i19 < codecCount && mediaCodecInfo == null; i19++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i19);
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                boolean z17 = false;
                for (int i27 = 0; i27 < supportedTypes.length && !z17; i27++) {
                    if (supportedTypes[i27].equals(str)) {
                        z17 = true;
                    }
                }
                if (z17) {
                    mediaCodecInfo = codecInfoAt;
                }
            }
        }
        int widthAlignment = getWidthAlignment(mediaCodecInfo, str);
        int heightAlignment = getHeightAlignment(mediaCodecInfo, str);
        float f17 = i17;
        int ceil = (int) (java.lang.Math.ceil((f17 * 1.0f) / widthAlignment) * widthAlignment);
        float f18 = i18;
        int ceil2 = (int) (java.lang.Math.ceil((f18 * 1.0f) / heightAlignment) * heightAlignment);
        java.lang.String str2 = TAG;
        com.tencent.tav.decoder.logger.Logger.d(str2, "correctSupportSize 1: target = [" + ceil + ", " + ceil2 + "]");
        int clampWidth = clampWidth(mediaCodecInfo, str, i17);
        if (ceil != clampWidth) {
            ceil2 = (int) (ceil2 * ((clampWidth * 1.0f) / ceil));
            ceil = clampWidth;
        }
        com.tencent.tav.decoder.logger.Logger.d(str2, "correctSupportSize 2: target = [" + ceil + ", " + ceil2 + "]");
        int clampHeight = clampHeight(mediaCodecInfo, str, i18);
        if (ceil2 != clampHeight) {
            ceil = (int) (ceil * ((clampHeight * 1.0f) / ceil2));
            ceil2 = clampHeight;
        }
        com.tencent.tav.decoder.logger.Logger.d(str2, "correctSupportSize 3: target = [" + ceil + ", " + ceil2 + "]");
        if (!isSupported(mediaCodecInfo, str, ceil, ceil2)) {
            ceil = (int) (java.lang.Math.ceil(f17 / 16.0f) * 16.0d);
            ceil2 = (int) (java.lang.Math.ceil(f18 / 16.0f) * 16.0d);
        }
        com.tencent.tav.decoder.logger.Logger.i(str2, "correctSupportSize return: target = [" + ceil + ", " + ceil2 + "]");
        return new com.tencent.tav.coremedia.CGSize(ceil, ceil2);
    }

    private static java.util.List<android.media.MediaCodecInfo> decoderCodecInfo(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (!codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (supportedTypes[i18].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    }
                    i18++;
                }
            }
        }
        return arrayList;
    }

    public static java.util.List<android.media.MediaCodecInfo> encoderCodecInfo(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (supportedTypes[i18].equals(str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    }
                    i18++;
                }
            }
        }
        return arrayList;
    }

    private static int getHeightAlignment(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getHeightAlignment();
        }
        return 16;
    }

    public static int getSupportMaxParallelCount(java.lang.String str) {
        int i17 = HARD_CODE_PARALLEL_COUNT;
        if (i17 >= 0) {
            com.tencent.tav.decoder.logger.Logger.i(TAG, "hardcode parallel count %d", java.lang.Integer.valueOf(i17));
            return HARD_CODE_PARALLEL_COUNT;
        }
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        assetExtractor.setDataSource(str);
        int firstTrackIndex = com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(assetExtractor, "video/");
        if (firstTrackIndex < 0) {
            return 0;
        }
        assetExtractor.selectTrack(firstTrackIndex);
        android.media.MediaFormat trackFormat = assetExtractor.getTrackFormat(firstTrackIndex);
        int integer = trackFormat.containsKey("width") ? trackFormat.getInteger("width") : 0;
        int integer2 = trackFormat.containsKey("height") ? trackFormat.getInteger("height") : 0;
        int integer3 = trackFormat.containsKey("frame-rate") ? trackFormat.getInteger("frame-rate") : 30;
        long integer4 = trackFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) ? trackFormat.getInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) : 0L;
        java.lang.String string = trackFormat.getString("mime");
        assetExtractor.dispose();
        return getSupportMaxParallelCount(integer, integer2, integer3, integer4, string);
    }

    private static int getWidthAlignment(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str) {
        if (mediaCodecInfo != null) {
            return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getWidthAlignment();
        }
        return 16;
    }

    private static boolean isSupported(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, int i17, int i18) {
        return mediaCodecInfo != null && mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i17, i18);
    }

    public static android.media.MediaCodecInfo selectCodec(java.lang.String str) {
        int codecCount = android.media.MediaCodecList.getCodecCount();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (codecInfoAt.isEncoder()) {
                for (java.lang.String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    public static void selectProfileAndLevel(android.media.MediaFormat mediaFormat) {
        selectProfileAndLevel(mediaFormat, false);
    }

    public static void selectProfileAndLevel(android.media.MediaFormat mediaFormat, boolean z17) {
        int i17;
        int i18;
        android.media.MediaCodecInfo selectCodec = selectCodec("video/avc");
        if (selectCodec != null) {
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = selectCodec.getCapabilitiesForType("video/avc");
            int i19 = -1;
            if (capabilitiesForType.profileLevels != null) {
                int i27 = 0;
                i17 = -1;
                while (true) {
                    android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    if (i27 >= codecProfileLevelArr.length) {
                        break;
                    }
                    android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i27];
                    int i28 = codecProfileLevel.profile;
                    if (i28 <= 8) {
                        if (i28 > i19) {
                            i17 = codecProfileLevel.level;
                            i19 = i28;
                        } else if (i28 == i19 && (i18 = codecProfileLevel.level) > i17) {
                            i17 = i18;
                        }
                    }
                    i27++;
                }
            } else {
                i17 = -1;
            }
            if (i19 == 8) {
                if (z17 && i17 >= 65536) {
                    i17 = 65536;
                }
                mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, i19);
                mediaFormat.setInteger(ya.b.LEVEL, i17);
                com.tencent.tav.decoder.logger.Logger.i(TAG, java.lang.String.format("selectProfileAndLevel: 0x%x, 0x%x", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17)));
            }
        }
    }

    public static int getSupportMaxParallelCount(int i17, int i18, int i19, long j17, java.lang.String str) {
        java.lang.String str2 = TAG;
        com.tencent.tav.decoder.logger.Logger.i(str2, "getSupportMaxParallelCount print width:%d height:%d frameRate:%d bitRate:%d bitRate:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), str);
        int i27 = HARD_CODE_PARALLEL_COUNT;
        if (i27 >= 0) {
            com.tencent.tav.decoder.logger.Logger.i(str2, "hardcode parallel count %d", java.lang.Integer.valueOf(i27));
            return HARD_CODE_PARALLEL_COUNT;
        }
        android.media.MediaCodecInfo selectCodec = selectCodec(str);
        if (selectCodec == null) {
            com.tencent.tav.decoder.logger.Logger.e(str2, "CodecHelper.selectCodec null");
            return 0;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = selectCodec.getCapabilitiesForType(str).getVideoCapabilities();
        android.util.Range<java.lang.Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        android.util.Range<java.lang.Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedWidths != null && supportedHeights != null) {
            com.tencent.tav.decoder.logger.Logger.i(str2, "getSupportMaxParallelCount widthRange:%s heightRange:%s", supportedWidths, supportedHeights);
            if (!videoCapabilities.isSizeSupported(i17, i18)) {
                com.tencent.tav.decoder.logger.Logger.e(str2, "isSizeSupported false1");
                i17 += (videoCapabilities.getWidthAlignment() + i17) % videoCapabilities.getWidthAlignment();
                i18 += (videoCapabilities.getHeightAlignment() + i18) % videoCapabilities.getHeightAlignment();
            }
            if (!videoCapabilities.isSizeSupported(i17, i18)) {
                com.tencent.tav.decoder.logger.Logger.e(str2, "isSizeSupported false2");
                return -1;
            }
            android.util.Range<java.lang.Double> supportedFrameRatesFor = videoCapabilities.getSupportedFrameRatesFor(i17, i18);
            com.tencent.tav.decoder.logger.Logger.i(str2, "getSupportMaxParallelCount frameRange:%s", supportedFrameRatesFor);
            int doubleValue = i19 > 0 ? (int) (supportedFrameRatesFor.getUpper().doubleValue() / i19) : 0;
            com.tencent.tav.decoder.logger.Logger.i(str2, "getSupportMaxParallelCount BitrateRange:%s", videoCapabilities.getBitrateRange());
            com.tencent.tav.decoder.logger.Logger.i(str2, "getSupportMaxParallelCount frameMaxCount:%d bitrateMaxCount:%d", java.lang.Integer.valueOf(doubleValue), java.lang.Integer.valueOf(j17 <= 0 ? doubleValue : (int) (r6.getUpper().intValue() / j17)));
            return doubleValue / 2;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(supportedWidths == null);
        objArr[1] = java.lang.Boolean.valueOf(supportedHeights == null);
        com.tencent.tav.decoder.logger.Logger.e(str2, "getSupportMaxParallelCount size range error.width null[%b] height null[%b]", objArr);
        return 1;
    }
}
