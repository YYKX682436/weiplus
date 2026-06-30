package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class AccessLogFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.AccessLogFileSystem> CREATOR = new com.tencent.mm.vfs.f();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.FileSystem f212688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f212689f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212690g;

    public AccessLogFileSystem(com.tencent.mm.vfs.FileSystem fileSystem, int i17, java.lang.String str) {
        this.f212688e = fileSystem;
        this.f212689f = i17;
        this.f212690g = str == null ? null : new com.tencent.mm.vfs.f1(str);
    }

    @Override // com.tencent.mm.vfs.a0
    public java.lang.Object b(java.util.Map map) {
        int i17 = this.f212689f;
        com.tencent.mm.vfs.f1 f1Var = this.f212690g;
        if (f1Var != null) {
            java.lang.String a17 = f1Var.a(map);
            java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
            if (a17 != null) {
                try {
                    i17 = java.lang.Integer.parseInt(a17);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
        }
        com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) this.f212688e.b(map);
        return i17 == 0 ? q2Var : new com.tencent.mm.vfs.g(this, q2Var, i17, map);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.mm.vfs.AccessLogFileSystem)) {
            return false;
        }
        com.tencent.mm.vfs.AccessLogFileSystem accessLogFileSystem = (com.tencent.mm.vfs.AccessLogFileSystem) obj;
        return this.f212688e.equals(accessLogFileSystem.f212688e) && this.f212689f == accessLogFileSystem.f212689f && com.tencent.mm.vfs.e8.f(this.f212690g, accessLogFileSystem.f212690g);
    }

    public int hashCode() {
        int hashCode = com.tencent.mm.vfs.AccessLogFileSystem.class.hashCode();
        java.lang.Object[] objArr = {this.f212688e, java.lang.Integer.valueOf(this.f212689f), this.f212690g};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return hashCode ^ java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        return java.lang.String.format("log(%04x) <- %s", java.lang.Integer.valueOf(this.f212689f), this.f212688e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.AccessLogFileSystem.class, 2);
        parcel.writeParcelable(this.f212688e, i17);
        parcel.writeInt(this.f212689f);
        com.tencent.mm.vfs.f1 f1Var = this.f212690g;
        parcel.writeString(f1Var == null ? null : f1Var.f212921a);
    }

    public AccessLogFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.AccessLogFileSystem.class, 2);
        com.tencent.mm.vfs.FileSystem fileSystem = (com.tencent.mm.vfs.FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f212688e = fileSystem;
        if (fileSystem != null) {
            this.f212689f = parcel.readInt();
            java.lang.String readString = parcel.readString();
            this.f212690g = readString == null ? null : new com.tencent.mm.vfs.f1(readString);
            return;
        }
        throw new java.lang.IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
