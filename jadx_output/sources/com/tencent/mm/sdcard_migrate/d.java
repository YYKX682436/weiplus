package com.tencent.mm.sdcard_migrate;

/* loaded from: classes12.dex */
public class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -33554431) {
            throw new java.lang.IllegalStateException("Version mismatch, expected: " + java.lang.Integer.toHexString(-33554431) + ", got: " + java.lang.Integer.toHexString(readInt));
        }
        com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps extStorageMigrateMonitor$PendingOps = new com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps(null);
        int readInt2 = parcel.readInt();
        for (int i17 = 0; i17 < readInt2; i17++) {
            extStorageMigrateMonitor$PendingOps.f192337d.add(new com.tencent.mm.sdcard_migrate.e(parcel.readLong(), parcel.readLong(), parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        for (int i18 = 0; i18 < readInt3; i18++) {
            extStorageMigrateMonitor$PendingOps.f192338e.add(new com.tencent.mm.sdcard_migrate.f(parcel.readInt(), parcel.readString(), parcel.readString()));
        }
        return extStorageMigrateMonitor$PendingOps;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.sdcard_migrate.ExtStorageMigrateMonitor$PendingOps[i17];
    }
}
