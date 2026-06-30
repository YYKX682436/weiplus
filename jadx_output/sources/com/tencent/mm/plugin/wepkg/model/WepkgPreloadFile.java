package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class WepkgPreloadFile implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.model.WepkgPreloadFile> CREATOR = new com.tencent.mm.plugin.wepkg.model.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f188363e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188364f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188365g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f188366h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f188367i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f188368m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f188369n;

    /* renamed from: o, reason: collision with root package name */
    public int f188370o;

    /* renamed from: p, reason: collision with root package name */
    public int f188371p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f188372q;

    /* renamed from: r, reason: collision with root package name */
    public long f188373r;

    public WepkgPreloadFile(android.os.Parcel parcel) {
        this.f188362d = parcel.readString();
        this.f188363e = parcel.readString();
        this.f188364f = parcel.readString();
        this.f188365g = parcel.readString();
        this.f188366h = parcel.readString();
        this.f188367i = parcel.readString();
        this.f188368m = parcel.readString();
        this.f188369n = parcel.readString();
        this.f188370o = parcel.readInt();
        this.f188371p = parcel.readInt();
        this.f188372q = parcel.readByte() != 0;
        this.f188373r = parcel.readLong();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("key", this.f188362d);
            jSONObject.put("pkgId", this.f188363e);
            jSONObject.put("version", this.f188364f);
            jSONObject.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.f188365g);
            jSONObject.put("rid", this.f188366h);
            jSONObject.put("mimeType", this.f188367i);
            jSONObject.put("md5", this.f188368m);
            jSONObject.put("downloadUrl", this.f188369n);
            jSONObject.put("size", this.f188370o);
            jSONObject.put("downloadNetType", this.f188371p);
            jSONObject.put("completeDownload", this.f188372q);
            jSONObject.put("createTime", this.f188373r);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public void b(wz4.c cVar) {
        if (cVar != null) {
            this.f188362d = cVar.field_key;
            this.f188363e = cVar.field_pkgId;
            this.f188364f = cVar.field_version;
            this.f188365g = cVar.field_filePath;
            this.f188366h = cVar.field_rid;
            this.f188367i = cVar.field_mimeType;
            this.f188368m = cVar.field_md5;
            this.f188369n = cVar.field_downloadUrl;
            this.f188370o = cVar.field_size;
            this.f188371p = cVar.field_downloadNetType;
            this.f188372q = cVar.field_completeDownload;
            this.f188373r = cVar.field_createTime;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188362d);
        parcel.writeString(this.f188363e);
        parcel.writeString(this.f188364f);
        parcel.writeString(this.f188365g);
        parcel.writeString(this.f188366h);
        parcel.writeString(this.f188367i);
        parcel.writeString(this.f188368m);
        parcel.writeString(this.f188369n);
        parcel.writeInt(this.f188370o);
        parcel.writeInt(this.f188371p);
        parcel.writeByte(this.f188372q ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f188373r);
    }
}
