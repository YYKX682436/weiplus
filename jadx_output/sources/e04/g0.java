package e04;

/* loaded from: classes15.dex */
public class g0 implements com.tencent.mm.plugin.scanner.view.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w60.k f245941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f245942b;

    public g0(e04.p pVar, w60.k kVar) {
        this.f245942b = pVar;
        this.f245941a = kVar;
    }

    @Override // com.tencent.mm.plugin.scanner.view.r
    public void a(com.tencent.mm.plugin.scanner.view.s sVar) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        java.lang.Object obj = this.f245941a;
        d17.d((com.tencent.mm.modelbase.m1) obj);
        e04.p pVar = this.f245942b;
        rz3.e eVar = pVar.f246059w;
        if (eVar != null) {
            eVar.a(1, null);
        }
        e04.p.c(pVar, (com.tencent.mm.modelbase.m1) obj);
    }
}
