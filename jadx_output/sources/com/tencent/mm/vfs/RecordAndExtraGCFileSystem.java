package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class RecordAndExtraGCFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.RecordAndExtraGCFileSystem> CREATOR = new com.tencent.mm.vfs.x4();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212749e;

    public RecordAndExtraGCFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212749e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.z4(this, (com.tencent.mm.vfs.q2) this.f212749e.b(map));
    }

    public java.lang.String toString() {
        return "recordGC <- " + this.f212749e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.RecordAndExtraGCFileSystem.class, 1);
        parcel.writeParcelable(this.f212749e, i17);
    }

    public RecordAndExtraGCFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.RecordAndExtraGCFileSystem.class, 1);
        this.f212749e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.RecordAndExtraGCFileSystem.class.getClassLoader());
    }
}
