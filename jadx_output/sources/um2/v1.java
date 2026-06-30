package um2;

/* loaded from: classes3.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428991e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428990d = x5Var;
        this.f428991e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.th0 th0Var = this.f428990d.S0;
        if (th0Var != null) {
            return th0Var;
        }
        fm2.c cVar = this.f428991e;
        return new com.tencent.mm.plugin.finder.live.plugin.th0(cVar.getEmptyReuseFrameLayout(), cVar);
    }
}
