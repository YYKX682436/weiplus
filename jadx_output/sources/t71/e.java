package t71;

/* loaded from: classes15.dex */
public abstract class e {
    public static java.lang.String a(i83.b bVar) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bVar == null) {
            return jSONObject.toString();
        }
        try {
            jSONObject.put("type", bVar.f289635e);
            java.lang.String str = bVar.f289635e;
            if (str == null || !str.equals("1")) {
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f289636f);
                java.lang.String str2 = bVar.f289638h;
                if (str2 != null) {
                    jSONObject.put("taxNumber", str2);
                } else {
                    jSONObject.put("taxNumber", "");
                }
                java.lang.String str3 = bVar.f289645r;
                if (str3 != null) {
                    jSONObject.put("companyAddress", str3);
                } else {
                    jSONObject.put("companyAddress", "");
                }
                java.lang.String str4 = bVar.f289642o;
                if (str4 != null) {
                    jSONObject.put("telephone", str4);
                } else {
                    jSONObject.put("telephone", "");
                }
                java.lang.String str5 = bVar.f289640m;
                if (str5 != null) {
                    jSONObject.put("bankName", str5);
                } else {
                    jSONObject.put("bankName", "");
                }
                java.lang.String str6 = bVar.f289639i;
                if (str6 != null) {
                    jSONObject.put("bankAccount", str6);
                } else {
                    jSONObject.put("bankAccount", "");
                }
            } else {
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f289637g);
                jSONObject.put("taxNumber", "");
                jSONObject.put("companyAddress", "");
                jSONObject.put("telephone", "");
                jSONObject.put("bankName", "");
                jSONObject.put("bankAccount", "");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InvoiceUtil", "put json value error : %s", android.util.Log.getStackTraceString(e17));
        }
        return jSONObject.toString();
    }
}
