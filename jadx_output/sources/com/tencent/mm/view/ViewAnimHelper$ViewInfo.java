package com.tencent.mm.view;

/* loaded from: classes9.dex */
public class ViewAnimHelper$ViewInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.view.ViewAnimHelper$ViewInfo> CREATOR = new ym5.t6();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f213513d;

    public ViewAnimHelper$ViewInfo(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.f213513d = rect2;
        rect2.set(rect);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f213513d, i17);
    }

    public ViewAnimHelper$ViewInfo(android.os.Parcel parcel) {
        this.f213513d = new android.graphics.Rect();
        this.f213513d = (android.graphics.Rect) parcel.readParcelable(android.graphics.Rect.class.getClassLoader());
    }
}
