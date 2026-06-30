package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f113401a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f113402b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f113403c;

    public lj(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f113401a = str;
        this.f113402b = str2;
        this.f113403c = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.lj)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.lj ljVar = (com.tencent.mm.plugin.finder.live.plugin.lj) obj;
        return kotlin.jvm.internal.o.b(this.f113401a, ljVar.f113401a) && kotlin.jvm.internal.o.b(this.f113402b, ljVar.f113402b) && kotlin.jvm.internal.o.b(this.f113403c, ljVar.f113403c);
    }

    public int hashCode() {
        java.lang.String str = this.f113401a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f113402b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f113403c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "username=" + this.f113401a + ", nickname=" + this.f113402b;
    }
}
