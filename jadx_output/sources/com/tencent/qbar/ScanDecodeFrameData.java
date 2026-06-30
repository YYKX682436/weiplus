package com.tencent.qbar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/qbar/ScanDecodeFrameData;", "Landroid/os/Parcelable;", "scan-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScanDecodeFrameData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.qbar.ScanDecodeFrameData> CREATOR = new zs5.k0();

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f215238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f215239e;

    /* renamed from: f, reason: collision with root package name */
    public final int f215240f;

    /* renamed from: g, reason: collision with root package name */
    public final int f215241g;

    public ScanDecodeFrameData(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f215238d = parcel.createByteArray();
        this.f215239e = parcel.readInt();
        this.f215240f = parcel.readInt();
        this.f215241g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeByteArray(this.f215238d);
        parcel.writeInt(this.f215239e);
        parcel.writeInt(this.f215240f);
        parcel.writeInt(this.f215241g);
    }
}
