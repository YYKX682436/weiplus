package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class NativeFileSystem extends com.tencent.mm.vfs.AbstractFileSystem {
    public static final android.os.Parcelable.Creator<com.tencent.mm.vfs.NativeFileSystem> CREATOR = new com.tencent.mm.vfs.y3();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.f1 f212737e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.h4 f212738f;

    public NativeFileSystem(java.lang.String str) {
        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, true, false);
        com.tencent.mm.vfs.f1 f1Var = new com.tencent.mm.vfs.f1(l17);
        this.f212737e = f1Var;
        if (l17.isEmpty()) {
            this.f212738f = new com.tencent.mm.vfs.h4(this, l17);
        } else {
            this.f212738f = f1Var.f212922b != null ? null : new com.tencent.mm.vfs.h4(this, l17);
        }
    }

    public static java.io.FileNotFoundException c(java.lang.Exception exc) {
        if (exc instanceof java.io.FileNotFoundException) {
            return (java.io.FileNotFoundException) exc;
        }
        if (exc instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) exc);
        }
        java.io.FileNotFoundException fileNotFoundException = new java.io.FileNotFoundException(exc.getMessage());
        fileNotFoundException.initCause(exc);
        return fileNotFoundException;
    }

    public static int d(java.lang.String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new java.lang.IllegalArgumentException("Invalid mode: " + str);
    }

    public static boolean f(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        boolean z17 = true;
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                z17 &= file2.isDirectory() ? f(file2) : file2.delete();
            }
        }
        return file.delete() & z17;
    }

    @Override // com.tencent.mm.vfs.a0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.vfs.q2 b(java.util.Map map) {
        com.tencent.mm.vfs.h4 h4Var = this.f212738f;
        if (h4Var != null) {
            return h4Var;
        }
        java.lang.String a17 = this.f212737e.a(map);
        return a17 == null ? com.tencent.mm.vfs.NullFileSystem.f() : new com.tencent.mm.vfs.h4(this, a17);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.NativeFileSystem) {
            if (this.f212737e.equals(((com.tencent.mm.vfs.NativeFileSystem) obj).f212737e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.NativeFileSystem.class.hashCode() ^ this.f212737e.hashCode();
    }

    public java.lang.String toString() {
        return this.f212737e.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.tencent.mm.vfs.e8.u(parcel, com.tencent.mm.vfs.NativeFileSystem.class, 2);
        parcel.writeString(this.f212737e.f212921a);
    }

    public NativeFileSystem(android.os.Parcel parcel) {
        com.tencent.mm.vfs.e8.b(parcel, com.tencent.mm.vfs.NativeFileSystem.class, 2);
        java.lang.String readString = parcel.readString();
        java.lang.String l17 = readString == null ? "" : com.tencent.mm.vfs.e8.l(readString, true, false);
        com.tencent.mm.vfs.f1 f1Var = new com.tencent.mm.vfs.f1(l17);
        this.f212737e = f1Var;
        if (l17.isEmpty()) {
            this.f212738f = new com.tencent.mm.vfs.h4(this, l17);
        } else {
            this.f212738f = f1Var.f212922b != null ? null : new com.tencent.mm.vfs.h4(this, l17);
        }
    }
}
