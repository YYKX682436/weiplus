package im3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem f292687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f292688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292687e = galleryItem$VideoMediaItem;
        this.f292688f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im3.e(this.f292687e, this.f292688f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292686d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvPreviewDataSource", "load width and height");
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f292687e;
            java.lang.String o17 = galleryItem$VideoMediaItem.o();
            if (o17 == null) {
                o17 = "";
            }
            java.lang.String simpleMp4InfoVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getSimpleMp4InfoVFS(o17);
            kotlin.jvm.internal.o.f(simpleMp4InfoVFS, "getSimpleMp4InfoVFS(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvPreviewDataSource", "get simple mp4 info %s", simpleMp4InfoVFS);
            org.json.JSONObject jSONObject = new org.json.JSONObject(simpleMp4InfoVFS);
            galleryItem$VideoMediaItem.f138446x = jSONObject.getInt("videoDuration");
            galleryItem$VideoMediaItem.f138447y = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            galleryItem$VideoMediaItem.f138448z = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            galleryItem$VideoMediaItem.A = jSONObject.getInt("videoBitrate");
            galleryItem$VideoMediaItem.C = jSONObject.getInt("videoFPS");
            galleryItem$VideoMediaItem.D = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(o17);
            galleryItem$VideoMediaItem.B = 0;
            galleryItem$VideoMediaItem.f138444v = j33.q.a(jSONObject.getString("videoType"));
            galleryItem$VideoMediaItem.f138445w = j33.q.a(jSONObject.getString("audioType"));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            im3.d dVar = new im3.d(this.f292688f, null);
            this.f292686d = 1;
            if (kotlinx.coroutines.l.g(g3Var, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
