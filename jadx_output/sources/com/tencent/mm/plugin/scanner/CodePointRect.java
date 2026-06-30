package com.tencent.mm.plugin.scanner;

/* loaded from: classes13.dex */
public class CodePointRect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.scanner.CodePointRect> CREATOR = new com.tencent.mm.plugin.scanner.b();

    /* renamed from: d, reason: collision with root package name */
    public final float f158611d;

    /* renamed from: e, reason: collision with root package name */
    public final float f158612e;

    /* renamed from: f, reason: collision with root package name */
    public final float f158613f;

    /* renamed from: g, reason: collision with root package name */
    public final float f158614g;

    public CodePointRect(float f17, float f18, float f19, float f27) {
        this.f158611d = f17;
        this.f158612e = f18;
        this.f158613f = f19;
        this.f158614g = f27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f158611d);
        parcel.writeFloat(this.f158612e);
        parcel.writeFloat(this.f158613f);
        parcel.writeFloat(this.f158614g);
    }

    public CodePointRect(android.os.Parcel parcel) {
        this.f158611d = parcel.readFloat();
        this.f158612e = parcel.readFloat();
        this.f158613f = parcel.readFloat();
        this.f158614g = parcel.readFloat();
    }
}
