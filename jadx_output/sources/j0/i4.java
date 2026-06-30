package j0;

/* loaded from: classes14.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.o f296349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f296348d = v2Var;
        this.f296349e = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new j0.h4(this.f296348d, this.f296349e);
    }
}
