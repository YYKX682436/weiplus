package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/TextData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/g", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class TextData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.g CREATOR = new c85.g(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193179d;

    public TextData(java.lang.String str) {
        this.f193179d = str;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193179d);
    }
}
