package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class ExpireFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.ExpireFileSystem> CREATOR = new com.tencent.mm.vfs.o1();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212709e;

    /* renamed from: f, reason: collision with root package name */
    public final long f212710f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212711g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f212712h;

    public ExpireFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, long j17) {
        this.f212709e = fileSystem;
        this.f212710f = j17;
        this.f212711g = null;
        this.f212712h = false;
    }

    @Override // com.tencent.mm.vfs.a0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.vfs.q2 b(java.util.Map map) {
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) this.f212709e.b(map);
        long j17 = this.f212710f;
        com.tencent.mm.vfs.f1 f1Var = this.f212711g;
        if (f1Var != null) {
            j17 = com.tencent.mm.vfs.e8.n(f1Var.a(map), j17);
        }
        return new com.tencent.mm.vfs.p1(this, q2Var, j17, map);
    }

    @Override // com.tencent.mm.vfs.AbstractFileSystem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.ExpireFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.ExpireFileSystem expireFileSystem = (com.tencent.mm.vfs.ExpireFileSystem) obj;
        return this.f212710f == expireFileSystem.f212710f && this.f212712h == expireFileSystem.f212712h && this.f212709e.equals(expireFileSystem.f212709e) && com.tencent.mm.vfs.e8.f(this.f212711g, expireFileSystem.f212711g);
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.ExpireFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212709e, java.lang.Long.valueOf(this.f212710f), this.f212711g, java.lang.Boolean.valueOf(this.f212712h)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("expire(");
        com.tencent.mm.vfs.f1 f1Var = this.f212711g;
        sb6.append(f1Var == null ? com.tencent.mm.vfs.e8.h(this.f212710f) : f1Var.toString());
        sb6.append(this.f212712h ? ", D" : "");
        sb6.append(") <- ");
        sb6.append(this.f212709e);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.ExpireFileSystem.class, 3);
        parcel.writeParcelable(this.f212709e, i17);
        parcel.writeLong(this.f212710f);
        com.tencent.mm.vfs.f1 f1Var = this.f212711g;
        parcel.writeString(f1Var == null ? null : f1Var.f212921a);
        parcel.writeByte(this.f212712h ? (byte) 1 : (byte) 0);
    }

    public ExpireFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, long j17, java.lang.String str) {
        this.f212709e = fileSystem;
        this.f212710f = j17;
        this.f212711g = str == null ? null : new com.tencent.mm.vfs.f1(str);
        this.f212712h = false;
    }

    public ExpireFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.ExpireFileSystem.class, 3);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212709e = fileSystem;
        if (fileSystem != null) {
            this.f212710f = parcel.readLong();
            java.lang.String readString = parcel.readString();
            this.f212711g = readString == null ? null : new com.tencent.mm.vfs.f1(readString);
            this.f212712h = parcel.readByte() != 0;
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
