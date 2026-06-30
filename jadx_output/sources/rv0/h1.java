package rv0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400028d = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.h1(this.f400028d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> list = this.f400028d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : list) {
            arrayList.add(new com.tencent.maas.instamovie.base.asset.MJAssetInfo(qg.a.Filepath, galleryItem$MediaItem.f138430e, galleryItem$MediaItem.getType() == 2 ? qg.c.Video : qg.c.Image));
        }
        return com.tencent.maas.moviecomposing.ComposingFactory.d(arrayList);
    }
}
