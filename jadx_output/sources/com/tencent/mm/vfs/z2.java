package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213266a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f213268c;

    public z2(com.tencent.mm.vfs.q2 q2Var, java.lang.String str, int i17, com.tencent.mm.vfs.r2 r2Var) {
        this.f213266a = q2Var;
        this.f213267b = str;
        this.f213268c = i17;
    }

    public boolean a() {
        return this.f213266a != null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.vfs.z2)) {
            return false;
        }
        com.tencent.mm.vfs.z2 z2Var = (com.tencent.mm.vfs.z2) obj;
        if (a() != z2Var.a()) {
            return false;
        }
        return com.tencent.mm.vfs.e8.f(this.f213266a, z2Var.f213266a) && com.tencent.mm.vfs.e8.f(this.f213267b, z2Var.f213267b);
    }

    public int hashCode() {
        if (!a()) {
            return 0;
        }
        java.lang.Object[] objArr = {this.f213266a, this.f213267b};
        java.util.regex.Pattern pattern = com.tencent.mm.vfs.e8.f212917a;
        return java.util.Arrays.deepHashCode(objArr);
    }

    public java.lang.String toString() {
        if (!a()) {
            return "[INVALID]";
        }
        return this.f213267b + " -> " + this.f213266a;
    }
}
