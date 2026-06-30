package um2;

/* loaded from: classes3.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f429106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f429107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f429106d = x5Var;
        this.f429107e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = this.f429106d.f429053m;
        if (zzVar != null) {
            return zzVar;
        }
        fm2.c cVar = this.f429107e;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.f485642ig4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.zz((android.view.ViewGroup) findViewById, cVar);
    }
}
