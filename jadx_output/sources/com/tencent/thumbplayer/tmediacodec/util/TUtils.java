package com.tencent.thumbplayer.tmediacodec.util;

/* loaded from: classes14.dex */
public final class TUtils {
    public static final java.lang.String CSD_0 = "csd-0";
    public static final java.lang.String CSD_1 = "csd-1";
    public static final java.lang.String CSD_2 = "csd-2";
    public static final java.lang.String[] CSD_INDEX_ARRAY = {CSD_0, CSD_1, CSD_2};
    public static final java.lang.String TAG = "TUtils";
    private static final java.util.Set<java.lang.String> sBlackDevices;
    private static boolean sDeviceNeedsSetOutputSurfaceWorkaround;
    private static boolean sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        sBlackDevices = hashSet;
        hashSet.add("1601");
        hashSet.add("1713");
        hashSet.add("1714");
        hashSet.add("A10-70F");
        hashSet.add("A10-70L");
        hashSet.add("A1601");
        hashSet.add("A2016a40");
        hashSet.add("A7000-a");
        hashSet.add("A7000plus");
        hashSet.add("A7010a48");
        hashSet.add("A7020a48");
        hashSet.add("AquaPowerM");
        hashSet.add("ASUS_X00AD_2");
        hashSet.add("Aura_Note_2");
        hashSet.add("BLACK-1X");
        hashSet.add("BRAVIA_ATV2");
        hashSet.add("BRAVIA_ATV3_4K");
        hashSet.add("C1");
        hashSet.add("ComioS1");
        hashSet.add("CP8676_I02");
        hashSet.add("CPH1609");
        hashSet.add("CPY83_I00");
        hashSet.add("cv1");
        hashSet.add("cv3");
        hashSet.add("deb");
        hashSet.add("E5643");
        hashSet.add("ELUGA_A3_Pro");
        hashSet.add("ELUGA_Note");
        hashSet.add("ELUGA_Prim");
        hashSet.add("ELUGA_Ray_X");
        hashSet.add("EverStar_S");
        hashSet.add("F3111");
        hashSet.add("F3113");
        hashSet.add("F3116");
        hashSet.add("F3211");
        hashSet.add("F3213");
        hashSet.add("F3215");
        hashSet.add("F3311");
        hashSet.add("flo");
        hashSet.add("fugu");
        hashSet.add("GiONEE_CBL7513");
        hashSet.add("GiONEE_GBL7319");
        hashSet.add("GIONEE_GBL7360");
        hashSet.add("GIONEE_SWW1609");
        hashSet.add("GIONEE_SWW1627");
        hashSet.add("GIONEE_SWW1631");
        hashSet.add("GIONEE_WBL5708");
        hashSet.add("GIONEE_WBL7365");
        hashSet.add("GIONEE_WBL7519");
        hashSet.add("griffin");
        hashSet.add("htc_e56ml_dtul");
        hashSet.add("hwALE-H");
        hashSet.add("HWBLN-H");
        hashSet.add("HWCAM-H");
        hashSet.add("HWVNS-H");
        hashSet.add("HWWAS-H");
        hashSet.add("i9031");
        hashSet.add("iball8735_9806");
        hashSet.add("Infinix-X572");
        hashSet.add("iris60");
        hashSet.add("itel_S41");
        hashSet.add("j2xlteins");
        hashSet.add("JGZ");
        hashSet.add("K50a40");
        hashSet.add("kate");
        hashSet.add("l5460");
        hashSet.add("le_x6");
        hashSet.add("LS-5017");
        hashSet.add("M5c");
        hashSet.add("manning");
        hashSet.add("marino_f");
        hashSet.add("MEIZU_M5");
        hashSet.add("mh");
        hashSet.add("mido");
        hashSet.add("c");
        hashSet.add("namath");
        hashSet.add("nicklaus_f");
        hashSet.add("NX541J");
        hashSet.add("NX573J");
        hashSet.add("OnePlus5T");
        hashSet.add("p212");
        hashSet.add("P681");
        hashSet.add("P85");
        hashSet.add("panell_d");
        hashSet.add("panell_dl");
        hashSet.add("panell_ds");
        hashSet.add("panell_dt");
        hashSet.add("PB2-670M");
        hashSet.add("PGN528");
        hashSet.add("PGN610");
        hashSet.add("PGN611");
        hashSet.add("Phantom6");
        hashSet.add("Pixi4-7_3G");
        hashSet.add("Pixi5-10_4G");
        hashSet.add("PLE");
        hashSet.add("PRO7S");
        hashSet.add("Q350");
        hashSet.add("Q4260");
        hashSet.add("Q427");
        hashSet.add("Q4310");
        hashSet.add("Q5");
        hashSet.add("QM16XE_U");
        hashSet.add("QX1");
        hashSet.add("santoni");
        hashSet.add("Slate_Pro");
        hashSet.add("SVP-DTV15");
        hashSet.add("s905x018");
        hashSet.add("taido_row");
        hashSet.add("TB3-730F");
        hashSet.add("TB3-730X");
        hashSet.add("TB3-850F");
        hashSet.add("TB3-850M");
        hashSet.add("tcl_eu");
        hashSet.add("V1");
        hashSet.add("V23GB");
        hashSet.add("V5");
        hashSet.add("vernee_M5");
        hashSet.add("watson");
        hashSet.add("whyred");
        hashSet.add("woods_f");
        hashSet.add("woods_fn");
        hashSet.add("X3_HK");
        hashSet.add("XE2X");
        hashSet.add("XT1663");
        hashSet.add("Z12_PRO");
        hashSet.add("Z80");
    }

    public static int ceilDivide(int i17, int i18) {
        return ((i17 + i18) - 1) / i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean codecNeedsSetOutputSurfaceWorkaround() {
        /*
            java.lang.String r0 = "deviceNeedsSetOutputSurfaceWorkaround:"
            java.lang.Class<com.tencent.thumbplayer.tmediacodec.util.TUtils> r1 = com.tencent.thumbplayer.tmediacodec.util.TUtils.class
            monitor-enter(r1)
            boolean r2 = com.tencent.thumbplayer.tmediacodec.util.TUtils.sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch: java.lang.Throwable -> L96
            if (r2 != 0) goto L92
            java.lang.String r2 = "dangal"
            java.lang.String r3 = android.os.Build.DEVICE     // Catch: java.lang.Throwable -> L96
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L96
            r4 = 1
            if (r2 == 0) goto L18
            com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch: java.lang.Throwable -> L96
            goto L77
        L18:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L96
            r5 = 27
            if (r2 > r5) goto L29
            java.lang.String r6 = "HWEML"
            boolean r6 = r6.equals(r3)     // Catch: java.lang.Throwable -> L96
            if (r6 == 0) goto L29
            com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch: java.lang.Throwable -> L96
            goto L77
        L29:
            if (r2 < r5) goto L2c
            goto L77
        L2c:
            java.util.Set<java.lang.String> r2 = com.tencent.thumbplayer.tmediacodec.util.TUtils.sBlackDevices     // Catch: java.lang.Throwable -> L96
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L36
            com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch: java.lang.Throwable -> L96
        L36:
            java.lang.String r2 = com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()     // Catch: java.lang.Throwable -> L96
            int r3 = r2.hashCode()     // Catch: java.lang.Throwable -> L96
            r5 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            r6 = 2
            if (r3 == r5) goto L63
            r5 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r3 == r5) goto L59
            r5 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r3 == r5) goto L4f
            goto L6d
        L4f:
            java.lang.String r3 = "AFTN"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L6d
            r2 = r4
            goto L6e
        L59:
            java.lang.String r3 = "AFTA"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L6d
            r2 = 0
            goto L6e
        L63:
            java.lang.String r3 = "JSN-L21"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L6d
            r2 = r6
            goto L6e
        L6d:
            r2 = -1
        L6e:
            if (r2 == 0) goto L75
            if (r2 == r4) goto L75
            if (r2 == r6) goto L75
            goto L77
        L75:
            com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch: java.lang.Throwable -> L96
        L77:
            boolean r2 = com.tencent.thumbplayer.tmediacodec.util.LogUtils.isLogEnable()     // Catch: java.lang.Throwable -> L96
            if (r2 == 0) goto L90
            java.lang.String r2 = "TUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L96
            boolean r0 = com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround     // Catch: java.lang.Throwable -> L96
            r3.append(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L96
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(r2, r0)     // Catch: java.lang.Throwable -> L96
        L90:
            com.tencent.thumbplayer.tmediacodec.util.TUtils.sEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = r4     // Catch: java.lang.Throwable -> L96
        L92:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            boolean r0 = com.tencent.thumbplayer.tmediacodec.util.TUtils.sDeviceNeedsSetOutputSurfaceWorkaround
            return r0
        L96:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L96
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tmediacodec.util.TUtils.codecNeedsSetOutputSurfaceWorkaround():boolean");
    }

    public static java.lang.String getCodeName(android.media.MediaCodec mediaCodec) {
        return mediaCodec.getName();
    }

    public static int getCodecMaxInputSize(java.lang.String str, int i17, int i18) {
        return getCodecMaxInputSize(str, i17, i18, false);
    }

    public static java.util.ArrayList<byte[]> getCsdBuffers(android.media.MediaFormat mediaFormat) {
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList<>();
        int i17 = 0;
        while (true) {
            java.lang.String[] strArr = CSD_INDEX_ARRAY;
            if (i17 >= strArr.length) {
                return arrayList;
            }
            java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer(strArr[i17]);
            if (byteBuffer != null) {
                arrayList.add(byteBuffer.array());
            }
            i17++;
        }
    }

    public static int getMaxInputSize(com.tencent.thumbplayer.tmediacodec.codec.ReuseCodecWrapper reuseCodecWrapper, com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper) {
        if (formatWrapper.maxInputSize == -1) {
            return getCodecMaxInputSize(formatWrapper.sampleMimeType, formatWrapper.width, formatWrapper.height, reuseCodecWrapper.mSecure);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < formatWrapper.initializationData.size(); i18++) {
            i17 += formatWrapper.initializationData.get(i18).length;
        }
        return formatWrapper.maxInputSize + i17;
    }

    public static java.lang.String getSurfaceTextureName(android.view.Surface surface) {
        try {
            java.lang.reflect.Field field = com.tencent.thumbplayer.tmediacodec.util.ReflectUtils.getField(android.view.Surface.class, "mName");
            field.setAccessible(true);
            return java.lang.String.valueOf(field.get(surface));
        } catch (java.lang.Throwable th6) {
            com.tencent.thumbplayer.tmediacodec.util.LogUtils.e(TAG, "getSurfaceTextureName failed", th6);
            return "";
        }
    }

    public static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return isAdaptiveV19(codecCapabilities);
    }

    private static boolean isAdaptiveV19(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return isSecureV21(codecCapabilities);
    }

    private static boolean isSecureV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean isVideo(java.lang.String str) {
        return str.contains("video");
    }

    public static void setCsdBuffers(android.media.MediaFormat mediaFormat, java.util.List list) {
        for (int i17 = 0; i17 < list.size(); i17++) {
            mediaFormat.setByteBuffer("csd-" + i17, java.nio.ByteBuffer.wrap((byte[]) list.get(i17)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0057. Please report as an issue. */
    public static int getCodecMaxInputSize(java.lang.String str, int i17, int i18, boolean z17) {
        char c17;
        int i19;
        if (i17 == -1 || i18 == -1) {
            return -1;
        }
        str.getClass();
        int i27 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_H263)) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case 1187890754:
                if (str.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4V)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
            case 2:
            case 4:
                i19 = i17 * i18;
                i27 = 2;
                return (i19 * 3) / (i27 * 2);
            case 1:
            case 5:
                i19 = i17 * i18;
                return (i19 * 3) / (i27 * 2);
            case 3:
                if ("BRAVIA 4K 2015".equals(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) || ("Amazon".equals(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceManufacturer()) && ("KFSOWI".equals(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) || ("AFTS".equals(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) && z17)))) {
                    return -1;
                }
                i19 = ceilDivide(i17, 16) * ceilDivide(i18, 16) * 16 * 16;
                i27 = 2;
                return (i19 * 3) / (i27 * 2);
            default:
                return -1;
        }
    }

    public static boolean isVideo(android.media.MediaFormat mediaFormat) {
        return isVideo(mediaFormat.getString("mime"));
    }
}
