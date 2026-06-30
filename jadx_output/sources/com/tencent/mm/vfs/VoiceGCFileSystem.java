package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class VoiceGCFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.VoiceGCFileSystem> CREATOR = new com.tencent.mm.vfs.i8();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f212760f;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212761e;

    public VoiceGCFileSystem(com.tencent.mm.vfs.FileSystem fileSystem) {
        this.f212761e = fileSystem;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return new com.tencent.mm.vfs.k8(this, (com.tencent.mm.vfs.q2) this.f212761e.b(map));
    }

    public java.lang.String toString() {
        return "voiceGC <- " + this.f212761e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.VoiceGCFileSystem.class, 1);
        parcel.writeParcelable(this.f212761e, i17);
    }

    public VoiceGCFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.VoiceGCFileSystem.class, 1);
        this.f212761e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(com.tencent.mm.vfs.VoiceGCFileSystem.class.getClassLoader());
    }
}
