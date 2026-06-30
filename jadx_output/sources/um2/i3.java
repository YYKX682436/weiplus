package um2;

/* loaded from: classes3.dex */
public final class i3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428829e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f428828d = x5Var;
        this.f428829e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        il2.r rVar = this.f428828d.C;
        if (rVar != null) {
            return rVar;
        }
        fm2.c cVar = this.f428829e;
        return new il2.r(cVar, cVar);
    }
}
