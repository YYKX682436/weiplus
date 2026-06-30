package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class QuotaFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.QuotaFileSystem> CREATOR = new com.tencent.mm.vfs.r4();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212740e;

    /* renamed from: f, reason: collision with root package name */
    public final long f212741f;

    /* renamed from: g, reason: collision with root package name */
    public final long f212742g;

    /* renamed from: h, reason: collision with root package name */
    public final long f212743h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f212744i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212745m;

    public QuotaFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, long j17, long j18, long j19, boolean z17, java.lang.String str) {
        this.f212740e = fileSystem;
        this.f212741f = j17;
        this.f212742g = j18;
        this.f212743h = j19;
        this.f212744i = z17;
        this.f212745m = str == null ? null : new com.tencent.mm.vfs.f1(str);
        if (j18 < j17) {
            throw new java.lang.IllegalArgumentException("Cleaning threshold must not less than target size.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        java.lang.String[] split;
        long j17 = this.f212741f;
        long j18 = this.f212742g;
        long j19 = this.f212743h;
        ?? r66 = this.f212744i;
        com.tencent.mm.vfs.f1 f1Var = this.f212745m;
        boolean z17 = r66;
        if (f1Var != null) {
            java.lang.String a17 = f1Var.a(map);
            if (a17 == null) {
                java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
                split = new java.lang.String[0];
            } else {
                split = com.tencent.mm.vfs.e8.f212918b.split(a17);
            }
            int length = split.length;
            z17 = r66;
            if (length != 0) {
                boolean z18 = r66;
                if (length != 1) {
                    boolean z19 = r66;
                    if (length != 2) {
                        boolean z27 = r66;
                        if (length != 3) {
                            java.lang.String str = split[3];
                            if (str != null) {
                                try {
                                    r66 = java.lang.Integer.parseInt(str);
                                } catch (java.lang.NumberFormatException unused) {
                                }
                            }
                            z27 = r66 != 0;
                        }
                        j19 = com.tencent.mm.vfs.e8.n(split[2], j19);
                        z19 = z27;
                    }
                    j18 = com.tencent.mm.vfs.e8.m(split[1], j18);
                    z18 = z19;
                }
                j17 = com.tencent.mm.vfs.e8.m(split[0], j17);
                z17 = z18;
            }
        }
        return new com.tencent.mm.vfs.u4(this, (com.tencent.mm.vfs.q2) this.f212740e.b(map), j17, j18, j19, z17, map);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.QuotaFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.QuotaFileSystem quotaFileSystem = (com.tencent.mm.vfs.QuotaFileSystem) obj;
        return this.f212740e.equals(quotaFileSystem.f212740e) && this.f212741f == quotaFileSystem.f212741f && this.f212742g == quotaFileSystem.f212742g && this.f212743h == quotaFileSystem.f212743h && this.f212744i == quotaFileSystem.f212744i;
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.QuotaFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212740e, java.lang.Long.valueOf(this.f212741f), java.lang.Long.valueOf(this.f212742g), java.lang.Long.valueOf(this.f212743h), java.lang.Boolean.valueOf(this.f212744i)};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        java.lang.String f1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quota(");
        com.tencent.mm.vfs.f1 f1Var2 = this.f212745m;
        if (f1Var2 == null) {
            f1Var = com.tencent.mm.vfs.e8.g(this.f212741f) + " / " + com.tencent.mm.vfs.e8.g(this.f212742g);
        } else {
            f1Var = f1Var2.toString();
        }
        sb6.append(f1Var);
        sb6.append(") <- ");
        sb6.append(this.f212740e);
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.QuotaFileSystem.class, 3);
        parcel.writeParcelable(this.f212740e, i17);
        parcel.writeLong(this.f212741f);
        parcel.writeLong(this.f212742g);
        parcel.writeLong(this.f212743h);
        parcel.writeByte(this.f212744i ? (byte) 1 : (byte) 0);
    }

    public QuotaFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.QuotaFileSystem.class, 3);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212740e = fileSystem;
        if (fileSystem != null) {
            long readLong = parcel.readLong();
            this.f212741f = readLong;
            long readLong2 = parcel.readLong();
            this.f212742g = readLong2;
            this.f212743h = parcel.readLong();
            this.f212744i = parcel.readByte() != 0;
            java.lang.String readString = parcel.readString();
            this.f212745m = readString == null ? null : new com.tencent.mm.vfs.f1(readString);
            if (readLong2 < readLong) {
                throw new java.lang.IllegalArgumentException("Cleaning threshold must not less than target size.");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
