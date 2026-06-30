package ph3;

/* loaded from: classes10.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f354385a = {"OMX.qcom.", "OMX.Exynos.", "OMX.hisi"};

    public static boolean a(java.lang.String str) {
        java.lang.String str2;
        try {
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String[] supportedTypes = codecInfos[i17].getSupportedTypes();
                int i18 = 0;
                while (true) {
                    if (i18 >= supportedTypes.length) {
                        str2 = "";
                        break;
                    }
                    str2 = supportedTypes[i18];
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.contains(str)) {
                        break;
                    }
                    i18++;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    arrayList.add(java.lang.Integer.valueOf(i17));
                }
            }
            return !arrayList.isEmpty();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e17, "isSupportHevc error", new java.lang.Object[0]);
            return false;
        }
    }

    public static java.lang.String b(android.media.MediaCodecInfo mediaCodecInfo) {
        for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.contains("hevc")) {
                return str;
            }
        }
        return "";
    }

    public static java.lang.String c() {
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.System.currentTimeMillis();
            return fp.h.c(21) ? d() : e();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e17, "report hevc info error %s", e17.toString());
            return "";
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", th6, "report hevc info error %s", th6.toString());
            return "";
        }
    }

    public static java.lang.String d() {
        java.util.ArrayList arrayList;
        int i17;
        long j17;
        int i18;
        int i19;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
        int length = codecInfos.length;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i27 = 0;
        for (int i28 = 0; i28 < length; i28++) {
            java.lang.String b17 = b(codecInfos[i28]);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                arrayList2.add(java.lang.Integer.valueOf(i28));
                arrayList3.add(b17);
            }
        }
        if (arrayList2.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        boolean z18 = false;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i57 = 0;
        while (i27 < arrayList2.size()) {
            int intValue = ((java.lang.Integer) arrayList2.get(i27)).intValue();
            java.lang.String str = (java.lang.String) arrayList3.get(i27);
            z19 = codecInfos[intValue].isEncoder();
            boolean z29 = !codecInfos[intValue].isEncoder();
            java.util.ArrayList arrayList4 = arrayList2;
            android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfos[intValue].getCapabilitiesForType(str);
            if (capabilitiesForType != null) {
                android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                if (videoCapabilities != null) {
                    i29 = java.lang.Math.max(videoCapabilities.getBitrateRange().getLower().intValue(), i29);
                    i37 = java.lang.Math.max(videoCapabilities.getBitrateRange().getUpper().intValue(), i37);
                    i38 = java.lang.Math.max(videoCapabilities.getSupportedFrameRates().getLower().intValue(), i38);
                    arrayList = arrayList3;
                    int max = java.lang.Math.max(videoCapabilities.getSupportedFrameRates().getUpper().intValue(), i39);
                    int max2 = java.lang.Math.max(videoCapabilities.getSupportedWidths().getLower().intValue(), i47);
                    i48 = java.lang.Math.max(videoCapabilities.getSupportedWidths().getUpper().intValue(), i48);
                    i49 = java.lang.Math.max(videoCapabilities.getSupportedHeights().getLower().intValue(), i49);
                    i57 = java.lang.Math.max(videoCapabilities.getSupportedHeights().getUpper().intValue(), i57);
                    i17 = max;
                    i19 = max2;
                    j17 = elapsedRealtime;
                } else {
                    arrayList = arrayList3;
                    i17 = i39;
                    i19 = i47;
                    j17 = elapsedRealtime;
                }
                sb6.append(codecInfos[intValue].getName());
                sb6.append("|");
                i18 = i19;
                z27 = true;
            } else {
                arrayList = arrayList3;
                i17 = i39;
                j17 = elapsedRealtime;
                sb7.append(codecInfos[intValue].getName());
                sb7.append("|");
                i18 = i47;
                z28 = true;
            }
            i27++;
            z18 = z29;
            arrayList2 = arrayList4;
            long j18 = j17;
            i47 = i18;
            i39 = i17;
            elapsedRealtime = j18;
            arrayList3 = arrayList;
        }
        int i58 = i39;
        int i59 = i47;
        int i66 = i48;
        long j19 = elapsedRealtime;
        int i67 = i57;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("1,");
        if (z18 && z19) {
            sb8.append("3,");
        } else if (z19) {
            sb8.append("2,");
        } else {
            sb8.append("1,");
        }
        if (z27 && z28) {
            sb8.append("3,");
        } else if (z28) {
            sb8.append("2,");
        } else {
            sb8.append("1,");
        }
        sb8.append(sb6.toString());
        sb8.append(",");
        sb8.append(sb7.toString());
        sb8.append(",");
        sb8.append(i29);
        sb8.append(",");
        sb8.append(i37);
        sb8.append(",");
        sb8.append(i38);
        sb8.append(",");
        sb8.append(i58);
        sb8.append(",");
        sb8.append(i59);
        sb8.append(",");
        sb8.append(i66);
        sb8.append(",");
        sb8.append(i49);
        sb8.append(",");
        sb8.append(i67);
        java.lang.String sb9 = sb8.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecUtil", "high api 21 cost[%d] hevc info %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j19), sb9);
        return sb9;
    }

    public static java.lang.String e() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i17 = 0;
        for (int i18 = 0; i18 < codecCount; i18++) {
            java.lang.String b17 = b(android.media.MediaCodecList.getCodecInfoAt(i18));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(b17);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        boolean z18 = false;
        boolean z19 = false;
        boolean z27 = false;
        boolean z28 = false;
        while (i17 < arrayList.size()) {
            int intValue = ((java.lang.Integer) arrayList.get(i17)).intValue();
            java.lang.String str = (java.lang.String) arrayList2.get(i17);
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(intValue);
            boolean isEncoder = codecInfoAt.isEncoder();
            boolean z29 = !codecInfoAt.isEncoder();
            if (codecInfoAt.getCapabilitiesForType(str) != null) {
                sb6.append(codecInfoAt.getName());
                sb6.append("|");
                z27 = true;
            } else {
                sb7.append(codecInfoAt.getName());
                sb7.append("|");
                z28 = true;
            }
            i17++;
            z19 = isEncoder;
            z18 = z29;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("1,");
        if (z18 && z19) {
            sb8.append("3,");
        } else if (z19) {
            sb8.append("2,");
        } else {
            sb8.append("1,");
        }
        if (z27 && z28) {
            sb8.append("3,");
        } else if (z28) {
            sb8.append("2,");
        } else {
            sb8.append("1,");
        }
        sb8.append(sb6.toString());
        sb8.append(",");
        sb8.append(sb7.toString());
        java.lang.String sb9 = sb8.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecUtil", "below api 21 cost[%d] hevc info %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), sb9);
        return sb9;
    }

    public static boolean f() {
        try {
            if (!fp.h.c(21)) {
                return false;
            }
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < length; i17++) {
                android.media.MediaCodecInfo mediaCodecInfo = codecInfos[i17];
                if (!mediaCodecInfo.isEncoder()) {
                    android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/dolby-vision");
                    java.lang.String str = "";
                    if (capabilitiesForType != null && !capabilitiesForType.isFeatureRequired("secure-playback") && !capabilitiesForType.isFeatureRequired("tunneled-playback")) {
                        java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= supportedTypes.length) {
                                break;
                            }
                            java.lang.String str2 = supportedTypes[i18];
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.contains("dolby")) {
                                str = str2;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        arrayList.add(java.lang.Integer.valueOf(i17));
                        arrayList2.add(str);
                    }
                }
            }
            return !arrayList.isEmpty();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e17, "isSupportHevc error", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean g() {
        try {
            if (!fp.h.c(21)) {
                return false;
            }
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String b17 = b(codecInfos[i17]);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    arrayList2.add(b17);
                }
            }
            return !arrayList.isEmpty();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecUtil", e17, "isSupportHevc error", new java.lang.Object[0]);
            return false;
        }
    }
}
