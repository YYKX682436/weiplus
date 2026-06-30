package um2;

/* loaded from: classes3.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428916d = x5Var;
        this.f428917e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428916d;
        fm2.c cVar = this.f428917e;
        return new com.tencent.mm.plugin.finder.live.plugin.v6((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.ejz, cVar), cVar);
    }
}
