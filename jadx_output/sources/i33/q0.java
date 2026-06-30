package i33;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(i33.t0 t0Var) {
        super(0);
        this.f288237d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f288237d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (i33.b1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(i33.b1.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
