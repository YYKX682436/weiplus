package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class s3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.vfs.MigrationFileSystem(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.vfs.MigrationFileSystem[i17];
    }
}
