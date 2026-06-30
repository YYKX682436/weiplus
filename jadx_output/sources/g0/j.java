package g0;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0.f f267352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0.l f267353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g0.f fVar, g0.l lVar) {
        super(1);
        this.f267352d = fVar;
        this.f267353e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        g0.f fVar = this.f267352d;
        o0.i iVar = ((g0.h) fVar).f267349a;
        g0.l lVar = this.f267353e;
        iVar.b(lVar);
        return new g0.i(fVar, lVar);
    }
}
