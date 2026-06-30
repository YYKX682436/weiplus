package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f212873a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f212874b;

    /* renamed from: c, reason: collision with root package name */
    public final int f212875c;

    /* renamed from: d, reason: collision with root package name */
    public final int f212876d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.u f212877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f212878f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f212879g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f212880h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f212881i;

    public c6(java.lang.String name, java.lang.String dirName, int i17, int i18, com.tencent.mm.vfs.u cleanPolicy, java.util.Map map, java.util.List list, yz5.l lVar, java.util.List list2) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dirName, "dirName");
        kotlin.jvm.internal.o.g(cleanPolicy, "cleanPolicy");
        this.f212873a = name;
        this.f212874b = dirName;
        this.f212875c = i17;
        this.f212876d = i18;
        this.f212877e = cleanPolicy;
        this.f212878f = map;
        this.f212879g = list;
        this.f212880h = lVar;
        this.f212881i = list2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.vfs.c6)) {
            return false;
        }
        com.tencent.mm.vfs.c6 c6Var = (com.tencent.mm.vfs.c6) obj;
        return kotlin.jvm.internal.o.b(this.f212873a, c6Var.f212873a) && kotlin.jvm.internal.o.b(this.f212874b, c6Var.f212874b) && this.f212875c == c6Var.f212875c && this.f212876d == c6Var.f212876d && kotlin.jvm.internal.o.b(this.f212877e, c6Var.f212877e) && kotlin.jvm.internal.o.b(this.f212878f, c6Var.f212878f) && kotlin.jvm.internal.o.b(this.f212879g, c6Var.f212879g) && kotlin.jvm.internal.o.b(this.f212880h, c6Var.f212880h) && kotlin.jvm.internal.o.b(this.f212881i, c6Var.f212881i);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f212873a.hashCode() * 31) + this.f212874b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f212875c)) * 31) + java.lang.Integer.hashCode(this.f212876d)) * 31) + this.f212877e.hashCode()) * 31;
        java.util.Map map = this.f212878f;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        java.util.List list = this.f212879g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        yz5.l lVar = this.f212880h;
        int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.util.List list2 = this.f212881i;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "StorageConfig(name=" + this.f212873a + ", dirName=" + this.f212874b + ", flags=" + this.f212875c + ", tag=" + this.f212876d + ", cleanPolicy=" + this.f212877e + ", env=" + this.f212878f + ", paths=" + this.f212879g + ", wrapper=" + this.f212880h + ", noCleanPaths=" + this.f212881i + ')';
    }
}
