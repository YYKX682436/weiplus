package um2;

/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f429096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f429095d = x5Var;
        this.f429096e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ci ciVar = this.f429095d.f429023a1;
        if (ciVar != null) {
            return ciVar;
        }
        fm2.c cVar = this.f429096e;
        return new com.tencent.mm.plugin.finder.live.plugin.ci(cVar.getEmptyReuseFrameLayout(), cVar);
    }
}
