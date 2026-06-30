package ns2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f339378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f339379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns2.g f339380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ns2.b f339381g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.ov2 ov2Var, r45.h32 h32Var, ns2.g gVar, ns2.b bVar) {
        super(1);
        this.f339378d = ov2Var;
        this.f339379e = h32Var;
        this.f339380f = gVar;
        this.f339381g = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.dd couponCallback = (com.tencent.mm.plugin.finder.view.dd) obj;
        kotlin.jvm.internal.o.g(couponCallback, "couponCallback");
        zl2.g gVar = zl2.g.f473770a;
        java.lang.String string = this.f339378d.getString(1);
        if (string == null) {
            string = "";
        }
        r45.h32 h32Var = this.f339379e;
        java.lang.String string2 = h32Var.getString(4);
        gVar.c(string, string2 != null ? string2 : "", false);
        r45.ov2 ov2Var = couponCallback.f131889a;
        r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
        if (l1Var != null) {
            com.tencent.mm.plugin.finder.assist.a.b(l1Var);
        }
        ns2.g gVar2 = this.f339380f;
        ns2.a aVar = gVar2.f339383e;
        ns2.b bVar = this.f339381g;
        if (aVar != null) {
            java.lang.String username = bVar.f339356b;
            kotlin.jvm.internal.o.g(username, "username");
            r45.h32 h32Var2 = ((com.tencent.mm.plugin.finder.live.widget.mj) aVar).f119076a.f117631u;
            if (h32Var2 != null) {
                zl2.t.f(h32Var2, ov2Var);
            }
        }
        ns2.a aVar2 = gVar2.f339383e;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.finder.live.widget.mj) aVar2).a(bVar.f339356b, h32Var, (bVar.f339363i || bVar.f339364j) ? false : true);
        }
        return jz5.f0.f302826a;
    }
}
