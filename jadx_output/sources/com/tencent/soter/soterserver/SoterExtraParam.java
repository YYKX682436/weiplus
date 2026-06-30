package com.tencent.soter.soterserver;

/* loaded from: classes11.dex */
public class SoterExtraParam implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.soter.soterserver.SoterExtraParam> CREATOR = new bu5.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f215328d;

    public SoterExtraParam(android.os.Parcel parcel) {
        this.f215328d = parcel.readValue(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f215328d);
    }
}
