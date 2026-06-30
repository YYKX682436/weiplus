package e0;

/* loaded from: classes14.dex */
public final class n0 implements t1.d, androidx.compose.foundation.lazy.layout.d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final e0.l0 f245652f = new e0.l0();

    /* renamed from: d, reason: collision with root package name */
    public final e0.f1 f245653d;

    /* renamed from: e, reason: collision with root package name */
    public final e0.j f245654e;

    public n0(e0.f1 state, e0.j beyondBoundsInfo) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(beyondBoundsInfo, "beyondBoundsInfo");
        this.f245653d = state;
        this.f245654e = beyondBoundsInfo;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // t1.d
    public t1.f getKey() {
        return androidx.compose.foundation.lazy.layout.f0.f10400a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
