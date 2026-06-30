package com.tencent.mm.plugin.profile.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/model/WxaRegisterInfo;", "Landroid/os/Parcelable;", "CREATOR", "dr3/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WxaRegisterInfo implements android.os.Parcelable {
    public static final dr3.a CREATOR = new dr3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f153532d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f153533e;

    public WxaRegisterInfo(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        readString = readString == null ? "" : readString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        parcel.readTypedList(arrayList, com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo.CREATOR);
        this.f153532d = readString;
        this.f153533e = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f153532d);
        parcel.writeTypedList(this.f153533e);
    }
}
