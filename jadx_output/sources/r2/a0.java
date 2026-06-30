package r2;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.s f368691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f368693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w0.s sVar, java.lang.String str, u1.y1 y1Var) {
        super(1);
        this.f368691d = sVar;
        this.f368692e = str;
        this.f368693f = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new r2.y(this.f368691d.d(this.f368692e, new r2.z(this.f368693f)));
    }
}
