package um2;

/* loaded from: classes3.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428928d = x5Var;
        this.f428929e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428928d;
        fm2.c cVar = this.f428929e;
        return new com.tencent.mm.plugin.finder.live.plugin.ow((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.iag, cVar), cVar, cVar.getConfettiBitmapManager());
    }
}
