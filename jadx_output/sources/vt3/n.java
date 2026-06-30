package vt3;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440015a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f440016b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f440017c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Long f440018d;

    public n(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.Long l18) {
        this.f440015a = str;
        this.f440016b = l17;
        this.f440017c = str2;
        this.f440018d = l18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3.n)) {
            return false;
        }
        vt3.n nVar = (vt3.n) obj;
        return kotlin.jvm.internal.o.b(this.f440015a, nVar.f440015a) && kotlin.jvm.internal.o.b(this.f440016b, nVar.f440016b) && kotlin.jvm.internal.o.b(this.f440017c, nVar.f440017c) && kotlin.jvm.internal.o.b(this.f440018d, nVar.f440018d);
    }

    public int hashCode() {
        java.lang.String str = this.f440015a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.f440016b;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str2 = this.f440017c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l18 = this.f440018d;
        return hashCode3 + (l18 != null ? l18.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FollowContext(followTemplateId=" + this.f440015a + ", followEventId=" + this.f440016b + ", followSongId=" + this.f440017c + ", sourceFeedId=" + this.f440018d + ')';
    }

    public /* synthetic */ n(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        this(str, l17, str2, (i17 & 8) != 0 ? null : l18);
    }
}
