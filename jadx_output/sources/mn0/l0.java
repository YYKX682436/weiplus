package mn0;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f329770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f329771b;

    /* renamed from: c, reason: collision with root package name */
    public final long f329772c;

    /* renamed from: d, reason: collision with root package name */
    public final long f329773d;

    /* renamed from: e, reason: collision with root package name */
    public final long f329774e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nw1 f329775f;

    public l0(java.lang.String streamId, java.lang.String anchorNickName, long j17, long j18, long j19, r45.nw1 nw1Var) {
        kotlin.jvm.internal.o.g(streamId, "streamId");
        kotlin.jvm.internal.o.g(anchorNickName, "anchorNickName");
        this.f329770a = streamId;
        this.f329771b = anchorNickName;
        this.f329772c = j17;
        this.f329773d = j18;
        this.f329774e = j19;
        this.f329775f = nw1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0.l0)) {
            return false;
        }
        mn0.l0 l0Var = (mn0.l0) obj;
        return kotlin.jvm.internal.o.b(this.f329770a, l0Var.f329770a) && kotlin.jvm.internal.o.b(this.f329771b, l0Var.f329771b) && this.f329772c == l0Var.f329772c && this.f329773d == l0Var.f329773d && this.f329774e == l0Var.f329774e && kotlin.jvm.internal.o.b(this.f329775f, l0Var.f329775f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f329770a.hashCode() * 31) + this.f329771b.hashCode()) * 31) + java.lang.Long.hashCode(this.f329772c)) * 31) + java.lang.Long.hashCode(this.f329773d)) * 31) + java.lang.Long.hashCode(this.f329774e)) * 31;
        r45.nw1 nw1Var = this.f329775f;
        return hashCode + (nw1Var == null ? 0 : nw1Var.hashCode());
    }

    public java.lang.String toString() {
        return "PlayerInfoData(streamId=" + this.f329770a + ", anchorNickName=" + this.f329771b + ", liveId=" + this.f329772c + ", feedId=" + this.f329773d + ", enterLiveTs=" + this.f329774e + ", liveInfo=" + this.f329775f + ')';
    }
}
