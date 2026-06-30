package com.tencent.mm.plugin.performance.elf;

/* loaded from: classes5.dex */
public class ElfCheckRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.performance.elf.ElfCheckRequest> CREATOR = new xp3.d();

    /* renamed from: d, reason: collision with root package name */
    public long f152967d;

    public ElfCheckRequest() {
        this.f152967d = 0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f152967d);
    }

    public ElfCheckRequest(android.os.Parcel parcel) {
        this.f152967d = 0L;
        this.f152967d = parcel.readLong();
    }
}
