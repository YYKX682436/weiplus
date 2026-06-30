package r01;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f368135a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368136b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f368137c;

    /* renamed from: d, reason: collision with root package name */
    public final int f368138d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f368139e;

    /* renamed from: f, reason: collision with root package name */
    public final int f368140f;

    public l(long j17, java.lang.String frameSetName, java.lang.String frameSetData, int i17, java.lang.String cardId, int i18) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        kotlin.jvm.internal.o.g(cardId, "cardId");
        this.f368135a = j17;
        this.f368136b = frameSetName;
        this.f368137c = frameSetData;
        this.f368138d = i17;
        this.f368139e = cardId;
        this.f368140f = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.l)) {
            return false;
        }
        r01.l lVar = (r01.l) obj;
        return this.f368135a == lVar.f368135a && kotlin.jvm.internal.o.b(this.f368136b, lVar.f368136b) && kotlin.jvm.internal.o.b(this.f368137c, lVar.f368137c) && this.f368138d == lVar.f368138d && kotlin.jvm.internal.o.b(this.f368139e, lVar.f368139e) && this.f368140f == lVar.f368140f;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f368135a) * 31) + this.f368136b.hashCode()) * 31) + this.f368137c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f368138d)) * 31) + this.f368139e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f368140f);
    }

    public java.lang.String toString() {
        return "BizDynamicCardInfo(msgId=" + this.f368135a + ", frameSetName=" + this.f368136b + ", frameSetData=" + this.f368137c + ", pos=" + this.f368138d + ", cardId=" + this.f368139e + ", subPos=" + this.f368140f + ')';
    }
}
