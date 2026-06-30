package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class MigrationFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.MigrationFileSystem> CREATOR = new com.tencent.mm.vfs.s3();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212716e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.i1 f212717f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212718g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212719h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212720i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212721m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212722n;

    public MigrationFileSystem(boolean z17, boolean z18, com.tencent.mm.vfs.FileSystem fileSystem, com.tencent.mm.vfs.a0... a0VarArr) {
        this(z17 ? "" : null, z18 ? "" : null, fileSystem, a0VarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r0.exists() != false) goto L29;
     */
    @Override // com.tencent.mm.vfs.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.MigrationFileSystem.b(java.util.Map):java.lang.Object");
    }

    @Override // com.tencent.mm.vfs.AbstractFileSystem, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.MigrationFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.MigrationFileSystem migrationFileSystem = (com.tencent.mm.vfs.MigrationFileSystem) obj;
        return this.f212716e.equals(migrationFileSystem.f212716e) && this.f212717f.equals(migrationFileSystem.f212717f) && this.f212718g.equals(migrationFileSystem.f212718g) && this.f212719h.equals(migrationFileSystem.f212719h) && this.f212720i.equals(migrationFileSystem.f212720i) && this.f212721m.equals(migrationFileSystem.f212721m);
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.MigrationFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212716e, this.f212717f, this.f212718g, this.f212719h, this.f212720i, this.f212721m};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("migrate(...) ");
        sb6.append(this.f212716e);
        com.tencent.mm.vfs.i1 i1Var = this.f212717f;
        i1Var.getClass();
        for (com.tencent.mm.vfs.a0 a0Var : i1Var.f212990a) {
            sb6.append('\n');
            sb6.append("  <- ");
            sb6.append(a0Var);
        }
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.MigrationFileSystem.class, 8);
        parcel.writeParcelable(this.f212716e, i17);
        this.f212717f.b(parcel);
        parcel.writeString(this.f212718g.f212921a);
        parcel.writeString(this.f212719h.f212921a);
        parcel.writeString(this.f212720i.f212921a);
        parcel.writeString(this.f212721m.f212921a);
        parcel.writeString(this.f212722n.f212921a);
    }

    public MigrationFileSystem(java.lang.String str, java.lang.String str2, com.tencent.mm.vfs.FileSystem fileSystem, com.tencent.mm.vfs.a0... a0VarArr) {
        this(str, str2, null, null, null, fileSystem, a0VarArr);
    }

    public MigrationFileSystem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.vfs.FileSystem fileSystem, com.tencent.mm.vfs.a0... a0VarArr) {
        if (fileSystem != null) {
            this.f212718g = new com.tencent.mm.vfs.f1(str);
            this.f212719h = new com.tencent.mm.vfs.f1(str2);
            this.f212720i = new com.tencent.mm.vfs.f1(str3);
            this.f212721m = new com.tencent.mm.vfs.f1(str4);
            this.f212722n = new com.tencent.mm.vfs.f1(str5);
            this.f212716e = fileSystem;
            this.f212717f = new com.tencent.mm.vfs.i1(a0VarArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("destination == null");
    }

    public MigrationFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.MigrationFileSystem.class, 8);
        this.f212716e = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212717f = new com.tencent.mm.vfs.i1(parcel);
        this.f212718g = new com.tencent.mm.vfs.f1(parcel.readString());
        this.f212719h = new com.tencent.mm.vfs.f1(parcel.readString());
        this.f212720i = new com.tencent.mm.vfs.f1(parcel.readString());
        this.f212721m = new com.tencent.mm.vfs.f1(parcel.readString());
        this.f212722n = new com.tencent.mm.vfs.f1(parcel.readString());
    }
}
