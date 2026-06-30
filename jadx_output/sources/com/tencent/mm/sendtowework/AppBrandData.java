package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/AppBrandData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/a", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class AppBrandData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.a CREATOR = new c85.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193159d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193160e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193161f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f193162g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f193163h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f193164i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f193165m;

    public AppBrandData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num) {
        this.f193159d = str;
        this.f193160e = str2;
        this.f193161f = str3;
        this.f193162g = str4;
        this.f193163h = str5;
        this.f193164i = str6;
        this.f193165m = num;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193159d);
        parcel.writeString(this.f193160e);
        parcel.writeString(this.f193161f);
        parcel.writeString(this.f193162g);
        parcel.writeString(this.f193163h);
        parcel.writeString(this.f193164i);
        parcel.writeValue(this.f193165m);
    }
}
