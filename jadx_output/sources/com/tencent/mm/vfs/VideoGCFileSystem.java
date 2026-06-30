package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class VideoGCFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.VideoGCFileSystem> CREATOR = new com.tencent.mm.vfs.f8();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f212758f;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212759e;

    public VideoGCFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212759e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.h8(this, (com.tencent.mm.vfs.q2) this.f212759e.b(map));
    }

    public java.lang.String toString() {
        return "videoGC <- " + this.f212759e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.VideoGCFileSystem.class, 1);
        parcel.writeParcelable(this.f212759e, i17);
    }

    public VideoGCFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.VideoGCFileSystem.class, 1);
        this.f212759e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.VideoGCFileSystem.class.getClassLoader());
    }
}
