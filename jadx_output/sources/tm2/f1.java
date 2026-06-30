package tm2;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(tm2.s2 s2Var, fm2.b bVar) {
        super(0);
        this.f420506d = s2Var;
        this.f420507e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.hz hzVar = this.f420506d.B;
        if (hzVar != null) {
            return hzVar;
        }
        fm2.b bVar = this.f420507e;
        android.view.View findViewById = bVar.findViewById(com.tencent.mm.R.id.fco);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.hz((android.view.ViewGroup) findViewById, bVar);
    }
}
