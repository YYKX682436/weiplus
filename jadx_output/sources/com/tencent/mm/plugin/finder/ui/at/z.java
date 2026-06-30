package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f128918a;

    /* renamed from: b, reason: collision with root package name */
    public final long f128919b;

    public z(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f128918a = name;
        this.f128919b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.ui.at.z)) {
            return false;
        }
        com.tencent.mm.plugin.finder.ui.at.z zVar = (com.tencent.mm.plugin.finder.ui.at.z) obj;
        return kotlin.jvm.internal.o.b(this.f128918a, zVar.f128918a) && this.f128919b == zVar.f128919b;
    }

    public int hashCode() {
        return (this.f128918a.hashCode() * 31) + java.lang.Long.hashCode(this.f128919b);
    }

    public java.lang.String toString() {
        return "RecentAtBean(name='" + this.f128918a + "', time=" + this.f128919b + ')';
    }
}
