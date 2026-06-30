package com.tencent.mm.plugin.performance.elf;

/* loaded from: classes5.dex */
public class ElfCheckResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.performance.elf.ElfCheckResponse> CREATOR = new xp3.f();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f152968d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f152969e;

    /* renamed from: f, reason: collision with root package name */
    public final long f152970f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f152971g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f152972h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f152973i;

    /* renamed from: m, reason: collision with root package name */
    public final long f152974m;

    /* renamed from: n, reason: collision with root package name */
    public final long f152975n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.Bundle f152976o;

    public ElfCheckResponse(boolean z17, long j17, boolean z18, boolean z19, java.lang.String str, java.lang.String str2, long j18) {
        this.f152971g = z19;
        this.f152968d = z18;
        this.f152973i = str;
        this.f152972h = str2;
        this.f152975n = j18;
        this.f152970f = j17;
        this.f152969e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.f152968d + "," + this.f152971g + "," + this.f152974m + "," + this.f152973i + "," + this.f152972h + "," + this.f152975n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f152968d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f152969e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f152970f);
        parcel.writeByte(this.f152971g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f152972h);
        parcel.writeString(this.f152973i);
        parcel.writeLong(this.f152974m);
        parcel.writeLong(this.f152975n);
        parcel.writeBundle(this.f152976o);
    }

    public ElfCheckResponse(android.os.Parcel parcel) {
        this.f152968d = parcel.readByte() != 0;
        this.f152969e = parcel.readByte() != 0;
        this.f152970f = parcel.readLong();
        this.f152971g = parcel.readByte() != 0;
        this.f152972h = parcel.readString();
        this.f152973i = parcel.readString();
        this.f152974m = parcel.readLong();
        this.f152975n = parcel.readLong();
        this.f152976o = parcel.readBundle();
    }
}
