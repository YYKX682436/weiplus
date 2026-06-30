package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f115433a;

    /* renamed from: b, reason: collision with root package name */
    public long f115434b;

    /* renamed from: c, reason: collision with root package name */
    public int f115435c;

    /* renamed from: d, reason: collision with root package name */
    public long f115436d;

    public a(java.lang.String key, long j17, int i17, long j18, int i18, kotlin.jvm.internal.i iVar) {
        key = (i18 & 1) != 0 ? "" : key;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        j18 = (i18 & 8) != 0 ? 0L : j18;
        kotlin.jvm.internal.o.g(key, "key");
        this.f115433a = key;
        this.f115434b = j17;
        this.f115435c = i17;
        this.f115436d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.util.a)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.a aVar = (com.tencent.mm.plugin.finder.live.util.a) obj;
        return kotlin.jvm.internal.o.b(this.f115433a, aVar.f115433a) && this.f115434b == aVar.f115434b && this.f115435c == aVar.f115435c && this.f115436d == aVar.f115436d;
    }

    public int hashCode() {
        return (((((this.f115433a.hashCode() * 31) + java.lang.Long.hashCode(this.f115434b)) * 31) + java.lang.Integer.hashCode(this.f115435c)) * 31) + java.lang.Long.hashCode(this.f115436d);
    }

    public java.lang.String toString() {
        return "AverageCachePair(key=" + this.f115433a + ", valueCount=" + this.f115434b + ", times=" + this.f115435c + ", averageValue=" + this.f115436d + ')';
    }
}
