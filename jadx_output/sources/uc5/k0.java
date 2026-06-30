package uc5;

/* loaded from: classes10.dex */
public final class k0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426517d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f426518e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f426519f;

    /* renamed from: g, reason: collision with root package name */
    public final long f426520g;

    /* renamed from: h, reason: collision with root package name */
    public final long f426521h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f426522i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String talker, java.lang.String sectionKey, java.lang.String displayText, long j17, long j18) {
        super(null);
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(sectionKey, "sectionKey");
        kotlin.jvm.internal.o.g(displayText, "displayText");
        this.f426517d = talker;
        this.f426518e = sectionKey;
        this.f426519f = displayText;
        this.f426520g = j17;
        this.f426521h = j18;
    }

    @Override // uc5.l0, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        int j17;
        uc5.l0 other = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        boolean z17 = other instanceof uc5.k0;
        java.lang.String str = this.f426518e;
        long j18 = this.f426520g;
        if (z17) {
            uc5.k0 k0Var = (uc5.k0) other;
            int j19 = kotlin.jvm.internal.o.j(k0Var.f426520g, j18);
            if (j19 != 0) {
                return j19;
            }
            int j27 = kotlin.jvm.internal.o.j(k0Var.f426521h, this.f426521h);
            if (j27 != 0) {
                return j27;
            }
            j17 = k0Var.f426518e.compareTo(str);
        } else if (other instanceof uc5.h0) {
            j17 = n((uc5.h0) other);
        } else if (other instanceof uc5.i0) {
            j17 = 1;
        } else {
            if (!(other instanceof uc5.j0)) {
                throw new jz5.j();
            }
            uc5.j0 j0Var = (uc5.j0) other;
            j17 = kotlin.jvm.internal.o.b(str, j0Var.f426511d) ? -1 : kotlin.jvm.internal.o.j(j18, j0Var.f426513f);
        }
        return j17;
    }

    @Override // xm3.a
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.k0)) {
            return false;
        }
        uc5.k0 k0Var = (uc5.k0) obj;
        return kotlin.jvm.internal.o.b(this.f426517d, k0Var.f426517d) && kotlin.jvm.internal.o.b(this.f426518e, k0Var.f426518e) && kotlin.jvm.internal.o.b(this.f426519f, k0Var.f426519f) && this.f426520g == k0Var.f426520g && this.f426521h == k0Var.f426521h;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.a
    public int hashCode() {
        return (((((((this.f426517d.hashCode() * 31) + this.f426518e.hashCode()) * 31) + this.f426519f.hashCode()) * 31) + java.lang.Long.hashCode(this.f426520g)) * 31) + java.lang.Long.hashCode(this.f426521h);
    }

    public final int n(uc5.h0 content) {
        kotlin.jvm.internal.o.g(content, "content");
        uc5.d dVar = content.f426494d;
        int j17 = kotlin.jvm.internal.o.j(dVar.p().T1(), this.f426520g);
        if (j17 != 0) {
            return j17;
        }
        int j18 = kotlin.jvm.internal.o.j(dVar.p().getMsgId(), this.f426521h);
        if (j18 != 0) {
            return j18;
        }
        return -1;
    }

    public java.lang.String toString() {
        return "Timeline(talker=" + this.f426517d + ", sectionKey=" + this.f426518e + ", displayText=" + this.f426519f + ", anchorCreateTime=" + this.f426520g + ", anchorMsgId=" + this.f426521h + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f426522i;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = "timeline#" + this.f426517d + '#' + this.f426518e + '#' + this.f426521h;
        this.f426522i = str2;
        return str2;
    }
}
