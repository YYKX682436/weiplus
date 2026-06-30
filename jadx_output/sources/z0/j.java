package z0;

/* loaded from: classes14.dex */
public class j extends androidx.compose.ui.platform.i3 implements z0.s {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.q f468911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l inspectorInfo, yz5.q factory) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        kotlin.jvm.internal.o.g(factory, "factory");
        this.f468911d = factory;
    }

    @Override // z0.t
    public boolean E(yz5.l lVar) {
        return z0.r.a(this, lVar);
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
