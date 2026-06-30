package e33;

/* loaded from: classes10.dex */
public class n2 implements q23.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y51.c f247381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem f247382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247383d;

    public n2(e33.v2 v2Var, int i17, y51.c cVar, com.tencent.mm.plugin.gallery.model.GalleryItem$LivePhotoMediaItem galleryItem$LivePhotoMediaItem) {
        this.f247383d = v2Var;
        this.f247380a = i17;
        this.f247381b = cVar;
        this.f247382c = galleryItem$LivePhotoMediaItem;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "isSelectLive: %b position: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f247380a));
        y51.c cVar = this.f247381b;
        if (!z17) {
            o23.n nVar = o23.m.f342426a;
            nVar.D.a(4);
            nVar.D.a(1);
            ((y51.b) cVar).b();
            return;
        }
        o23.n nVar2 = o23.m.f342426a;
        nVar2.D.a(3);
        nVar2.D.a(2);
        ((y51.b) cVar).c();
        this.f247383d.p(this.f247382c, 2);
    }
}
