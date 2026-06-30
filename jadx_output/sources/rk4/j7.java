package rk4;

/* loaded from: classes.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f396757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f396758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f396759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396760i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f396761m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(rk4.k8 k8Var, kotlin.jvm.internal.h0 h0Var, bw5.o50 o50Var, bw5.ar0 ar0Var, boolean z17, android.content.Context context, yz5.a aVar) {
        super(4);
        this.f396755d = k8Var;
        this.f396756e = h0Var;
        this.f396757f = o50Var;
        this.f396758g = ar0Var;
        this.f396759h = z17;
        this.f396760i = context;
        this.f396761m = aVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String errorMsg = (java.lang.String) obj3;
        java.lang.String categoryId = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        pm0.v.X(new rk4.g7(this.f396756e));
        rk4.k8 k8Var = this.f396755d;
        kotlinx.coroutines.l.d(k8Var, null, null, new rk4.i7(booleanValue, intValue, errorMsg, categoryId, k8Var, this.f396757f, this.f396758g, this.f396759h, this.f396760i, this.f396761m, null), 3, null);
        return jz5.f0.f302826a;
    }
}
