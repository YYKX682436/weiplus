package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class RC4EncryptedFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.RC4EncryptedFileSystem> CREATOR = new com.tencent.mm.vfs.v4();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212746e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.v2 f212747f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f212748g;

    public RC4EncryptedFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, java.lang.String str) {
        com.tencent.mm.vfs.v2 v2Var = com.tencent.mm.vfs.b3.F;
        this.f212747f = v2Var;
        if (v2Var != null) {
            this.f212746e = fileSystem;
            this.f212748g = str;
            return;
        }
        throw new java.lang.RuntimeException("Set global generator by calling setKeyGenerator(...) before initializing FileSystem objects.");
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        javax.crypto.spec.SecretKeySpec secretKeySpec;
        ((com.tencent.mm.vfs.r7) this.f212747f).getClass();
        if (map.get("account") == null) {
            secretKeySpec = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KeyGen.generate: ");
            java.lang.String str = this.f212748g;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("VFS.Debug", sb6.toString());
            secretKeySpec = new javax.crypto.spec.SecretKeySpec(kk.k.h(((com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().j() : new kk.v(gm0.m.i()).toString()) + str).getBytes()), "RC4");
        }
        if (secretKeySpec != null) {
            return new com.tencent.mm.vfs.w4(this, (com.tencent.mm.vfs.q2) this.f212746e.b(map), secretKeySpec);
        }
        throw new java.lang.RuntimeException("Cannot generate key.");
    }

    @Override // com.tencent.mm.vfs.AbstractFileSystem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "rc4 <- " + this.f212746e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.RC4EncryptedFileSystem.class, 3);
        parcel.writeParcelable(this.f212746e, i17);
        parcel.writeString(this.f212748g);
    }

    public RC4EncryptedFileSystem(android.os.Parcel parcel, com.tencent.mm.vfs.v4 v4Var) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.RC4EncryptedFileSystem.class, 3);
        com.tencent.mm.vfs.v2 v2Var = com.tencent.mm.vfs.b3.F;
        this.f212747f = v2Var;
        if (v2Var != null) {
            this.f212746e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
            this.f212748g = parcel.readString();
            return;
        }
        throw new java.lang.RuntimeException("Set global generator by calling setGlobalKeyGenerator(...) before initializing FileSystem objects.");
    }
}
