package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
class WhiteListFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.WhiteListFileSystem> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212762e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f212763f;

    static {
        java.util.regex.Pattern.compile("^[0-9a-f]{32}");
        CREATOR = new com.tencent.mm.vfs.n8();
    }

    public WhiteListFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.WhiteListFileSystem.class, 1);
        this.f212762e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212763f = parcel.createStringArray();
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return (com.tencent.mm.vfs.q2) this.f212762e.b(map);
    }

    public java.lang.String toString() {
        return "whiteList <- " + this.f212762e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.WhiteListFileSystem.class, 1);
        parcel.writeParcelable(this.f212762e, i17);
        parcel.writeStringArray(this.f212763f);
    }
}
