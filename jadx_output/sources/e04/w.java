package e04;

/* loaded from: classes15.dex */
public class w implements com.tencent.mm.plugin.scanner.view.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f246139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f246140b;

    public w(e04.p pVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f246140b = pVar;
        this.f246139a = m1Var;
    }

    @Override // com.tencent.mm.plugin.scanner.view.r
    public void a(com.tencent.mm.plugin.scanner.view.s sVar) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.modelbase.m1 m1Var = this.f246139a;
        d17.d(m1Var);
        e04.p pVar = this.f246140b;
        rz3.e eVar = pVar.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
        e04.p.c(pVar, m1Var);
    }
}
