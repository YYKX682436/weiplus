package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class WepkgVersion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.wepkg.model.WepkgVersion> CREATOR = new com.tencent.mm.plugin.wepkg.model.v0();
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f188374d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f188375e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f188376f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188377g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f188378h;

    /* renamed from: i, reason: collision with root package name */
    public long f188379i;

    /* renamed from: m, reason: collision with root package name */
    public long f188380m;

    /* renamed from: n, reason: collision with root package name */
    public int f188381n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f188382o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f188383p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f188384q;

    /* renamed from: r, reason: collision with root package name */
    public int f188385r;

    /* renamed from: s, reason: collision with root package name */
    public int f188386s;

    /* renamed from: t, reason: collision with root package name */
    public long f188387t;

    /* renamed from: u, reason: collision with root package name */
    public long f188388u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f188389v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f188390w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f188391x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f188392y;

    /* renamed from: z, reason: collision with root package name */
    public int f188393z;

    public WepkgVersion(android.os.Parcel parcel) {
        this.f188374d = parcel.readString();
        this.f188375e = parcel.readString();
        this.f188376f = parcel.readString();
        this.f188377g = parcel.readString();
        this.f188378h = parcel.readByte() != 0;
        this.f188379i = parcel.readLong();
        this.f188380m = parcel.readLong();
        this.f188381n = parcel.readInt();
        this.f188382o = parcel.readString();
        this.f188383p = parcel.readString();
        this.f188384q = parcel.readString();
        this.f188385r = parcel.readInt();
        this.f188386s = parcel.readInt();
        this.f188387t = parcel.readLong();
        this.f188388u = parcel.readLong();
        this.f188389v = parcel.readString();
        this.f188390w = parcel.readByte() != 0;
        this.f188391x = parcel.readByte() != 0;
        this.f188392y = parcel.readByte() != 0;
        this.f188393z = parcel.readInt();
        this.A = parcel.readInt();
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("appId", this.f188375e);
            jSONObject.put("version", this.f188376f);
            jSONObject.put("pkgPath", this.f188377g);
            jSONObject.put("disableWvCache", this.f188378h);
            jSONObject.put("clearPkgTime", this.f188379i);
            jSONObject.put("checkIntervalTime", this.f188380m);
            jSONObject.put("packMethod", this.f188381n);
            jSONObject.put("domain", this.f188382o);
            jSONObject.put("md5", this.f188383p);
            jSONObject.put("downloadUrl", this.f188384q);
            jSONObject.put("pkgSize", this.f188385r);
            jSONObject.put("downloadNetType", this.f188386s);
            jSONObject.put("nextCheckTime", this.f188387t);
            jSONObject.put("charset", this.f188389v);
            jSONObject.put("bigPackageReady", this.f188390w);
            jSONObject.put("preloadFilesReady", this.f188391x);
            jSONObject.put("preloadFilesAtomic", this.f188392y);
            jSONObject.put("totalDownloadCount", this.f188393z);
            jSONObject.put("downloadTriggerType", this.A);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public void b(wz4.e eVar) {
        if (eVar != null) {
            this.f188374d = eVar.field_pkgId;
            this.f188375e = eVar.field_appId;
            this.f188376f = eVar.field_version;
            this.f188377g = eVar.field_pkgPath;
            this.f188378h = eVar.field_disableWvCache;
            this.f188379i = eVar.field_clearPkgTime;
            this.f188380m = eVar.field_checkIntervalTime;
            this.f188381n = eVar.field_packMethod;
            this.f188382o = eVar.field_domain;
            this.f188383p = eVar.field_md5;
            this.f188384q = eVar.field_downloadUrl;
            this.f188385r = eVar.field_pkgSize;
            this.f188386s = eVar.field_downloadNetType;
            this.f188387t = eVar.field_nextCheckTime;
            this.f188388u = eVar.field_createTime;
            this.f188389v = eVar.field_charset;
            this.f188390w = eVar.field_bigPackageReady;
            this.f188391x = eVar.field_preloadFilesReady;
            this.f188392y = eVar.field_preloadFilesAtomic;
            this.f188393z = eVar.field_totalDownloadCount;
            this.A = eVar.field_downloadTriggerType;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188374d);
        parcel.writeString(this.f188375e);
        parcel.writeString(this.f188376f);
        parcel.writeString(this.f188377g);
        parcel.writeByte(this.f188378h ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f188379i);
        parcel.writeLong(this.f188380m);
        parcel.writeInt(this.f188381n);
        parcel.writeString(this.f188382o);
        parcel.writeString(this.f188383p);
        parcel.writeString(this.f188384q);
        parcel.writeInt(this.f188385r);
        parcel.writeInt(this.f188386s);
        parcel.writeLong(this.f188387t);
        parcel.writeLong(this.f188388u);
        parcel.writeString(this.f188389v);
        parcel.writeByte(this.f188390w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f188391x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f188392y ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f188393z);
        parcel.writeInt(this.A);
    }
}
