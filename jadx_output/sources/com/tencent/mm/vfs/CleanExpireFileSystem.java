package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class CleanExpireFileSystem extends com.tencent.mm.vfs.ExpireFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.CleanExpireFileSystem> CREATOR = new com.tencent.mm.vfs.s();

    /* renamed from: i, reason: collision with root package name */
    public final long f212696i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f212697m;

    public CleanExpireFileSystem(android.os.Parcel parcel) {
        super(parcel);
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.CleanExpireFileSystem.class, 2);
        this.f212697m = parcel.readByte() != 0;
        this.f212696i = this.f212710f;
    }

    @Override // com.tencent.mm.vfs.ExpireFileSystem, com.tencent.mm.vfs.a0
    /* renamed from: c */
    public com.tencent.mm.vfs.q2 b(java.util.Map map) {
        return new com.tencent.mm.vfs.t(this, (com.tencent.mm.vfs.q2) this.f212709e.b(map), map);
    }

    @Override // com.tencent.mm.vfs.ExpireFileSystem
    public java.lang.String toString() {
        return "CleanExpire [" + this.f212709e.toString() + "]";
    }

    @Override // com.tencent.mm.vfs.ExpireFileSystem, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.CleanExpireFileSystem.class, 2);
        parcel.writeByte(this.f212697m ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CleanExpireFileSystem(com.tencent.mm.vfs.FileSystem r7, long r8, boolean r10) {
        /*
            r6 = this;
            java.lang.String r0 = "CleanExpireFileSystem"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            java.lang.String r1 = "CleanExpireCurrentExpireTime"
            r2 = 0
            long r4 = r0.getLong(r1, r2)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 > 0) goto L18
            r8 = r4
            goto L1b
        L18:
            r0.B(r1, r8)
        L1b:
            r6.<init>(r7, r8)
            r6.f212696i = r8
            r6.f212697m = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.CleanExpireFileSystem.<init>(com.tencent.mm.vfs.FileSystem, long, boolean):void");
    }
}
