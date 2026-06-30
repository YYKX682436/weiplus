package p05;

/* loaded from: classes5.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.r3 f350674a = new p05.r3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f350675b = kz5.c0.i("MODEL_FACE_ALIGNMENT", "MODEL_FACE_DETECT", "MODEL_FACE_OCCULASIONSEG", "MODEL_FACE_OCCULASIONSEG_TINY", "MODEL_HAND", "MODEL_PORTRAITSEGMENT", "MODEL_PORTRAITSEGMENT_MINI", "MODEL_FACE3D_XBIN", "MODEL_LUA_SCRIPT", "MODEL_BODY_POSE", "MODEL_SKINSEGMENT", "MODEL_HAIRSEGMENT");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f350676c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedHashMap f350677d;

    static {
        kz5.c0.i("MODEL_FACE_ALIGNMENT", "MODEL_FACE_DETECT", "MODEL_FACE_OCCULASIONSEG", "MODEL_PORTRAITSEGMENT", "MODEL_FACE3D_XBIN", "MODEL_FACE3D_PARAMS", "MODEL_LUA_SCRIPT");
        java.util.Map k17 = kz5.c1.k(new jz5.l("MODEL_FACE_ALIGNMENT", 113), new jz5.l("MODEL_FACE_DETECT", 114), new jz5.l("MODEL_HAND", 115), new jz5.l("MODEL_FACE_OCCULASIONSEG", 116), new jz5.l("MODEL_PORTRAITSEGMENT", 117), new jz5.l("MODEL_FACE3D_XBIN", 118), new jz5.l("MODEL_FACE3D_PARAMS", 119), new jz5.l("MODEL_FACE_FEATURE", 120), new jz5.l("MODEL_CHAT_CLS_MODEL", 121), new jz5.l("MODEL_CHAT_CLS_MAP", 122), new jz5.l("MODEL_OCR_DET", 123), new jz5.l("MODEL_OCR_CODECLS", 171), new jz5.l("MODEL_OCR_REC_MODEL", 124), new jz5.l("MODEL_OCR_REC_MAP", 125), new jz5.l("MODEL_CERT_DET", 183), new jz5.l("MODEL_VIDEO_CLIPPING_FEATURE", 126), new jz5.l("MODEL_EXPRESSION_HIGHLIGHT", 127), new jz5.l("MODEL_PORTRAITSEGMENT_MINI", 128), new jz5.l("MODEL_AUDIO_CNN", 130), new jz5.l("MODEL_VIDEO_CLASSIFICATION", 131), new jz5.l("MODEL_VIDEO_IMG_CLASSIFICATION", 132), new jz5.l("MODEL_VIDEO_IMG_FEAT", 133), new jz5.l("MODEL_MOBILE_POLICY_DB", 134), new jz5.l("MODEL_LUA_SCRIPT", 135), new jz5.l("MODEL_PRETRAIN_IMAGE_FEATURE", 136), new jz5.l("MODEL_OSD_BACKBONE", 138), new jz5.l("MODEL_OSD_HEAD", 139), new jz5.l("MODEL_VIDEO_HIGHLIGHT", 140), new jz5.l("MODEL_OSD", 147), new jz5.l("MODEL_OSD_FEATURES", 148), new jz5.l("MODEL_CSC_DET", java.lang.Integer.valueOf(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS)), new jz5.l("MODEL_SCAN_CLS", 154), new jz5.l("MODEL_BODY_POSE", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX)), new jz5.l("MODEL_VIO_CONFIG", 152), new jz5.l("MODEL_HAND_POSE3D", 161), new jz5.l("MODEL_BODY_POSE3D", 162), new jz5.l("MODEL_FACE_OCCULASIONSEG_TINY", 157), new jz5.l("MODEL_AUDIO_PREPARE", 163), new jz5.l("MODEL_AUDIO_TASK_AUDIO_FEAT", 164), new jz5.l("MODEL_AUDIO_TASK_FUSION", 165), new jz5.l("MODEL_AUDIO_TASK_IMAGE_FEAT", 166), new jz5.l("MODEL_SKINSEGMENT", java.lang.Integer.valueOf(be1.r0.CTRL_INDEX)), new jz5.l("MODEL_DEPTH", java.lang.Integer.valueOf(com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC)), new jz5.l("MODEL_FACEATTR", 170), new jz5.l("MODEL_MMFG1", java.lang.Integer.valueOf(ib1.t.CTRL_INDEX)), new jz5.l("MODEL_MMFG2", 174), new jz5.l("MODEL_PRETRAIN_IMAGE_FEATURE_NEWLIFE", 176), new jz5.l("MODEL_VIDEO_BGM_FEATURE", 177), new jz5.l("MODEL_DEPTH_SETTING", 178), new jz5.l("MODEL_SHOE", 175), new jz5.l("MODEL_LEGSEGMENT", 179), new jz5.l("MODEL_HAIRSEGMENT", 180), new jz5.l("MODEL_DEPTH_MAAS", 181), new jz5.l("MODEL_HEADSEGMENT", 186), new jz5.l("MODEL_SODSEGMENT", 185), new jz5.l("MODEL_ASR_NNVAD", 191), new jz5.l("MODEL_TING_AUDIO_CLS", 192), new jz5.l("MODEL_OCR_CARD", 193), new jz5.l("MODEL_VIDEO_BGM_FEATURE_SPH", 201), new jz5.l("MODEL_FACE3D_BFM_XBIN", 203), new jz5.l("MODEL_FACE_RECONSTRUCTION", 204), new jz5.l("MODEL_PET_ALIGNMENT", 205), new jz5.l("MODEL_DIRT_DET", 207), new jz5.l("MODEL_OCR_IDCARD", 208), new jz5.l("MODEL_PROFILE_EXTRACTOR", 209), new jz5.l("MODEL_VGPT_DET", 210), new jz5.l("MODEL_VGPT_SEG", 211), new jz5.l("MODEL_VGPT_SOT", 212), new jz5.l("MODEL_WEVISION2_CFG", 214), new jz5.l("MODEL_WECLIP_FEATURE", 217), new jz5.l("MODEL_GAN_BEAUTY", 218), new jz5.l("MODEL_SKINSEGMENT_LARGE", 219), new jz5.l("MODEL_PORTRAITSEGMENT_MEDIUM", 220));
        f350676c = k17;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k17.entrySet()) {
            linkedHashMap.put(java.lang.Integer.valueOf(((java.lang.Number) entry.getValue()).intValue()), (java.lang.String) entry.getKey());
        }
        f350677d = linkedHashMap;
        kz5.n0.S0(f350676c.values());
    }

    public static java.util.Map a(p05.r3 r3Var, java.util.List keyArray, boolean z17, rh0.z appScene, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            keyArray = f350675b;
        }
        if ((i17 & 4) != 0) {
            appScene = rh0.z.f395619p;
        }
        r3Var.getClass();
        kotlin.jvm.internal.o.g(keyArray, "keyArray");
        kotlin.jvm.internal.o.g(appScene, "appScene");
        java.util.List V0 = kz5.n0.V0(keyArray);
        java.util.HashMap hashMap = new java.util.HashMap();
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        java.lang.String g17 = p05.a3.f350439a.g("MODEL_FACE3D_PARAMS");
        if (g17 != null) {
            hashMap.put("MODEL_FACE3D_PARAMS", g17);
        }
        if (kz5.z.D0(new rh0.z[]{rh0.z.f395613g, rh0.z.f395614h}).contains(appScene)) {
            ((java.util.ArrayList) V0).add("MODEL_HEADSEGMENT");
        }
        java.util.Iterator it = ((java.util.ArrayList) V0).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
            java.lang.String g18 = p05.a3.f350439a.g(str);
            if (g18 != null) {
                hashMap.put(str, g18);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.WeVisModelUtil", "getModelMap: " + str + " not exist");
            }
        }
        if (appScene == rh0.z.f395615i || appScene == rh0.z.f395611e) {
            hashMap.remove("MODEL_FACE3D_XBIN");
            hashMap.remove("MODEL_HAND");
            hashMap.remove("MODEL_LUA_SCRIPT");
        }
        if (appScene != rh0.z.f395614h && appScene != rh0.z.f395613g) {
            hashMap.remove("MODEL_SKINSEGMENT");
            hashMap.remove("MODEL_FACE_OCCULASIONSEG");
            hashMap.remove("MODEL_FACE_OCCULASIONSEG_TINY");
            hashMap.remove("MODEL_BODY_POSE");
        }
        return hashMap;
    }
}
