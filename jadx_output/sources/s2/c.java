package s2;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f402211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.g0 f402212f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402213g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p2.s f402214h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s2.b0 b0Var, yz5.a aVar, s2.g0 g0Var, java.lang.String str, p2.s sVar) {
        super(1);
        this.f402210d = b0Var;
        this.f402211e = aVar;
        this.f402212f = g0Var;
        this.f402213g = str;
        this.f402214h = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        s2.b0 b0Var = this.f402210d;
        b0Var.f402202s.addView(b0Var, b0Var.f402203t);
        b0Var.k(this.f402211e, this.f402212f, this.f402213g, this.f402214h);
        return new s2.b(b0Var);
    }
}
