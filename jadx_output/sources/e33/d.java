package e33;

/* loaded from: classes10.dex */
public class d implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e33.b0 f247194a;

    public d(e33.b0 b0Var) {
        this.f247194a = b0Var;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        o23.n nVar = o23.m.f342426a;
        nVar.B.set(java.lang.Boolean.TRUE);
        e33.b0 b0Var = this.f247194a;
        b0Var.B = true;
        if (b0Var.E) {
            z17 = !z17;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = b0Var.E(i17);
        if (E == null || com.tencent.mm.sdk.platformtools.t8.K0(E.f138430e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AlbumAdapter", "[onClick] null == item!");
            b0Var.notifyItemChanged(i17);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "click image path:" + E.f138430e);
            if (b0Var.f247131g.contains(E) != z17) {
                b0Var.Q(i17, E, null);
            }
        }
        nVar.B.set(java.lang.Boolean.FALSE);
        b0Var.B = false;
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return true;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        e33.b0 b0Var = this.f247194a;
        boolean contains = b0Var.f247131g.contains(b0Var.E(i17));
        return b0Var.E ? !contains : contains;
    }
}
