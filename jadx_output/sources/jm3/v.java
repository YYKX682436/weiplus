package jm3;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f300358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        super(0);
        this.f300357d = musicMvMakerUI;
        this.f300358e = galleryItem$MediaItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300357d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem data = (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) this.f300358e;
        h4Var.getClass();
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "updateAlbumItem:" + data);
        java.util.ArrayList arrayList = h4Var.f151161e;
        if (arrayList.size() != 0) {
            int i17 = h4Var.f151167n.f151864m;
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            fm3.q qVar2 = new fm3.q();
            fm3.q.f264104p.c(qVar, qVar2);
            java.lang.Object obj2 = h4Var.f151162f.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            qVar2.f264114o = qVar;
            arrayList.set(i17, qVar2);
            qVar2.f264109g = 1;
            qVar2.f264112m = new fm3.m(data);
            java.lang.String n17 = data.n();
            kotlin.jvm.internal.o.f(n17, "uniqueValue(...)");
            java.lang.String str = data.f138430e;
            kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
            fm3.p pVar = new fm3.p(n17, str, data.f138446x, 0, 0, 24, null);
            pVar.f264098d = data.f138448z;
            pVar.f264099e = data.f138447y;
            qVar2.f264113n = pVar;
            fm3.g0.f264070a.b(i17, qVar2);
            h4Var.T6(i17, qVar2, new com.tencent.mm.plugin.mv.ui.uic.e4(h4Var, i17, qVar2));
        }
        ((com.tencent.mm.plugin.mv.ui.uic.h4) zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class)).f151174u = true;
        return jz5.f0.f302826a;
    }
}
