package um2;

/* loaded from: classes3.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428943d = x5Var;
        this.f428944e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428943d;
        fm2.c cVar = this.f428944e;
        return new com.tencent.mm.plugin.finder.live.plugin.ch0((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.fpa, cVar), cVar);
    }
}
