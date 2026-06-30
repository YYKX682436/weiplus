package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/LinkData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/e", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LinkData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.e CREATOR = new c85.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193170d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193171e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193172f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f193173g;

    public LinkData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f193170d = str;
        this.f193171e = str2;
        this.f193172f = str3;
        this.f193173g = str4;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193170d);
        parcel.writeString(this.f193171e);
        parcel.writeString(this.f193172f);
        parcel.writeString(this.f193173g);
    }
}
