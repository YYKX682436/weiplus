package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/FileData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/c", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FileData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.c CREATOR = new c85.c(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193166d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f193167e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f193168f;

    public FileData(java.lang.String str, java.lang.Long l17, java.lang.String str2) {
        this.f193166d = str;
        this.f193167e = l17;
        this.f193168f = str2;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193166d);
        parcel.writeValue(this.f193167e);
        parcel.writeString(this.f193168f);
    }
}
