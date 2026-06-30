package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f115582a;

    /* renamed from: b, reason: collision with root package name */
    public int f115583b;

    /* renamed from: c, reason: collision with root package name */
    public int f115584c;

    public k(java.lang.String key, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        key = (i19 & 1) != 0 ? "" : key;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(key, "key");
        this.f115582a = key;
        this.f115583b = i17;
        this.f115584c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.util.k)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.k kVar = (com.tencent.mm.plugin.finder.live.util.k) obj;
        return kotlin.jvm.internal.o.b(this.f115582a, kVar.f115582a) && this.f115583b == kVar.f115583b && this.f115584c == kVar.f115584c;
    }

    public int hashCode() {
        return (((this.f115582a.hashCode() * 31) + java.lang.Integer.hashCode(this.f115583b)) * 31) + java.lang.Integer.hashCode(this.f115584c);
    }

    public java.lang.String toString() {
        return "CachePair(key=" + this.f115582a + ", value=" + this.f115583b + ", times=" + this.f115584c + ')';
    }
}
