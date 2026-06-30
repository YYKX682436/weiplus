package e0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f245721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f245722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(n0.e5 e5Var, n0.v2 v2Var) {
        super(0);
        this.f245721d = e5Var;
        this.f245722e = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e0.y0 y0Var = new e0.y0();
        ((yz5.l) this.f245721d.getValue()).invoke(y0Var);
        androidx.compose.foundation.lazy.layout.d dVar = y0Var.f245724b;
        java.util.List list = y0Var.f245725c;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        return new e0.a0(dVar, list, (e06.k) this.f245722e.getValue());
    }
}
