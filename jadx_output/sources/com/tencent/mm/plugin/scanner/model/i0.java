package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes9.dex */
public final class i0 implements android.os.Parcelable.Creator {
    public i0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.scanner.model.OfflineScanContext a(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        byte[] decode = android.util.Base64.decode(value, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        return new com.tencent.mm.plugin.scanner.model.OfflineScanContext(obtain);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.scanner.model.OfflineScanContext(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.scanner.model.OfflineScanContext[i17];
    }
}
