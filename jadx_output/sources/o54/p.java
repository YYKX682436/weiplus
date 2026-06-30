package o54;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final o54.p f343160a = new o54.p();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f343161b;

    static {
        java.lang.Double valueOf = java.lang.Double.valueOf(2880.0d);
        java.lang.Double valueOf2 = java.lang.Double.valueOf(1080.0d);
        f343161b = kz5.c0.i(new jz5.l(valueOf, valueOf2), new jz5.l(java.lang.Double.valueOf(2160.0d), valueOf2), new jz5.l(java.lang.Double.valueOf(1920.0d), valueOf2), new jz5.l(java.lang.Double.valueOf(1920.0d), java.lang.Double.valueOf(720.0d)), new jz5.l(java.lang.Double.valueOf(1440.0d), java.lang.Double.valueOf(720.0d)), new jz5.l(java.lang.Double.valueOf(1280.0d), java.lang.Double.valueOf(720.0d)), new jz5.l(java.lang.Double.valueOf(1440.0d), java.lang.Double.valueOf(2160.0d)), new jz5.l(java.lang.Double.valueOf(1440.0d), java.lang.Double.valueOf(1620.0d)), new jz5.l(java.lang.Double.valueOf(1440.0d), java.lang.Double.valueOf(1440.0d)), new jz5.l(java.lang.Double.valueOf(960.0d), java.lang.Double.valueOf(1440.0d)), new jz5.l(java.lang.Double.valueOf(960.0d), valueOf2), new jz5.l(java.lang.Double.valueOf(960.0d), java.lang.Double.valueOf(960.0d)));
    }

    public static final void a(o54.p pVar, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.Iterator it;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        pVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        java.util.List b17 = pVar.b(str, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = null;
        if (!(!((java.util.ArrayList) b17).isEmpty())) {
            b17 = null;
        }
        android.media.MediaCodecInfo mediaCodecInfo = b17 != null ? (android.media.MediaCodecInfo) b17.get(0) : null;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities2 = (mediaCodecInfo == null || (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType(str)) == null) ? null : capabilitiesForType2.getVideoCapabilities();
        if (videoCapabilities2 == null) {
            java.util.List b18 = pVar.b(str, false);
            if (!(!((java.util.ArrayList) b18).isEmpty())) {
                b18 = null;
            }
            mediaCodecInfo = b18 != null ? (android.media.MediaCodecInfo) b18.get(0) : null;
            if (mediaCodecInfo != null && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str)) != null) {
                videoCapabilities = capabilitiesForType.getVideoCapabilities();
            }
            videoCapabilities2 = videoCapabilities;
        }
        if (videoCapabilities2 == null) {
            ca4.e0.a("report_video_capability_in_landing_page", str, 3, 0, "error in get codec!");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (mediaCodecInfo == null || (str2 = mediaCodecInfo.getName()) == null) {
                str2 = "null";
            }
            sb6.append(str2.concat("|"));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            o54.p pVar2 = f343160a;
            android.util.Range<java.lang.Integer> supportedWidths = videoCapabilities2.getSupportedWidths();
            kotlin.jvm.internal.o.f(supportedWidths, "getSupportedWidths(...)");
            sb7.append(pVar2.d(supportedWidths));
            sb7.append('|');
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            android.util.Range<java.lang.Integer> supportedHeights = videoCapabilities2.getSupportedHeights();
            kotlin.jvm.internal.o.f(supportedHeights, "getSupportedHeights(...)");
            sb8.append(pVar2.d(supportedHeights));
            sb8.append('|');
            sb6.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            android.util.Range<java.lang.Integer> supportedFrameRates = videoCapabilities2.getSupportedFrameRates();
            kotlin.jvm.internal.o.f(supportedFrameRates, "getSupportedFrameRates(...)");
            sb9.append(pVar2.d(supportedFrameRates));
            sb9.append('|');
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            android.util.Range<java.lang.Integer> bitrateRange = videoCapabilities2.getBitrateRange();
            kotlin.jvm.internal.o.f(bitrateRange, "getBitrateRange(...)");
            sb10.append(pVar2.d(bitrateRange));
            sb10.append('|');
            sb6.append(sb10.toString());
            java.lang.String str4 = "";
            ca4.e0.a("report_video_capability_in_landing_page", str, 2, 0, "" + ((java.lang.Object) sb6));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPairs", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            java.util.Iterator it6 = f343161b.iterator();
            while (it6.hasNext()) {
                jz5.l lVar = (jz5.l) it6.next();
                double doubleValue = ((java.lang.Number) lVar.f302833d).doubleValue();
                double doubleValue2 = ((java.lang.Number) lVar.f302834e).doubleValue();
                int i17 = (int) doubleValue;
                int i18 = (int) doubleValue2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                boolean isSizeSupported = videoCapabilities2.isSizeSupported(i17, i18);
                java.lang.String str5 = "0";
                if (isSizeSupported) {
                    java.lang.StringBuilder sb12 = new java.lang.StringBuilder(str4);
                    str3 = str4;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                    try {
                        it = it6;
                    } catch (java.lang.Throwable unused) {
                        it = it6;
                    }
                    try {
                        java.lang.String valueOf = java.lang.String.valueOf((int) videoCapabilities2.getSupportedFrameRatesFor(i17, i18).getUpper().doubleValue());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        str5 = valueOf;
                    } catch (java.lang.Throwable unused2) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSupportedFrameRatesForNoError", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        sb12.append(str5);
                        str5 = sb12.toString();
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(isSizeSupported ? 1 : 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        sb11.append(valueOf2.intValue() + '|' + str5 + '|');
                        str4 = str3;
                        it6 = it;
                    }
                    sb12.append(str5);
                    str5 = sb12.toString();
                } else {
                    str3 = str4;
                    it = it6;
                }
                java.lang.Integer valueOf22 = java.lang.Integer.valueOf(isSizeSupported ? 1 : 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOnePair", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                sb11.append(valueOf22.intValue() + '|' + str5 + '|');
                str4 = str3;
                it6 = it;
            }
            java.lang.String sb13 = sb11.toString();
            kotlin.jvm.internal.o.f(sb13, "toString(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPairs", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            ca4.e0.a("report_video_capability_in_landing_page", str, 1, 0, sb13);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportVideoCap", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
    }

    public final java.util.List b(java.lang.String str, boolean z17) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decoderCodecInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        int codecCount = android.media.MediaCodecList.getCodecCount();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < codecCount; i17++) {
            android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i17);
            if (!codecInfoAt.isEncoder()) {
                if (z17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                    java.lang.String name = codecInfoAt.getName();
                    if (name == null) {
                        name = "";
                    }
                    if (r26.i0.y(name, "OMX.google.", false) || r26.i0.y(name, "c2.android.", false)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        z18 = true;
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSoftwareDecoder", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                        z18 = false;
                    }
                    if (z18) {
                    }
                }
                java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                kotlin.jvm.internal.o.d(supportedTypes);
                int length = supportedTypes.length;
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b(supportedTypes[i18], str)) {
                        arrayList.add(codecInfoAt);
                        break;
                    }
                    i18++;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decoderCodecInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        return arrayList;
    }

    public final boolean c(int i17, int i18) {
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType;
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            java.util.List b17 = b("video/avc", true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decoderCodecInfo$default", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = null;
            if (!(!((java.util.ArrayList) b17).isEmpty())) {
                b17 = null;
            }
            android.media.MediaCodecInfo mediaCodecInfo = b17 != null ? (android.media.MediaCodecInfo) b17.get(0) : null;
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities2 = (mediaCodecInfo == null || (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType("video/avc")) == null) ? null : capabilitiesForType2.getVideoCapabilities();
            if (videoCapabilities2 == null) {
                java.util.List b18 = b("video/avc", false);
                if (!(true ^ ((java.util.ArrayList) b18).isEmpty())) {
                    b18 = null;
                }
                android.media.MediaCodecInfo mediaCodecInfo2 = b18 != null ? (android.media.MediaCodecInfo) b18.get(0) : null;
                if (mediaCodecInfo2 != null && (capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType("video/avc")) != null) {
                    videoCapabilities = capabilitiesForType.getVideoCapabilities();
                }
                if (videoCapabilities != null && mediaCodecInfo2 != null) {
                    mediaCodecInfo2.getName();
                }
                videoCapabilities2 = videoCapabilities;
            }
            if (videoCapabilities2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
                return false;
            }
            boolean isSizeSupported = videoCapabilities2.isSizeSupported(i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            return isSizeSupported;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
            return false;
        }
    }

    public final java.lang.String d(android.util.Range range) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toReportString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        java.lang.String str = "" + range.getLower() + '_' + range.getUpper();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toReportString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.VideoCapabilityUtils");
        return str;
    }
}
