package so2;

/* loaded from: classes2.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f410555a;

    /* renamed from: b, reason: collision with root package name */
    public int f410556b;

    /* renamed from: c, reason: collision with root package name */
    public long f410557c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f410558d;

    /* renamed from: e, reason: collision with root package name */
    public long f410559e;

    /* renamed from: f, reason: collision with root package name */
    public int f410560f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f410561g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f410562h;

    public q6(com.tencent.mm.protobuf.g gVar, int i17, long j17, java.lang.String str, long j18, int i18, com.tencent.mm.protobuf.g gVar2, java.lang.String str2, int i19, kotlin.jvm.internal.i iVar) {
        com.tencent.mm.protobuf.g gVar3 = (i19 & 1) != 0 ? null : gVar;
        int i27 = (i19 & 2) != 0 ? -1 : i17;
        long j19 = (i19 & 4) != 0 ? 0L : j17;
        java.lang.String str3 = (i19 & 8) != 0 ? null : str;
        long j27 = (i19 & 16) == 0 ? j18 : 0L;
        int i28 = (i19 & 32) == 0 ? i18 : -1;
        com.tencent.mm.protobuf.g gVar4 = (i19 & 64) != 0 ? null : gVar2;
        java.lang.String str4 = (i19 & 128) == 0 ? str2 : null;
        this.f410555a = gVar3;
        this.f410556b = i27;
        this.f410557c = j19;
        this.f410558d = str3;
        this.f410559e = j27;
        this.f410560f = i28;
        this.f410561g = gVar4;
        this.f410562h = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.q6)) {
            return false;
        }
        so2.q6 q6Var = (so2.q6) obj;
        return kotlin.jvm.internal.o.b(this.f410555a, q6Var.f410555a) && this.f410556b == q6Var.f410556b && this.f410557c == q6Var.f410557c && kotlin.jvm.internal.o.b(this.f410558d, q6Var.f410558d) && this.f410559e == q6Var.f410559e && this.f410560f == q6Var.f410560f && kotlin.jvm.internal.o.b(this.f410561g, q6Var.f410561g) && kotlin.jvm.internal.o.b(this.f410562h, q6Var.f410562h);
    }

    public int hashCode() {
        com.tencent.mm.protobuf.g gVar = this.f410555a;
        int hashCode = (((((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410556b)) * 31) + java.lang.Long.hashCode(this.f410557c)) * 31;
        java.lang.String str = this.f410558d;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f410559e)) * 31) + java.lang.Integer.hashCode(this.f410560f)) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f410561g;
        int hashCode3 = (hashCode2 + (gVar2 == null ? 0 : gVar2.hashCode())) * 31;
        java.lang.String str2 = this.f410562h;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TopicCollectionReqArgs(lastBuffer=" + this.f410555a + ", topicType=" + this.f410556b + ", fromObjectId=" + this.f410557c + ", dupFlag=" + this.f410558d + ", topicId=" + this.f410559e + ", rollDir=" + this.f410560f + ", topicBuffer=" + this.f410561g + ", encryptedTopicId=" + this.f410562h + ')';
    }
}
