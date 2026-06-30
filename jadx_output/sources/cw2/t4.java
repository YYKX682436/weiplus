package cw2;

/* loaded from: classes2.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.gn2 f224020a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.e1 f224021b;

    public t4(r45.gn2 gn2Var, com.tencent.mm.pluginsdk.ui.e1 scaleType) {
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        this.f224020a = gn2Var;
        this.f224021b = scaleType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.t4)) {
            return false;
        }
        cw2.t4 t4Var = (cw2.t4) obj;
        return kotlin.jvm.internal.o.b(this.f224020a, t4Var.f224020a) && this.f224021b == t4Var.f224021b;
    }

    public int hashCode() {
        r45.gn2 gn2Var = this.f224020a;
        return ((gn2Var == null ? 0 : gn2Var.hashCode()) * 31) + this.f224021b.hashCode();
    }

    public java.lang.String toString() {
        return "FinderObjectScalingInfoWrapper(scalingInfo=" + this.f224020a + ", scaleType=" + this.f224021b + ')';
    }
}
