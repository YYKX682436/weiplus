package tm2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tm2.s2 s2Var, fm2.b bVar) {
        super(0);
        this.f420528d = s2Var;
        this.f420529e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.zz zzVar = this.f420528d.D;
        if (zzVar != null) {
            return zzVar;
        }
        fm2.b bVar = this.f420529e;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.f485642ig4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.zz((android.view.ViewGroup) findViewById, bVar);
    }
}
