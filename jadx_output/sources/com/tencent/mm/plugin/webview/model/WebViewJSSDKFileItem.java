package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public abstract class WebViewJSSDKFileItem implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f182735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f182736e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f182737f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f182738g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f182739h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f182740i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f182741m;

    /* renamed from: n, reason: collision with root package name */
    public int f182742n;

    /* renamed from: o, reason: collision with root package name */
    public int f182743o;

    /* renamed from: p, reason: collision with root package name */
    public int f182744p;

    /* renamed from: q, reason: collision with root package name */
    public int f182745q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.k4 f182746r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f182747s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f182748t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f182749u;

    /* renamed from: v, reason: collision with root package name */
    public android.os.Bundle f182750v;

    public WebViewJSSDKFileItem() {
        this.f182748t = true;
        this.f182749u = true;
        this.f182750v = new android.os.Bundle();
    }

    public org.json.JSONObject a() {
        java.lang.String jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("appId", this.f182735d);
            jSONObject2.put(dm.i4.COL_LOCALID, this.f182736e);
            jSONObject2.put("thumbFilePath", this.f182737f);
            jSONObject2.put("origFilePath", this.f182738g);
            jSONObject2.put("serverId", this.f182739h);
            jSONObject2.put("mediaId", this.f182740i);
            jSONObject2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME, this.f182741m);
            jSONObject2.put("mediaType", this.f182742n);
            jSONObject2.put("size", this.f182743o);
            jSONObject2.put("width", this.f182744p);
            jSONObject2.put("height", this.f182745q);
            com.tencent.mm.plugin.webview.model.k4 k4Var = this.f182746r;
            if (k4Var != null) {
                jSONObject2.put("cdnInfo", k4Var.a());
            }
            jSONObject2.put("upload", this.f182747s);
            jSONObject2.put("needCompress", this.f182748t);
            jSONObject2.put("needUploadCDNInfo", this.f182749u);
            android.os.Bundle bundle = this.f182750v;
            if (bundle == null) {
                jSONObject = "";
            } else {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    for (java.lang.String str : bundle.keySet()) {
                        jSONObject3.put(str, bundle.get(str));
                    }
                } catch (org.json.JSONException unused) {
                }
                jSONObject = jSONObject3.toString();
            }
            jSONObject2.put("extra", jSONObject);
        } catch (org.json.JSONException unused2) {
        }
        return jSONObject2;
    }

    public abstract java.lang.String b();

    public abstract java.lang.String c();

    public void d(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.f182735d = jSONObject.optString("appId");
        this.f182736e = jSONObject.optString(dm.i4.COL_LOCALID);
        this.f182737f = jSONObject.optString("thumbFilePath");
        this.f182738g = jSONObject.optString("origFilePath");
        this.f182739h = jSONObject.optString("serverId");
        this.f182740i = jSONObject.optString("mediaId");
        this.f182741m = jSONObject.optString(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME);
        this.f182742n = jSONObject.optInt("mediaType");
        this.f182743o = jSONObject.optInt("size");
        this.f182744p = jSONObject.optInt("width");
        this.f182745q = jSONObject.optInt("height");
        java.lang.String optString = jSONObject.optString("cdnInfo");
        com.tencent.mm.plugin.webview.model.k4 k4Var = new com.tencent.mm.plugin.webview.model.k4();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(optString);
            k4Var.field_aesKey = jSONObject2.optString("aesKey");
            k4Var.field_fileId = jSONObject2.optString("fileId");
            k4Var.field_fileUrl = jSONObject2.optString("fileUrl");
            k4Var.field_fileLength = jSONObject2.optInt("fileLength");
        } catch (org.json.JSONException unused) {
        }
        this.f182746r = k4Var;
        this.f182747s = jSONObject.optBoolean("upload");
        this.f182748t = jSONObject.optBoolean("needCompress", true);
        this.f182749u = jSONObject.optBoolean("needUploadCDNInfo", true);
        java.lang.String optString2 = jSONObject.optString("extra");
        android.os.Bundle bundle = new android.os.Bundle();
        if (optString2 != null && !optString2.isEmpty()) {
            try {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(optString2);
                java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject3.get(next);
                    if (obj instanceof java.lang.String) {
                        bundle.putString(next, (java.lang.String) obj);
                    } else if (obj instanceof java.lang.Integer) {
                        bundle.putInt(next, ((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle.putLong(next, ((java.lang.Long) obj).longValue());
                    } else if (obj instanceof java.lang.Boolean) {
                        bundle.putBoolean(next, ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Byte) {
                        bundle.putByte(next, ((java.lang.Byte) obj).byteValue());
                    } else if (obj instanceof java.lang.Character) {
                        bundle.putChar(next, ((java.lang.Character) obj).charValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle.putFloat(next, ((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.Short) {
                        bundle.putShort(next, ((java.lang.Short) obj).shortValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle.putDouble(next, ((java.lang.Double) obj).doubleValue());
                    } else {
                        bundle.putString(next, obj.toString());
                    }
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        this.f182750v = bundle;
    }

    public void e(dn.h hVar) {
        if (this.f182746r == null) {
            this.f182746r = new com.tencent.mm.plugin.webview.model.k4();
        }
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItem", "sceneResult info is null");
            return;
        }
        com.tencent.mm.plugin.webview.model.k4 k4Var = this.f182746r;
        k4Var.field_aesKey = hVar.field_aesKey;
        k4Var.field_fileId = hVar.field_fileId;
        k4Var.field_fileUrl = hVar.field_fileUrl;
        k4Var.field_fileLength = (int) hVar.field_fileLength;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f182735d);
        parcel.writeString(this.f182736e);
        parcel.writeString(this.f182737f);
        parcel.writeString(this.f182738g);
        parcel.writeInt(this.f182742n);
        parcel.writeInt(this.f182743o);
        parcel.writeInt(this.f182744p);
        parcel.writeInt(this.f182745q);
        parcel.writeBundle(this.f182750v);
    }

    public WebViewJSSDKFileItem(android.os.Parcel parcel) {
        this.f182748t = true;
        this.f182749u = true;
        this.f182750v = new android.os.Bundle();
        this.f182735d = parcel.readString();
        this.f182736e = parcel.readString();
        this.f182737f = parcel.readString();
        this.f182738g = parcel.readString();
        this.f182742n = parcel.readInt();
        this.f182743o = parcel.readInt();
        this.f182744p = parcel.readInt();
        this.f182745q = parcel.readInt();
        this.f182750v = parcel.readBundle();
    }
}
