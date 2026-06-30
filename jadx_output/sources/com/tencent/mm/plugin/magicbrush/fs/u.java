package com.tencent.mm.plugin.magicbrush.fs;

/* loaded from: classes5.dex */
public final class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        int readInt = parcel.readInt();
        java.util.HashMap hashMap = new java.util.HashMap(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return new com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams(readString, readLong, readLong2, readLong3, hashMap);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.magicbrush.fs.MagicBrushStorageQuotaManager$CleanupTempFilesOnMBBIzExitParams[i17];
    }
}
