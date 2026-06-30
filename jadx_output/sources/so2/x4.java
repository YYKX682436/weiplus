package so2;

/* loaded from: classes9.dex */
public final class x4 {
    public x4(kotlin.jvm.internal.i iVar) {
    }

    public final so2.z4 a(java.lang.String jsonString, so2.a5 source) {
        so2.i5 i5Var;
        cl0.g b17;
        cl0.g b18;
        kotlin.jvm.internal.o.g(jsonString, "jsonString");
        kotlin.jvm.internal.o.g(source, "source");
        try {
            cl0.g gVar = new cl0.g(jsonString);
            com.tencent.mars.xlog.Log.i("FinderSelectProductInfo", "productInfoFromMiniAppResult json:".concat(jsonString));
            cl0.g b19 = gVar.b("commonDec");
            cl0.g b27 = b19 != null ? b19.b("previewIcon") : null;
            java.lang.String optString = b27 != null ? b27.optString("lightUrl", "") : null;
            if (optString == null) {
                optString = "";
            }
            java.lang.String optString2 = b27 != null ? b27.optString("darkUrl", "") : null;
            if (optString2 == null) {
                optString2 = "";
            }
            i5Var = new so2.i5(optString, optString2);
            b17 = gVar.b("commodity");
            b18 = gVar.b("ecActivity");
        } catch (java.lang.Exception unused) {
        }
        if (b17 != null) {
            cl0.g b28 = b17.b("fullPage");
            java.lang.String optString3 = b28 != null ? b28.optString("appid") : null;
            java.lang.String str = optString3 == null ? "" : optString3;
            java.lang.String optString4 = b28 != null ? b28.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH) : null;
            java.lang.String str2 = optString4 == null ? "" : optString4;
            java.lang.String optString5 = b17.optString("productId", "");
            java.lang.String optString6 = b17.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            kotlin.jvm.internal.o.d(optString6);
            kotlin.jvm.internal.o.d(optString5);
            return new so2.z4(optString6, optString5, 0, str, str2, source, null, 0, "", i5Var);
        }
        if (b18 != null) {
            cl0.g b29 = b18.b("fullPage");
            if (b29 == null) {
                b29 = b18.b("halfPage");
            }
            java.lang.String optString7 = b29 != null ? b29.optString("appid", "") : null;
            java.lang.String str3 = optString7 == null ? "" : optString7;
            java.lang.String optString8 = b29 != null ? b29.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "") : null;
            java.lang.String str4 = optString8 == null ? "" : optString8;
            java.lang.String optString9 = b18.optString("ecActivityId", "");
            int optInt = b18.optInt("activityType");
            java.lang.String optString10 = b18.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            java.lang.String optString11 = b18.optString("iconUrl", "");
            cl0.g b37 = b18.b("jumpInfoConfig");
            int optInt2 = b37 != null ? b37.optInt("businessType", 0) : 0;
            java.lang.String optString12 = b37 != null ? b37.optString("extInfo", "") : null;
            java.lang.String str5 = optString12 == null ? "" : optString12;
            kotlin.jvm.internal.o.d(optString10);
            kotlin.jvm.internal.o.d(optString9);
            return new so2.z4(optString10, optString9, optInt, str3, str4, source, optString11, optInt2, str5, i5Var);
        }
        return null;
    }
}
