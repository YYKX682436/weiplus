package fv;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f266933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f266934b;

    public l(wu5.c task, int i17) {
        kotlin.jvm.internal.o.g(task, "task");
        this.f266933a = task;
        this.f266934b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv.l)) {
            return false;
        }
        fv.l lVar = (fv.l) obj;
        return kotlin.jvm.internal.o.b(this.f266933a, lVar.f266933a) && this.f266934b == lVar.f266934b;
    }

    public int hashCode() {
        return (this.f266933a.hashCode() * 31) + java.lang.Integer.hashCode(this.f266934b);
    }

    public java.lang.String toString() {
        return super.toString() + ", priority:" + this.f266934b + ", state:" + this.f266933a.getState();
    }
}
