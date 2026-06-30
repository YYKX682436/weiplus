package e33;

/* loaded from: classes10.dex */
public class v3 implements e33.g5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247516a;

    public v3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247516a = imagePreviewUI;
    }

    public void a(android.view.View view, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247516a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "[onItemClick] position:%s %s", valueOf, java.lang.Boolean.valueOf(imagePreviewUI.f138594p));
        e33.h5 h5Var = (e33.h5) imagePreviewUI.f138581f.getAdapter();
        h5Var.f247268s = i17;
        h5Var.f247267r = i17;
        imagePreviewUI.f138577d.b(i17, false);
        if (imagePreviewUI.f138594p) {
            t23.p0.f415223o = true;
        } else {
            t23.p0.f415225q = true;
        }
    }

    public void b(int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247516a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMoved] fromPos:%s, toPos:%s,visiblePos:%s, mPosition:%s", valueOf, valueOf2, valueOf3, imagePreviewUI.f138593o);
        if (imagePreviewUI.f138594p) {
            j33.d0.r(imagePreviewUI.f138591m, i17, i18);
            t23.p0.f415222n = true;
            return;
        }
        j33.d0.r(imagePreviewUI.f138583g, i17, i18);
        e33.v2 v2Var = imagePreviewUI.f138579e;
        int intValue = imagePreviewUI.f138593o.intValue();
        v2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageAdapter", "[swapPosition]from:%s to:%s curPos:%s visiblePos:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(i19));
        if (!v2Var.f247503n) {
            j33.d0.r(v2Var.f247501i, i17, i18);
            v2Var.f247505p = i19;
            android.util.SparseArray sparseArray = v2Var.f228471f;
            android.view.View view = (android.view.View) sparseArray.get(intValue);
            v2Var.f247506q = view;
            ((java.util.LinkedList) v2Var.f228469d).remove(view);
            v2Var.f228470e.clear();
            sparseArray.clear();
            v2Var.f247507r = true;
            v2Var.notifyDataSetChanged();
            v2Var.f247511v = i19;
        }
        imagePreviewUI.f138577d.b(i19, false);
        e33.h5 h5Var = (e33.h5) imagePreviewUI.f138581f.getAdapter();
        h5Var.f247268s = i19;
        h5Var.f247267r = i19;
        t23.p0.f415224p = true;
    }
}
