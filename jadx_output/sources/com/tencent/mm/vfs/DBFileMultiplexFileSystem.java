package com.tencent.mm.vfs;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/vfs/DBFileMultiplexFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "com/tencent/mm/vfs/g0", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DBFileMultiplexFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.DBFileMultiplexFileSystem> CREATOR = new com.tencent.mm.vfs.f0();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212702e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212703f;

    public DBFileMultiplexFileSystem(com.tencent.mm.vfs.FileSystem dbFs, com.tencent.mm.vfs.FileSystem fbFs) {
        kotlin.jvm.internal.o.g(dbFs, "dbFs");
        kotlin.jvm.internal.o.g(fbFs, "fbFs");
        this.f212702e = dbFs;
        this.f212703f = fbFs;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map env) {
        kotlin.jvm.internal.o.g(env, "env");
        java.lang.Object b17 = this.f212702e.b(env);
        kotlin.jvm.internal.o.f(b17, "configure(...)");
        java.lang.Object b18 = this.f212703f.b(env);
        kotlin.jvm.internal.o.f(b18, "configure(...)");
        return new com.tencent.mm.vfs.g0(this, (com.tencent.mm.vfs.q2) b17, (com.tencent.mm.vfs.q2) b18);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.mm.vfs.e8.u(dest, com.tencent.mm.vfs.DBFileMultiplexFileSystem.class, 1);
        dest.writeParcelable(this.f212702e, i17);
        dest.writeParcelable(this.f212703f, i17);
    }

    public DBFileMultiplexFileSystem(android.os.Parcel parcel, kotlin.jvm.internal.i iVar) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.DBFileMultiplexFileSystem.class, 1);
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.vfs.DBFileMultiplexFileSystem.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        this.f212702e = (com.tencent.mm.vfs.FileSystem) readParcelable;
        android.os.Parcelable readParcelable2 = parcel.readParcelable(com.tencent.mm.vfs.DBFileMultiplexFileSystem.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable2);
        this.f212703f = (com.tencent.mm.vfs.FileSystem) readParcelable2;
    }
}
