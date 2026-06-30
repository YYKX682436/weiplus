package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class QQMusicCacheCleanupFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem> CREATOR = new com.tencent.mm.vfs.o4();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212739e;

    public QQMusicCacheCleanupFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212739e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.q4(this, (com.tencent.mm.vfs.q2) this.f212739e.b(map));
    }

    public java.lang.String toString() {
        return "qqMusicCacheGC <- " + this.f212739e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem.class, 1);
        parcel.writeParcelable(this.f212739e, i17);
    }

    public QQMusicCacheCleanupFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem.class, 1);
        this.f212739e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem.class.getClassLoader());
    }
}
