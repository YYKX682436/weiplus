package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class AttachmentGCFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.AttachmentGCFileSystem> CREATOR = new com.tencent.mm.vfs.m();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f212694f;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212695e;

    public AttachmentGCFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212695e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.o(this, (com.tencent.mm.vfs.q2) this.f212695e.b(map));
    }

    public java.lang.String toString() {
        return "attachmentGC <- " + this.f212695e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.AttachmentGCFileSystem.class, 1);
        parcel.writeParcelable(this.f212695e, i17);
    }

    public AttachmentGCFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.AttachmentGCFileSystem.class, 1);
        this.f212695e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.AttachmentGCFileSystem.class.getClassLoader());
    }
}
