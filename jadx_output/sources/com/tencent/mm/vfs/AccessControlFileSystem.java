package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class AccessControlFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.AccessControlFileSystem> CREATOR;

    /* renamed from: h, reason: collision with root package name */
    public static final short[] f212680h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f212681i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.ThreadLocal f212682m;

    /* renamed from: n, reason: collision with root package name */
    public static final char[] f212683n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f212684o;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212685e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f212686f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212687g;

    static {
        short[] sArr = {1, 2, Short.MAX_VALUE, 8, 16, 32, 584, 130, 258, 520};
        f212680h = sArr;
        int length = sArr.length;
        f212681i = length;
        CREATOR = new com.tencent.mm.vfs.b();
        f212682m = new java.lang.ThreadLocal();
        f212683n = new char[]{'-', 'l', 't', 'x'};
        f212684o = new byte[length];
    }

    public AccessControlFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, java.lang.String str) {
        this.f212685e = fileSystem;
        com.tencent.mm.vfs.f1 f1Var = new com.tencent.mm.vfs.f1(str);
        java.lang.String a17 = f1Var.a(java.util.Collections.emptyMap());
        if (a17 != null) {
            byte[] d17 = d(a17);
            this.f212686f = d17;
            if (d17 != null) {
                this.f212687g = null;
                return;
            }
            throw new java.lang.IllegalArgumentException("Unrecognized access control list: ".concat(a17));
        }
        this.f212686f = new byte[f212681i];
        this.f212687g = f1Var;
    }

    public static void c(int i17, com.tencent.mm.vfs.z7 z7Var) {
        java.lang.ThreadLocal threadLocal = f212682m;
        com.tencent.mm.vfs.d dVar = (com.tencent.mm.vfs.d) threadLocal.get();
        if (dVar == null) {
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
            threadLocal.set(new com.tencent.mm.vfs.d(i17, m17.f213266a, m17.f213267b));
        } else {
            java.io.StringWriter stringWriter = new java.io.StringWriter(1024);
            dVar.f212891d.printStackTrace(new java.io.PrintWriter(stringWriter));
            throw new java.lang.AssertionError("Acquired token not released:\n" + stringWriter);
        }
    }

    public static byte[] d(java.lang.String str) {
        int i17 = f212681i;
        byte[] bArr = new byte[i17];
        for (int i18 = 0; i18 < java.lang.Math.min(str.length(), i17); i18++) {
            char charAt = str.charAt(i18);
            if (charAt != '-') {
                if (charAt != 'L') {
                    if (charAt != 'T') {
                        if (charAt != 'X') {
                            if (charAt != 'l') {
                                if (charAt != 't') {
                                    if (charAt != 'x') {
                                        com.tencent.stubs.logger.Log.e("VFS.AccessControlFileSystem", "Unrecognized access policy: " + str.charAt(i18) + ", from " + str);
                                        return null;
                                    }
                                }
                            }
                        }
                        bArr[i18] = 3;
                    }
                    bArr[i18] = 2;
                }
                bArr[i18] = 1;
            } else {
                bArr[i18] = 0;
            }
        }
        return bArr;
    }

    public static void e(int i17) {
        java.lang.ThreadLocal threadLocal = f212682m;
        com.tencent.mm.vfs.d dVar = (com.tencent.mm.vfs.d) threadLocal.get();
        if (dVar == null) {
            throw new java.lang.AssertionError("Token not acquired.");
        }
        if (dVar.f212888a != i17) {
            throw new java.lang.AssertionError("Previous token access not matched.");
        }
        threadLocal.remove();
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        byte[] bArr;
        java.lang.String a17;
        com.tencent.mm.vfs.f1 f1Var = this.f212687g;
        if (f1Var == null || (a17 = f1Var.a(map)) == null || (bArr = d(a17)) == null) {
            bArr = this.f212686f;
        }
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) this.f212685e.b(map);
        return (q2Var == com.tencent.mm.vfs.NullFileSystem.f() || java.util.Arrays.equals(bArr, f212684o)) ? q2Var : new com.tencent.mm.vfs.c(this, q2Var, bArr, map);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.AccessControlFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.AccessControlFileSystem accessControlFileSystem = (com.tencent.mm.vfs.AccessControlFileSystem) obj;
        return this.f212685e.equals(accessControlFileSystem.f212685e) && java.util.Arrays.equals(this.f212686f, accessControlFileSystem.f212686f) && com.tencent.mm.vfs.e8.f(this.f212687g, accessControlFileSystem.f212687g);
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.AccessControlFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212685e, this.f212686f, this.f212687g};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (this.f212687g == null) {
            int i17 = f212681i;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17);
            for (int i18 = 0; i18 < i17; i18++) {
                sb6.append(f212683n[this.f212686f[i18]]);
            }
            str = sb6.toString();
        } else {
            str = "...";
        }
        objArr[0] = str;
        objArr[1] = this.f212685e;
        return java.lang.String.format("ac(%s) <- %s", objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.AccessControlFileSystem.class, 1);
        parcel.writeParcelable(this.f212685e, i17);
        parcel.writeByteArray(this.f212686f);
        com.tencent.mm.vfs.f1 f1Var = this.f212687g;
        parcel.writeString(f1Var == null ? null : f1Var.f212921a);
    }

    public AccessControlFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.AccessControlFileSystem.class, 1);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212685e = fileSystem;
        if (fileSystem != null) {
            byte[] bArr = new byte[f212681i];
            this.f212686f = bArr;
            parcel.readByteArray(bArr);
            java.lang.String readString = parcel.readString();
            this.f212687g = readString == null ? null : new com.tencent.mm.vfs.f1(readString);
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
