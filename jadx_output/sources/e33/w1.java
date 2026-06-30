package e33;

/* loaded from: classes10.dex */
public class w1 implements t23.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.x1 f247523d;

    public w1(e33.x1 x1Var) {
        this.f247523d = x1Var;
    }

    @Override // t23.m1
    public void u5(java.util.LinkedList linkedList, long j17, boolean z17) {
        e33.x1 x1Var = this.f247523d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "RetrieveFavMediaTask onQueryMediaFinished cancelUINotify: %s.", java.lang.Boolean.valueOf(x1Var.f247539h));
        if (x1Var.f247539h) {
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        if (linkedList != null) {
            linkedList2.addAll(linkedList);
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138438p;
        }
        e33.s1 s1Var = new e33.s1(null);
        s1Var.f247454d = x1Var.f247535d;
        s1Var.f247455e = x1Var.f247536e;
        s1Var.f247458h = linkedList2;
        s1Var.f247460m = x1Var.f247537f;
        t23.p0.n().c(s1Var);
    }
}
