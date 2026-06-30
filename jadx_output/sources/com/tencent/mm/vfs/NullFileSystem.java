package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class NullFileSystem extends com.tencent.mm.vfs.k4 implements com.tencent.mm.vfs.FileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.NullFileSystem> CREATOR = new com.tencent.mm.vfs.j4(null);

    public NullFileSystem(com.tencent.mm.vfs.i4 i4Var) {
    }

    public static com.tencent.mm.vfs.q2 f() {
        return (com.tencent.mm.vfs.q2) com.tencent.mm.vfs.j4.f213013a.f213187a;
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "(null)";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this;
    }
}
