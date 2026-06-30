package z82;

/* loaded from: classes9.dex */
public class d implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f470725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject f470726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry f470727c;

    public d(com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject) {
        this.f470727c = favOpenApiEntry;
        this.f470725a = wXMediaMessage;
        this.f470726b = wXMusicVideoObject;
    }

    @Override // dk5.h2
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry favOpenApiEntry = this.f470727c;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavOpenApiEntry", "thumb img CDN upload fail!");
            com.tencent.mm.pluginsdk.model.app.m5.c(favOpenApiEntry, com.tencent.mm.pluginsdk.model.app.m5.a(favOpenApiEntry.getIntent().getExtras(), -1), true, false);
            favOpenApiEntry.finish();
        } else {
            com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject wXMusicVideoObject = this.f470726b;
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f470725a;
            wXMediaMessage.mediaObject = wXMusicVideoObject;
            int i17 = com.tencent.mm.plugin.favorite.ui.FavOpenApiEntry.f101681o;
            favOpenApiEntry.U6(wXMediaMessage, str);
        }
    }
}
