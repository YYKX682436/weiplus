package du2;

/* loaded from: classes2.dex */
public final class t implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu2.c f243501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService f243502b;

    public t(fu2.c cVar, com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService finderSystemPlayerService) {
        this.f243501a = cVar;
        this.f243502b = finderSystemPlayerService;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        fu2.c cVar = this.f243501a;
        fu2.a aVar2 = ((eu2.j) cVar).f256791b;
        aVar2.f266872a = bitmap;
        mn2.h3 h3Var = (mn2.h3) aVar.f293573a;
        aVar2.f266873b = h3Var != null ? h3Var.n() : null;
        du2.r rVar = com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService.f128477r;
        com.tencent.mm.plugin.finder.system_player.FinderSystemPlayerService finderSystemPlayerService = this.f243502b;
        finderSystemPlayerService.h(cVar);
        ((du2.q) ((jz5.n) finderSystemPlayerService.f128480p).getValue()).c(finderSystemPlayerService.f128478n, cVar, finderSystemPlayerService.f128481q);
    }
}
