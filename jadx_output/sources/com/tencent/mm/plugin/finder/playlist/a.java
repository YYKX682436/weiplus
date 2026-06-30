package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f122248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122249b;

    public a(long j17, int i17) {
        this.f122248a = j17;
        this.f122249b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.playlist.a)) {
            return false;
        }
        com.tencent.mm.plugin.finder.playlist.a aVar = (com.tencent.mm.plugin.finder.playlist.a) obj;
        return this.f122248a == aVar.f122248a && this.f122249b == aVar.f122249b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f122248a) * 31) + java.lang.Integer.hashCode(this.f122249b);
    }

    public java.lang.String toString() {
        return "CacheKey(collectionId=" + this.f122248a + ", enterType=" + this.f122249b + ')';
    }
}
