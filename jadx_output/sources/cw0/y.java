package cw0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.w0 f222695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f222697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f222699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(cw0.w0 w0Var, cw0.l0 l0Var, float f17, java.lang.Float f18, java.lang.Float f19) {
        super(1);
        this.f222695d = w0Var;
        this.f222696e = l0Var;
        this.f222697f = f17;
        this.f222698g = f18;
        this.f222699h = f19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f222695d.H();
        float f17 = this.f222697f;
        cw0.l0 l0Var = this.f222696e;
        l0Var.T7(f17, this.f222698g, this.f222699h);
        kotlinx.coroutines.l.d(l0Var.getMainScope(), null, null, new cw0.x(l0Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
