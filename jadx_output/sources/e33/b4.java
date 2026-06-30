package e33;

/* loaded from: classes10.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.c4 f247159e;

    public b4(e33.c4 c4Var, java.lang.String str) {
        this.f247159e = c4Var;
        this.f247158d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        e33.c4 c4Var = this.f247159e;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = c4Var.f247191c;
        e33.v2 v2Var = imagePreviewUI.f138579e;
        java.util.ArrayList arrayList = imagePreviewUI.f138583g;
        java.util.ArrayList arrayList2 = v2Var.f247501i;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        v2Var.h();
        v2Var.notifyDataSetChanged();
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI2 = c4Var.f247191c;
        e33.h5 h5Var = (e33.h5) imagePreviewUI2.f138581f.getAdapter();
        java.util.ArrayList arrayList3 = imagePreviewUI2.f138583g;
        java.util.ArrayList arrayList4 = h5Var.f247260h;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        h5Var.notifyDataSetChanged();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = c4Var.f247189a.getStringArrayListExtra("preview_select_image_list");
        imagePreviewUI2.f138591m.clear();
        if (stringArrayListExtra != null) {
            imagePreviewUI2.f138591m.addAll(stringArrayListExtra);
        }
        imagePreviewUI2.Q1.Y0(imagePreviewUI2.e7());
        imagePreviewUI2.f138603w.setText(imagePreviewUI2.getContext().getString(com.tencent.mm.R.string.f492182fj0));
        if (t21.d3.s() && (((i17 = imagePreviewUI2.L) == 3 || i17 == 16) && imagePreviewUI2.f138597q)) {
            imagePreviewUI2.s7();
        } else {
            imagePreviewUI2.f138604x.setVisibility(8);
        }
        if (imagePreviewUI2.f138591m.contains(j33.d0.g(this.f247158d))) {
            java.lang.String stringExtra = imagePreviewUI2.getIntent().getStringExtra("GalleryUI_ToUser");
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem k17 = imagePreviewUI2.f138579e.k(imagePreviewUI2.f138593o.intValue());
            if (k17 != null) {
                j33.d0.k(k17.f138434i, k17.f138430e, stringExtra, imagePreviewUI2.K || !imagePreviewUI2.f138597q, 0, true, k17);
                j33.d0.p(imagePreviewUI2, k17.f138434i, k17.f138430e, stringExtra, imagePreviewUI2.K || !imagePreviewUI2.f138597q, 0, true);
            }
        } else {
            imagePreviewUI2.D.performClick();
        }
        if (imagePreviewUI2.M) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImagePreviewUI", "skipPreviewToEdit, handlePhotoEditResult, invoke onSendItemClick");
            imagePreviewUI2.p7();
        }
    }
}
