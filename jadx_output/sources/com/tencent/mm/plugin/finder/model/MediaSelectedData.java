package com.tencent.mm.plugin.finder.model;

/* loaded from: classes.dex */
public class MediaSelectedData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.finder.model.MediaSelectedData> CREATOR = new so2.h5();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f121420d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121421e;

    /* renamed from: f, reason: collision with root package name */
    public final int f121422f;

    public MediaSelectedData(android.os.Parcel parcel) {
        this.f121420d = parcel.readString();
        this.f121421e = parcel.readString();
        this.f121422f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "MediaSelectedData{path='" + this.f121420d + "', thumbPath='" + this.f121421e + "', type=" + this.f121422f + ", cropInfo=null}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f121420d);
        parcel.writeString(this.f121421e);
        parcel.writeInt(this.f121422f);
    }
}
