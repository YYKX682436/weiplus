package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public class k4 {
    public java.lang.String field_aesKey;
    public java.lang.String field_fileId;
    public int field_fileLength;
    public java.lang.String field_fileUrl;

    public java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("aesKey", this.field_aesKey);
            jSONObject.put("fileId", this.field_fileId);
            jSONObject.put("fileUrl", this.field_fileUrl);
            jSONObject.put("fileLength", this.field_fileLength);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }
}
