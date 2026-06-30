package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/LocationData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/f", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class LocationData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.f CREATOR = new c85.f(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193174d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193175e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Double f193176f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Double f193177g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Double f193178h;

    public LocationData(java.lang.String str, java.lang.String str2, java.lang.Double d17, java.lang.Double d18, java.lang.Double d19) {
        this.f193174d = str;
        this.f193175e = str2;
        this.f193176f = d17;
        this.f193177g = d18;
        this.f193178h = d19;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193174d);
        parcel.writeString(this.f193175e);
        parcel.writeValue(this.f193176f);
        parcel.writeValue(this.f193177g);
        parcel.writeValue(this.f193178h);
    }
}
