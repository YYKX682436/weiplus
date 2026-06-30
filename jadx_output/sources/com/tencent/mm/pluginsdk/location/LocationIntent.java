package com.tencent.mm.pluginsdk.location;

/* loaded from: classes12.dex */
public class LocationIntent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.pluginsdk.location.LocationIntent> CREATOR = new w25.k();

    /* renamed from: d, reason: collision with root package name */
    public double f188737d;

    /* renamed from: e, reason: collision with root package name */
    public double f188738e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f188743m;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f188746p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f188747q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f188748r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f188749s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f188750t;

    /* renamed from: u, reason: collision with root package name */
    public float f188751u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f188752v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f188753w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f188754x;

    /* renamed from: f, reason: collision with root package name */
    public int f188739f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f188740g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f188741h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f188742i = "";

    /* renamed from: n, reason: collision with root package name */
    public int f188744n = 0;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelgeo.Addr f188745o = null;

    public java.lang.String a() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("lat " + this.f188737d + ";");
        stringBuffer.append("lng " + this.f188738e + ";");
        stringBuffer.append("scale " + this.f188739f + ";");
        stringBuffer.append("label " + this.f188740g + ";");
        stringBuffer.append("poiname " + this.f188741h + ";");
        stringBuffer.append("infourl " + this.f188742i + ";");
        stringBuffer.append("locTypeId " + this.f188743m + ";");
        stringBuffer.append("poiType " + this.f188744n + ";");
        if (this.f188745o != null) {
            stringBuffer.append("addr " + this.f188745o.toString() + ";");
        }
        stringBuffer.append("poiid " + this.f188746p + ";");
        stringBuffer.append("fromPoiList " + this.f188747q + ";");
        stringBuffer.append("categoryTips " + this.f188748r + ";");
        stringBuffer.append("businessHour " + this.f188749s + ";");
        stringBuffer.append("phone " + this.f188750t + ";");
        stringBuffer.append("priceTips " + this.f188751u + ";");
        stringBuffer.append("nearByPoiid " + this.f188752v + ";");
        stringBuffer.append("buildingID:" + this.f188753w + ";");
        stringBuffer.append("floorName:" + this.f188754x + ";");
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeDouble(this.f188737d);
        parcel.writeDouble(this.f188738e);
        parcel.writeInt(this.f188739f);
        parcel.writeString(this.f188740g);
        parcel.writeString(this.f188741h);
        parcel.writeString(this.f188742i);
        parcel.writeString(this.f188743m);
        parcel.writeInt(this.f188744n);
        parcel.writeParcelable(this.f188745o, i17);
        parcel.writeString(this.f188746p);
        parcel.writeInt(this.f188747q ? 1 : 0);
        parcel.writeString(this.f188748r);
        parcel.writeString(this.f188749s);
        parcel.writeString(this.f188750t);
        parcel.writeFloat(this.f188751u);
        parcel.writeString(this.f188752v);
        parcel.writeString(this.f188753w);
        parcel.writeString(this.f188754x);
    }
}
