package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f213032a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213033b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.vfs.x1 f213034c;

    public k6(int i17, java.lang.String str, com.tencent.mm.vfs.x1 entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        this.f213032a = i17;
        this.f213033b = str;
        this.f213034c = entry;
    }

    public final com.tencent.mm.vfs.x1 a() {
        return this.f213034c;
    }

    public final java.lang.String b() {
        return this.f213033b;
    }

    public final int c() {
        return this.f213032a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.vfs.k6)) {
            return false;
        }
        com.tencent.mm.vfs.k6 k6Var = (com.tencent.mm.vfs.k6) obj;
        return this.f213032a == k6Var.f213032a && kotlin.jvm.internal.o.b(this.f213033b, k6Var.f213033b) && kotlin.jvm.internal.o.b(this.f213034c, k6Var.f213034c);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f213032a) * 31;
        java.lang.String str = this.f213033b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f213034c.hashCode();
    }

    public java.lang.String toString() {
        return "TaggedFileEntry(tag=" + this.f213032a + ", fsName=" + this.f213033b + ", entry=" + this.f213034c + ')';
    }
}
