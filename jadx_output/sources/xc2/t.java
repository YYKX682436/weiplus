package xc2;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f453299a;

    /* renamed from: b, reason: collision with root package name */
    public final long f453300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f453301c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f453302d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f453303e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f453304f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f453305g;

    public t(int i17, long j17, int i18, java.util.List list, boolean z17, java.lang.String bypassData, int i19, kotlin.jvm.internal.i iVar) {
        z17 = (i19 & 16) != 0 ? false : z17;
        bypassData = (i19 & 32) != 0 ? "" : bypassData;
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        this.f453299a = i17;
        this.f453300b = j17;
        this.f453301c = i18;
        this.f453302d = list;
        this.f453303e = z17;
        this.f453304f = bypassData;
        this.f453305g = new java.util.LinkedHashSet();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof xc2.t) && ((xc2.t) obj).f453301c == this.f453301c;
    }

    public int hashCode() {
        return this.f453301c;
    }

    public java.lang.String toString() {
        return "FinderFeedAllJumpInfo(commentScene=" + this.f453299a + ", feedId=" + this.f453300b + ", position=" + this.f453301c + ", list=" + this.f453302d + ", isFromFeed=" + this.f453303e + ", bypassData=" + this.f453304f + ')';
    }
}
