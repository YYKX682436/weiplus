package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f175576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(android.app.Activity activity) {
        super(0);
        this.f175576d = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        boolean z18;
        boolean z19;
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            android.view.Display.HdrCapabilities hdrCapabilities = this.f175576d.getWindowManager().getDefaultDisplay().getHdrCapabilities();
            int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            kotlin.jvm.internal.o.d(supportedHdrTypes);
            for (int i17 : supportedHdrTypes) {
                jSONArray.put(i17);
            }
            jSONObject.put("HDRTypes", jSONArray);
            jSONObject.put("MaxLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMaxLuminance()));
            jSONObject.put("MinLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMinLuminance()));
            jSONObject.put("AvgLuminance", java.lang.Float.valueOf(hdrCapabilities.getDesiredMaxAverageLuminance()));
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            if (codecInfos != null) {
                z17 = false;
                z18 = false;
                z19 = false;
                for (android.media.MediaCodecInfo mediaCodecInfo : codecInfos) {
                    try {
                        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc");
                        if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                            int length = codecProfileLevelArr.length;
                            int i18 = 0;
                            while (i18 < length) {
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i18];
                                try {
                                    android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                    z17 |= com.tencent.thumbplayer.core.common.TPCodecUtils.isHDRsupport(2, codecProfileLevel.profile, codecProfileLevel.level);
                                    z18 |= com.tencent.thumbplayer.core.common.TPCodecUtils.isHDRsupport(0, codecProfileLevel.profile, codecProfileLevel.level);
                                    z19 |= com.tencent.thumbplayer.core.common.TPCodecUtils.isHDRsupport(1, codecProfileLevel.profile, codecProfileLevel.level);
                                    i18++;
                                    codecProfileLevelArr = codecProfileLevelArr2;
                                } catch (java.lang.Exception e17) {
                                    e = e17;
                                    int i19 = rl.b.f397143a;
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HDRUtil", e, "", new java.lang.Object[0]);
                                }
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                    }
                }
            } else {
                z17 = false;
                z18 = false;
                z19 = false;
            }
            jSONObject.put("isSupportDolbyHDR", z17);
            jSONObject.put("isSupportHDR10", z18);
            jSONObject.put("isSupportHDR10Plus", z19);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.plugin.vlog.model.e0.f175586b = r26.i0.t(jSONObject2, ",", ";", false);
        } catch (java.lang.Exception e19) {
            int i27 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.HDRUtil", e19, "", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
