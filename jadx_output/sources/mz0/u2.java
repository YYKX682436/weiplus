package mz0;

/* loaded from: classes4.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333069d = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mz0.u2(this.f333069d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mz0.u2 u2Var = (mz0.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : this.f333069d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("md5", kk.k.e(galleryItem$MediaItem.f138430e));
            jSONObject.put(ya.b.SOURCE, 2);
            boolean z17 = galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
            jSONObject.put("dur", z17 ? ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x : 0);
            if (z17) {
                com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker multiMediaVideoChecker = com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker.f156451a;
                java.lang.String str = ((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138430e;
                kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                qc0.d1 b17 = multiMediaVideoChecker.b(str);
                jSONObject.put("height", b17 != null ? b17.f361364b : 0);
                jSONObject.put("width", b17 != null ? b17.f361363a : 0);
            } else {
                android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(galleryItem$MediaItem.f138430e);
                jSONObject.put("height", n07 != null ? n07.outHeight : 0);
                jSONObject.put("width", n07 != null ? n07.outWidth : 0);
            }
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        dx1.f.n(dx1.g.f244489a, "SnsTemplate", "mediadetail", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONArray2, null, false, null, null, 208, null);
        return jz5.f0.f302826a;
    }
}
