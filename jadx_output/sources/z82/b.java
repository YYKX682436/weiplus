package z82;

/* loaded from: classes9.dex */
public class b implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry f470722d;

    public b(com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry) {
        this.f470722d = favOpenApiEntry;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry = this.f470722d;
        if (favOpenApiEntry.getWindow() != null && favOpenApiEntry.getWindow().getDecorView() != null && favOpenApiEntry.getWindow().getDecorView().getWindowToken() != null) {
            new com.tencent.mm.plugin.base.stub.k(favOpenApiEntry, favOpenApiEntry.f101684f, favOpenApiEntry.f101686h.openId, new z82.a(this)).a();
            return false;
        }
        int i17 = favOpenApiEntry.f101688m;
        if (i17 >= 10) {
            return false;
        }
        favOpenApiEntry.f101688m = i17 + 1;
        return true;
    }
}
