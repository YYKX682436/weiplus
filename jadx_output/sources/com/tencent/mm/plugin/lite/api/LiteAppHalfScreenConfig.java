package com.tencent.mm.plugin.lite.api;

/* loaded from: classes9.dex */
public class LiteAppHalfScreenConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig> CREATOR = new com.tencent.mm.plugin.lite.api.k();

    /* renamed from: d, reason: collision with root package name */
    public double f143410d;

    /* renamed from: e, reason: collision with root package name */
    public double f143411e;

    /* renamed from: f, reason: collision with root package name */
    public double f143412f;

    /* renamed from: g, reason: collision with root package name */
    public double f143413g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f143414h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f143415i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener f143416m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f143417n;

    public LiteAppHalfScreenConfig() {
        this.f143410d = 1.0d;
        this.f143411e = 0.75d;
        this.f143412f = 0.0d;
        this.f143413g = 0.75d;
        this.f143414h = false;
        this.f143415i = false;
        this.f143416m = null;
        this.f143417n = false;
        new android.util.DisplayMetrics();
        double d17 = (com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels * 1.0d) / com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().heightPixels;
        this.f143412f = d17;
        if (d17 > 1.0d) {
            this.f143412f = 1.0d / d17;
        }
    }

    public static final com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig a(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig liteAppHalfScreenConfig = new com.tencent.mm.plugin.lite.api.LiteAppHalfScreenConfig();
        try {
            if (jSONObject.has("portraitWidthPercent")) {
                liteAppHalfScreenConfig.f143410d = jSONObject.getDouble("portraitWidthPercent");
            }
            if (jSONObject.has("portraitHeightPercent")) {
                liteAppHalfScreenConfig.f143411e = jSONObject.getDouble("portraitHeightPercent");
            }
            if (jSONObject.has("landscapeWidthPercent")) {
                liteAppHalfScreenConfig.f143412f = jSONObject.getDouble("landscapeWidthPercent");
            }
            if (jSONObject.has("landscapeHeightPercent")) {
                liteAppHalfScreenConfig.f143413g = jSONObject.getDouble("landscapeHeightPercent");
            }
            if (jSONObject.has("enableDragToClose")) {
                liteAppHalfScreenConfig.f143414h = jSONObject.getBoolean("enableDragToClose");
            }
            if (jSONObject.has("enableDragToFullScreen")) {
                liteAppHalfScreenConfig.f143415i = jSONObject.getBoolean("enableDragToFullScreen");
            }
            if (jSONObject.has("hideBgMask")) {
                liteAppHalfScreenConfig.f143417n = jSONObject.getBoolean("hideBgMask");
            }
        } catch (org.json.JSONException unused) {
        }
        return liteAppHalfScreenConfig;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f143410d);
        parcel.writeDouble(this.f143411e);
        parcel.writeDouble(this.f143412f);
        parcel.writeDouble(this.f143413g);
        parcel.writeInt(this.f143414h ? 1 : 0);
        parcel.writeInt(this.f143415i ? 1 : 0);
        parcel.writeParcelable(this.f143416m, i17);
        parcel.writeInt(this.f143417n ? 1 : 0);
    }

    public LiteAppHalfScreenConfig(android.os.Parcel parcel) {
        this.f143410d = 1.0d;
        this.f143411e = 0.75d;
        this.f143412f = 0.0d;
        this.f143413g = 0.75d;
        this.f143414h = false;
        this.f143415i = false;
        this.f143416m = null;
        this.f143417n = false;
        this.f143410d = parcel.readDouble();
        this.f143411e = parcel.readDouble();
        this.f143412f = parcel.readDouble();
        this.f143413g = parcel.readDouble();
        this.f143414h = parcel.readInt() == 1;
        this.f143415i = parcel.readInt() == 1;
        this.f143416m = (com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener) parcel.readParcelable(com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener.class.getClassLoader());
        this.f143417n = parcel.readInt() == 1;
    }
}
