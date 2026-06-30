package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class ApkCleanupFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.ApkCleanupFileSystem> CREATOR = new com.tencent.mm.vfs.h();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212691e;

    public ApkCleanupFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212691e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.i(this, (com.tencent.mm.vfs.q2) this.f212691e.b(map));
    }

    public java.lang.String toString() {
        return "apkClean <- " + this.f212691e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.ApkCleanupFileSystem.class, 1);
        parcel.writeParcelable(this.f212691e, i17);
    }

    public ApkCleanupFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.ApkCleanupFileSystem.class, 1);
        this.f212691e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.ApkCleanupFileSystem.class.getClassLoader());
    }
}
