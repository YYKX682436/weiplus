package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class LinearLayoutManager$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState> CREATOR = new com.tencent.mm.xcompat.recyclerview.widget.d0();

    /* renamed from: d, reason: collision with root package name */
    public int f214385d;

    /* renamed from: e, reason: collision with root package name */
    public int f214386e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214387f;

    public LinearLayoutManager$SavedState(android.os.Parcel parcel) {
        this.f214385d = parcel.readInt();
        this.f214386e = parcel.readInt();
        this.f214387f = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f214385d);
        parcel.writeInt(this.f214386e);
        parcel.writeInt(this.f214387f ? 1 : 0);
    }

    public LinearLayoutManager$SavedState(com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.f214385d = linearLayoutManager$SavedState.f214385d;
        this.f214386e = linearLayoutManager$SavedState.f214386e;
        this.f214387f = linearLayoutManager$SavedState.f214387f;
    }
}
