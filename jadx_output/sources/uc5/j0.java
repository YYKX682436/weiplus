package uc5;

/* loaded from: classes10.dex */
public final class j0 extends uc5.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f426512e;

    /* renamed from: f, reason: collision with root package name */
    public final long f426513f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f426514g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String sectionKey, int i17, long j17) {
        super(null);
        kotlin.jvm.internal.o.g(sectionKey, "sectionKey");
        this.f426511d = sectionKey;
        this.f426512e = i17;
        this.f426513f = j17;
    }

    @Override // uc5.l0, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        uc5.l0 other = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof uc5.i0)) {
            boolean z17 = other instanceof uc5.j0;
            long j17 = this.f426513f;
            if (z17) {
                uc5.j0 j0Var = (uc5.j0) other;
                int j18 = kotlin.jvm.internal.o.j(j17, j0Var.f426513f);
                return j18 != 0 ? j18 : kotlin.jvm.internal.o.i(this.f426512e, j0Var.f426512e);
            }
            if (!(other instanceof uc5.k0)) {
                if (other instanceof uc5.h0) {
                    return -1;
                }
                throw new jz5.j();
            }
            uc5.k0 k0Var = (uc5.k0) other;
            if (!kotlin.jvm.internal.o.b(this.f426511d, k0Var.f426518e)) {
                return kotlin.jvm.internal.o.j(j17, k0Var.f426520g);
            }
        }
        return 1;
    }

    @Override // xm3.a
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.j0)) {
            return false;
        }
        uc5.j0 j0Var = (uc5.j0) obj;
        return kotlin.jvm.internal.o.b(this.f426511d, j0Var.f426511d) && this.f426512e == j0Var.f426512e && this.f426513f == j0Var.f426513f;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return -2;
    }

    @Override // xm3.a
    public int hashCode() {
        return (((this.f426511d.hashCode() * 31) + java.lang.Integer.hashCode(this.f426512e)) * 31) + java.lang.Long.hashCode(this.f426513f);
    }

    public java.lang.String toString() {
        return "SectionPadding(sectionKey=" + this.f426511d + ", index=" + this.f426512e + ", anchorCreateTime=" + this.f426513f + ')';
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f426514g;
        if (str != null) {
            return str;
        }
        java.lang.String str2 = "section_padding#" + this.f426511d + '#' + this.f426512e;
        this.f426514g = str2;
        return str2;
    }
}
