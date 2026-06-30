package so2;

/* loaded from: classes2.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public so2.r4 f410636a;

    /* renamed from: b, reason: collision with root package name */
    public long f410637b;

    /* renamed from: c, reason: collision with root package name */
    public so2.v4 f410638c;

    /* renamed from: d, reason: collision with root package name */
    public int f410639d;

    /* renamed from: e, reason: collision with root package name */
    public long f410640e;

    /* renamed from: f, reason: collision with root package name */
    public sr2.u f410641f;

    public u4(so2.r4 showState, long j17, so2.v4 postState, int i17, long j18, sr2.u source, int i18, kotlin.jvm.internal.i iVar) {
        showState = (i18 & 1) != 0 ? so2.r4.f410575e : showState;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        postState = (i18 & 4) != 0 ? so2.v4.f410671d : postState;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        j18 = (i18 & 16) != 0 ? 0L : j18;
        source = (i18 & 32) != 0 ? sr2.u.f411727e : source;
        kotlin.jvm.internal.o.g(showState, "showState");
        kotlin.jvm.internal.o.g(postState, "postState");
        kotlin.jvm.internal.o.g(source, "source");
        this.f410636a = showState;
        this.f410637b = j17;
        this.f410638c = postState;
        this.f410639d = i17;
        this.f410640e = j18;
        this.f410641f = source;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.u4)) {
            return false;
        }
        so2.u4 u4Var = (so2.u4) obj;
        return this.f410636a == u4Var.f410636a && this.f410637b == u4Var.f410637b && this.f410638c == u4Var.f410638c && this.f410639d == u4Var.f410639d && this.f410640e == u4Var.f410640e && this.f410641f == u4Var.f410641f;
    }

    public int hashCode() {
        return (((((((((this.f410636a.hashCode() * 31) + java.lang.Long.hashCode(this.f410637b)) * 31) + this.f410638c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410639d)) * 31) + java.lang.Long.hashCode(this.f410640e)) * 31) + this.f410641f.hashCode();
    }

    public java.lang.String toString() {
        return "showState:" + this.f410636a + " localId:" + this.f410637b + " postState:" + this.f410638c + " progress:" + this.f410639d;
    }
}
