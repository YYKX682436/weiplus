package com.tencent.mm.plugin.gallery.model;

/* loaded from: classes7.dex */
public class SelectedItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.gallery.model.SelectedItem> CREATOR = new t23.d2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f138450d;

    /* renamed from: e, reason: collision with root package name */
    public final long f138451e;

    public SelectedItem(android.os.Parcel parcel) {
        this.f138450d = parcel.readString();
        this.f138451e = parcel.readLong();
        parcel.createFloatArray();
        throw null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof com.tencent.mm.plugin.gallery.model.SelectedItem ? ((com.tencent.mm.plugin.gallery.model.SelectedItem) obj).f138451e == this.f138451e : super.equals(obj);
    }

    public int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f138450d);
        parcel.writeLong(this.f138451e);
        throw null;
    }
}
