package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class DeleteAllFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.DeleteAllFileSystem> CREATOR = new com.tencent.mm.vfs.n0();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212704e;

    public DeleteAllFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212704e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.o0(this, (com.tencent.mm.vfs.q2) this.f212704e.b(map));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.DeleteAllFileSystem) {
            if (this.f212704e.equals(((com.tencent.mm.vfs.DeleteAllFileSystem) obj).f212704e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.DeleteAllFileSystem.class.hashCode() ^ this.f212704e.hashCode();
    }

    public java.lang.String toString() {
        return "delete <- " + this.f212704e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.StatisticsFileSystem.class, 1);
        parcel.writeParcelable(this.f212704e, i17);
    }

    public DeleteAllFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.StatisticsFileSystem.class, 1);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212704e = fileSystem;
        if (fileSystem == null) {
            throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
        }
    }
}
