package i33;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f288294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f288295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f288296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f288297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f288298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f288299i;

    public z(i33.a0 a0Var, java.util.Set set, boolean z17, boolean z18, java.util.Set set2, kotlin.jvm.internal.c0 c0Var) {
        this.f288294d = a0Var;
        this.f288295e = set;
        this.f288296f = z17;
        this.f288297g = z18;
        this.f288298h = set2;
        this.f288299i = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView;
        i33.a0 a0Var = this.f288294d;
        yz5.a aVar = a0Var.f288145g;
        e33.b0 b0Var = aVar != null ? (e33.b0) aVar.invoke() : null;
        java.lang.String str = a0Var.f288144f;
        if (b0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "removeDeleted: ui failed");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = b0Var.f247131g;
        boolean removeAll = arrayList.removeAll(this.f288295e);
        boolean z17 = this.f288297g;
        boolean z18 = this.f288296f;
        if (z18) {
            i33.l1.x3(a0Var, ((v23.b) ((java.util.ArrayList) a0Var.f288149n).get(0)).f432886a, true, null, 4, null);
        } else if (z17) {
            java.util.ArrayList arrayList2 = b0Var.f247130f;
            java.util.Set set = this.f288298h;
            com.tencent.mars.xlog.Log.i("MicroMsg.AlbumAdapter", "removeMediaItems: removeSelect=%s, removeMedia=%s, delete count=%s, MediaItems size=%s, SelectItems size=%s", java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(arrayList2.removeAll(set)), java.lang.Integer.valueOf(set.size()), java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
            b0Var.notifyDataSetChanged();
        }
        yz5.a aVar2 = a0Var.f288147i;
        if (aVar2 != null && (imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) aVar2.invoke()) != null) {
            imageFolderMgrView.b(a0Var.f288149n, a0Var.f288151p);
        }
        com.tencent.mars.xlog.Log.i(str, "removeDeleted: ui " + z18 + ", " + z17 + ", " + this.f288299i.f310112d + ", " + removeAll + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
