package com.tencent.mm.vfs;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/vfs/DeleteBlockingFileSystem;", "Lcom/tencent/mm/vfs/AbstractFileSystem;", "com/tencent/mm/vfs/q0", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class DeleteBlockingFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.DeleteBlockingFileSystem> CREATOR = new com.tencent.mm.vfs.p0();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212705e;

    public DeleteBlockingFileSystem(com.tencent.mm.vfs.FileSystem fs6) {
        kotlin.jvm.internal.o.g(fs6, "fs");
        this.f212705e = fs6;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map env) {
        kotlin.jvm.internal.o.g(env, "env");
        java.lang.Object b17 = this.f212705e.b(env);
        kotlin.jvm.internal.o.f(b17, "configure(...)");
        return new com.tencent.mm.vfs.q0(this, (com.tencent.mm.vfs.q2) b17);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.mm.vfs.e8.u(dest, com.tencent.mm.vfs.DeleteBlockingFileSystem.class, 1);
        dest.writeParcelable(this.f212705e, i17);
    }

    public DeleteBlockingFileSystem(android.os.Parcel parcel, kotlin.jvm.internal.i iVar) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.DeleteBlockingFileSystem.class, 1);
        android.os.Parcelable readParcelable = parcel.readParcelable(com.tencent.mm.vfs.DeleteBlockingFileSystem.class.getClassLoader());
        kotlin.jvm.internal.o.d(readParcelable);
        this.f212705e = (com.tencent.mm.vfs.FileSystem) readParcelable;
    }
}
