package jb0;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.pluginsdk.model.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.g2 f298681a;

    public e(com.tencent.mm.pluginsdk.model.g2 g2Var) {
        this.f298681a = g2Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.n0
    public void a(android.content.Context context) {
        com.tencent.mm.pluginsdk.model.o3 o3Var;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.pluginsdk.model.f2 f2Var = this.f298681a.f189318k;
        if (f2Var == null || (o3Var = f2Var.f189298b) == null) {
            return;
        }
        bc5.e eVar = ((ac5.b) o3Var).f3085a;
        java.util.List V = kz5.n0.V(eVar.f19186b);
        oy.j jVar = (oy.j) ((jz5.n) eVar.f19196l).getValue();
        kotlin.jvm.internal.o.f(jVar, "<get-msgWordingService>(...)");
        eVar.a(((te5.l1) jVar).nj(eVar.f19185a, V, eVar.f19187c, false, true, true, true, 2), V, true);
    }
}
