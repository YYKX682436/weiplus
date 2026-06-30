package ea3;

/* loaded from: classes10.dex */
public class b implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.n f250602a;

    public b(ea3.n nVar) {
        this.f250602a = nVar;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "setSelected() called with: index = [" + i17 + "], selected = [" + z17 + "]");
        ea3.n nVar = this.f250602a;
        nVar.getClass();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z18 = nVar.z(i17);
        if (z18 == null || com.tencent.mm.sdk.platformtools.t8.K0(z18.f138430e)) {
            com.tencent.mars.xlog.Log.e("LiteAppAlbumAdapter", "[onClick] null == item!");
            nVar.notifyItemChanged(i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "click image path:" + z18.f138430e);
        if (nVar.f250630g.contains(z18) == z17) {
            return;
        }
        nVar.J(i17, z18, null);
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return true;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "isSelected() called with: index = [" + i17 + "]");
        ea3.n nVar = this.f250602a;
        boolean contains = nVar.f250630g.contains(nVar.z(i17));
        nVar.getClass();
        return contains;
    }
}
