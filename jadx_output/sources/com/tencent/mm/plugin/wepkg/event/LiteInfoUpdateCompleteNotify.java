package com.tencent.mm.plugin.wepkg.event;

/* loaded from: classes8.dex */
public class LiteInfoUpdateCompleteNotify implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f188330d;

    public LiteInfoUpdateCompleteNotify(java.lang.String str) {
        this.f188330d = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f188330d);
    }
}
