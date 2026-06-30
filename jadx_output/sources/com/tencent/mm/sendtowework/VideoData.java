package com.tencent.mm.sendtowework;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sendtowework/VideoData;", "Lcom/tencent/mm/sendtowework/BaseDataToWeWork;", "CREATOR", "c85/h", "wechat-internal-support_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VideoData extends com.tencent.mm.sendtowework.BaseDataToWeWork {
    public static final c85.h CREATOR = new c85.h(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193180d;

    public VideoData(java.lang.String str) {
        this.f193180d = str;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.sendtowework.BaseDataToWeWork, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f193180d);
    }
}
