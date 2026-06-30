package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f127035a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f127036b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f127037c;

    public k(long j17, java.lang.String str, java.lang.String objectNonceId) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f127035a = j17;
        this.f127036b = str;
        this.f127037c = objectNonceId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.storage.k)) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.k kVar = (com.tencent.mm.plugin.finder.storage.k) obj;
        return this.f127035a == kVar.f127035a && kotlin.jvm.internal.o.b(this.f127036b, kVar.f127036b) && kotlin.jvm.internal.o.b(this.f127037c, kVar.f127037c);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f127035a) * 31;
        java.lang.String str = this.f127036b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f127037c.hashCode();
    }

    public java.lang.String toString() {
        return "FeedAndNonceId(feedId=" + this.f127035a + ", dupFlag=" + this.f127036b + ", objectNonceId=" + this.f127037c + ')';
    }
}
