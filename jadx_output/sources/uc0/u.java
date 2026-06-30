package uc0;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f426278a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f426279b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.kl5 f426280c;

    public u(java.util.List remark, java.util.List phone, r45.kl5 kl5Var) {
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(phone, "phone");
        this.f426278a = remark;
        this.f426279b = phone;
        this.f426280c = kl5Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.u)) {
            return false;
        }
        uc0.u uVar = (uc0.u) obj;
        return kotlin.jvm.internal.o.b(this.f426278a, uVar.f426278a) && kotlin.jvm.internal.o.b(this.f426279b, uVar.f426279b) && kotlin.jvm.internal.o.b(this.f426280c, uVar.f426280c);
    }

    public int hashCode() {
        int hashCode = ((this.f426278a.hashCode() * 31) + this.f426279b.hashCode()) * 31;
        r45.kl5 kl5Var = this.f426280c;
        return hashCode + (kl5Var == null ? 0 : kl5Var.hashCode());
    }

    public java.lang.String toString() {
        return "RecommendRemarkSplit(remark=" + this.f426278a + ", phone=" + this.f426279b + ", imgMsgData=" + this.f426280c + ')';
    }
}
