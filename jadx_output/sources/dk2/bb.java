package dk2;

/* loaded from: classes12.dex */
public final class bb implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f233248d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f233249e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f233250f;

    /* renamed from: g, reason: collision with root package name */
    public int f233251g;

    /* renamed from: h, reason: collision with root package name */
    public long f233252h;

    /* renamed from: i, reason: collision with root package name */
    public az2.j f233253i;

    public bb(int i17, com.tencent.mm.protobuf.f req) {
        kotlin.jvm.internal.o.g(req, "req");
        this.f233248d = i17;
        this.f233249e = req;
        this.f233251g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_polling_minimal_duration, 5);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        dk2.bb other = (dk2.bb) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f233252h, other.f233252h);
    }

    public java.lang.String toString() {
        return "Command(cmdId=" + this.f233248d + ", disabled=" + this.f233250f + ", req=" + this.f233249e + ", intervalSec=" + this.f233251g + ", requestTime=" + this.f233252h + ", requestingCgi=" + this.f233253i + ')';
    }
}
