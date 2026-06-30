package xm3;

/* loaded from: classes.dex */
public abstract class a implements xm3.d, java.lang.Cloneable {
    public java.lang.Object clone() {
        return super.clone();
    }

    public boolean equals(java.lang.Object obj) {
        xm3.d dVar = obj instanceof xm3.d ? (xm3.d) obj : null;
        if (dVar != null) {
            return s0(dVar);
        }
        return false;
    }

    @Override // in5.c
    public final long getItemId() {
        return v().hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    @Override // xm3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public xm3.d y0() {
        java.lang.Object clone = super.clone();
        kotlin.jvm.internal.o.e(clone, "null cannot be cast to non-null type T of com.tencent.mm.plugin.mvvmlist.BaseMvvmListItem");
        return (xm3.d) clone;
    }

    @Override // xm3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean s0(xm3.d other) {
        kotlin.jvm.internal.o.g(other, "other");
        return getItemId() == other.getItemId();
    }
}
