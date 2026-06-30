package y8;

/* loaded from: classes13.dex */
public abstract class l {

    /* renamed from: d, reason: collision with root package name */
    public static final android.util.SparseIntArray f459821d;

    /* renamed from: e, reason: collision with root package name */
    public static final android.util.SparseIntArray f459822e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f459823f;

    /* renamed from: a, reason: collision with root package name */
    public static final y8.a f459818a = new y8.a("OMX.google.raw.decoder", null, null, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f459819b = java.util.regex.Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f459820c = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static int f459824g = -1;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f459821d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        android.util.SparseIntArray sparseIntArray2 = new android.util.SparseIntArray();
        f459822e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        java.util.HashMap hashMap = new java.util.HashMap();
        f459823f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", java.lang.Integer.valueOf(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", java.lang.Integer.valueOf(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62));
    }

    public static void a(java.util.List list) {
        if (t9.d0.f416498a < 26) {
            if (list.size() <= 1 || !"OMX.MTK.AUDIO.DECODER.RAW".equals(((y8.a) list.get(0)).f459790a)) {
                return;
            }
            for (int i17 = 1; i17 < list.size(); i17++) {
                y8.a aVar = (y8.a) list.get(i17);
                if ("OMX.google.raw.decoder".equals(aVar.f459790a)) {
                    list.remove(i17);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    public static y8.a b(java.lang.String str, boolean z17) {
        java.util.List list;
        synchronized (y8.l.class) {
            y8.g gVar = new y8.g(str, z17);
            java.util.HashMap hashMap = f459820c;
            list = (java.util.List) hashMap.get(gVar);
            if (list == null) {
                int i17 = t9.d0.f416498a;
                java.util.List c17 = c(gVar, i17 >= 21 ? new y8.k(z17) : new y8.j(null));
                if (z17 && ((java.util.ArrayList) c17).isEmpty() && 21 <= i17 && i17 <= 23) {
                    c17 = c(gVar, new y8.j(null));
                    java.util.ArrayList arrayList = (java.util.ArrayList) c17;
                    if (!arrayList.isEmpty()) {
                        java.lang.String str2 = ((y8.a) arrayList.get(0)).f459790a;
                    }
                }
                a(c17);
                list = java.util.Collections.unmodifiableList(c17);
                hashMap.put(gVar, list);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (y8.a) list.get(0);
    }

    public static java.util.List c(y8.g gVar, y8.i iVar) {
        int i17;
        int i18;
        java.lang.String[] strArr;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        y8.g gVar2 = gVar;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str3 = gVar2.f459814a;
            int c17 = iVar.c();
            boolean d17 = iVar.d();
            int i19 = 0;
            while (i19 < c17) {
                android.media.MediaCodecInfo a17 = iVar.a(i19);
                java.lang.String name = a17.getName();
                if (d(a17, name, d17)) {
                    java.lang.String[] supportedTypes = a17.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i27 = 0;
                    while (i27 < length) {
                        java.lang.String str4 = supportedTypes[i27];
                        if (str4.equalsIgnoreCase(str3)) {
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = a17.getCapabilitiesForType(str4);
                                boolean b17 = iVar.b(str3, capabilitiesForType);
                                if (t9.d0.f416498a <= 22) {
                                    java.lang.String str5 = t9.d0.f416501d;
                                    if ((str5.equals("ODROID-XU3") || str5.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                        z17 = true;
                                        boolean z18 = gVar2.f459815b;
                                        if ((d17 || z18 != b17) && (d17 || z18)) {
                                            i17 = i27;
                                            i18 = length;
                                            strArr = supportedTypes;
                                            str = name;
                                            if (!d17 && b17) {
                                                try {
                                                    arrayList.add(new y8.a(str + ".secure", str3, capabilitiesForType, z17, true));
                                                    return arrayList;
                                                } catch (java.lang.Exception e17) {
                                                    e = e17;
                                                    if (t9.d0.f416498a <= 23) {
                                                    }
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            try {
                                                i17 = i27;
                                                i18 = length;
                                                strArr = supportedTypes;
                                                boolean z19 = z17;
                                                str2 = name;
                                                try {
                                                    arrayList.add(new y8.a(name, str3, capabilitiesForType, z19, false));
                                                    str = str2;
                                                } catch (java.lang.Exception e18) {
                                                    e = e18;
                                                    str = str2;
                                                    if (t9.d0.f416498a <= 23 || arrayList.isEmpty()) {
                                                        throw e;
                                                    }
                                                    i27 = i17 + 1;
                                                    name = str;
                                                    length = i18;
                                                    supportedTypes = strArr;
                                                    gVar2 = gVar;
                                                }
                                            } catch (java.lang.Exception e19) {
                                                e = e19;
                                                i17 = i27;
                                                i18 = length;
                                                strArr = supportedTypes;
                                                str2 = name;
                                            }
                                        }
                                    }
                                }
                                z17 = false;
                                boolean z182 = gVar2.f459815b;
                                if (d17) {
                                }
                                i17 = i27;
                                i18 = length;
                                strArr = supportedTypes;
                                str = name;
                                if (!d17) {
                                    arrayList.add(new y8.a(str + ".secure", str3, capabilitiesForType, z17, true));
                                    return arrayList;
                                }
                                continue;
                            } catch (java.lang.Exception e27) {
                                e = e27;
                                i17 = i27;
                                i18 = length;
                                strArr = supportedTypes;
                                str = name;
                            }
                        } else {
                            i17 = i27;
                            i18 = length;
                            strArr = supportedTypes;
                            str = name;
                        }
                        i27 = i17 + 1;
                        name = str;
                        length = i18;
                        supportedTypes = strArr;
                        gVar2 = gVar;
                    }
                }
                i19++;
                gVar2 = gVar;
            }
            return arrayList;
        } catch (java.lang.Exception e28) {
            throw new y8.h(e28, null);
        }
    }

    public static boolean d(android.media.MediaCodecInfo mediaCodecInfo, java.lang.String str, boolean z17) {
        if (mediaCodecInfo.isEncoder() || (!z17 && str.endsWith(".secure"))) {
            return false;
        }
        int i17 = t9.d0.f416498a;
        if (i17 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i17 < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i17 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            java.lang.String str2 = t9.d0.f416499b;
            if ("a70".equals(str2) || ("Xiaomi".equals(t9.d0.f416500c) && str2.startsWith("HM"))) {
                return false;
            }
        }
        if (i17 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            java.lang.String str3 = t9.d0.f416499b;
            if ("dlxu".equals(str3) || "protou".equals(str3) || "ville".equals(str3) || "villeplus".equals(str3) || "villec2".equals(str3) || str3.startsWith("gee") || "C6602".equals(str3) || "C6603".equals(str3) || "C6606".equals(str3) || "C6616".equals(str3) || "L36h".equals(str3) || "SO-02E".equals(str3)) {
                return false;
            }
        }
        if (i17 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            java.lang.String str4 = t9.d0.f416499b;
            if ("C1504".equals(str4) || "C1505".equals(str4) || "C1604".equals(str4) || "C1605".equals(str4)) {
                return false;
            }
        }
        if (i17 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && t9.d0.f416500c.equals("samsung"))) {
            java.lang.String str5 = t9.d0.f416499b;
            if (str5.startsWith("zeroflte") || str5.startsWith("zerolte") || str5.startsWith("zenlte") || str5.equals("SC-05G") || str5.equals("marinelteatt") || str5.equals("404SC") || str5.equals("SC-04G") || str5.equals("SCV31")) {
                return false;
            }
        }
        if (i17 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(t9.d0.f416500c)) {
            java.lang.String str6 = t9.d0.f416499b;
            if (str6.startsWith("d2") || str6.startsWith("serrano") || str6.startsWith("jflte") || str6.startsWith("santos") || str6.startsWith("t0")) {
                return false;
            }
        }
        return (i17 <= 19 && t9.d0.f416499b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) ? false : true;
    }

    public static int e() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i17;
        if (f459824g == -1) {
            int i18 = 0;
            y8.a b17 = b("video/avc", false);
            if (b17 != null) {
                android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = b17.f459795f;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new android.media.MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i19 = 0;
                while (i18 < length) {
                    int i27 = codecProfileLevelArr[i18].level;
                    if (i27 != 1 && i27 != 2) {
                        switch (i27) {
                            case 8:
                            case 16:
                            case 32:
                                i17 = 101376;
                                break;
                            case 64:
                                i17 = 202752;
                                break;
                            case 128:
                            case 256:
                                i17 = 414720;
                                break;
                            case 512:
                                i17 = com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_NET;
                                break;
                            case 1024:
                                i17 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i17 = 2097152;
                                break;
                            case 8192:
                                i17 = 2228224;
                                break;
                            case 16384:
                                i17 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i17 = 9437184;
                                break;
                            default:
                                i17 = -1;
                                break;
                        }
                    } else {
                        i17 = 25344;
                    }
                    i19 = java.lang.Math.max(i17, i19);
                    i18++;
                }
                i18 = java.lang.Math.max(i19, t9.d0.f416498a >= 21 ? 345600 : 172800);
            }
            f459824g = i18;
        }
        return f459824g;
    }
}
