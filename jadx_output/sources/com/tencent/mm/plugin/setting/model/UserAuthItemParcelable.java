package com.tencent.mm.plugin.setting.model;

/* loaded from: classes8.dex */
public class UserAuthItemParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.setting.model.UserAuthItemParcelable> CREATOR = new k14.y0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f160054d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f160055e;

    /* renamed from: f, reason: collision with root package name */
    public int f160056f;

    /* renamed from: g, reason: collision with root package name */
    public int f160057g;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160054d);
        parcel.writeString(this.f160055e);
        parcel.writeInt(this.f160056f);
        parcel.writeInt(this.f160057g);
    }
}
