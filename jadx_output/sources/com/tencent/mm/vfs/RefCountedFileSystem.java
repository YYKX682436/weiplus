package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class RefCountedFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.RefCountedFileSystem> CREATOR = new com.tencent.mm.vfs.b5();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212750e;

    /* renamed from: f, reason: collision with root package name */
    public final long f212751f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f212752g;

    public RefCountedFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, long j17, boolean z17) {
        this.f212750e = fileSystem;
        this.f212751f = j17;
        this.f212752g = z17;
    }

    public static java.lang.String c(java.lang.String str) {
        return ".ref/d/" + str;
    }

    public static boolean d(java.lang.String str) {
        if (!str.startsWith(".ref")) {
            return false;
        }
        if (str.length() != 4 && str.charAt(4) != '/') {
            return false;
        }
        com.tencent.stubs.logger.Log.w("VFS.RefCountedFileSystem", "Internal path referenced, something shall be wrong: ".concat(str));
        return true;
    }

    public static java.lang.String e(java.lang.String str) {
        return ".ref/c/" + str;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) this.f212750e.b(map);
        return q2Var == com.tencent.mm.vfs.NullFileSystem.f() ? q2Var : new com.tencent.mm.vfs.g5(this, q2Var, map);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.RefCountedFileSystem) {
            if (this.f212750e.equals(((com.tencent.mm.vfs.RefCountedFileSystem) obj).f212750e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.RefCountedFileSystem.class.hashCode() ^ this.f212750e.hashCode();
    }

    public java.lang.String toString() {
        return "refCount <- " + this.f212750e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.RefCountedFileSystem.class, 2);
        parcel.writeParcelable(this.f212750e, i17);
        parcel.writeLong(this.f212751f);
        parcel.writeByte(this.f212752g ? (byte) 1 : (byte) 0);
    }

    public RefCountedFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.RefCountedFileSystem.class, 2);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212750e = fileSystem;
        if (fileSystem != null) {
            this.f212751f = parcel.readLong();
            this.f212752g = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
