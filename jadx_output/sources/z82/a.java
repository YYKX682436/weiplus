package z82;

/* loaded from: classes9.dex */
public class a implements com.tencent.mm.plugin.base.stub.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z82.b f470721a;

    public a(z82.b bVar) {
        this.f470721a = bVar;
    }

    @Override // com.tencent.mm.plugin.base.stub.j
    public void a(boolean z17) {
        z82.b bVar = this.f470721a;
        boolean isFinishing = bVar.f470722d.isFinishing();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavOpenApiEntry", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing);
        if (z17 && !isFinishing) {
            com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry = bVar.f470722d;
            com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry.T6(favOpenApiEntry, favOpenApiEntry.f101686h.message);
        } else {
            com.tencent.mm.pluginsdk.model.app.m5.c(bVar.f470722d, com.tencent.mm.pluginsdk.model.app.m5.a(bVar.f470722d.getIntent().getExtras(), -3), true, false);
            bVar.f470722d.finish();
        }
    }
}
