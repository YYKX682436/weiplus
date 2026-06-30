package com.tencent.mm.plugin.lite.launch;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/launch/WxaLiteAppLaunchInfo;", "Landroid/os/Parcelable;", "CREATOR", "ba3/a", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class WxaLiteAppLaunchInfo implements android.os.Parcelable {
    public static final ba3.a CREATOR = new ba3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f143874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143875e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f143876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143878h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f143879i;

    /* renamed from: m, reason: collision with root package name */
    public long f143880m;

    public WxaLiteAppLaunchInfo() {
        this.f143874d = "";
        this.f143875e = "";
        this.f143876f = "";
        this.f143877g = "";
        this.f143878h = "";
        this.f143879i = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "appId:" + this.f143874d + " \n pkgPath: " + this.f143875e + " signatureKey :xxx";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f143874d);
        dest.writeString(this.f143875e);
        dest.writeString(this.f143876f);
        dest.writeString(this.f143877g);
        dest.writeString(this.f143878h);
        dest.writeString(this.f143879i);
        dest.writeLong(this.f143880m);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WxaLiteAppLaunchInfo(android.os.Parcel parcel) {
        this();
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        this.f143874d = readString == null ? "" : readString;
        this.f143875e = parcel.readString();
        this.f143876f = parcel.readString();
        this.f143877g = parcel.readString();
        this.f143878h = parcel.readString();
        this.f143879i = parcel.readString();
        this.f143880m = parcel.readLong();
    }
}
