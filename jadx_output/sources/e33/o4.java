package e33;

/* loaded from: classes10.dex */
public class o4 implements t23.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f247424a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f247425b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247426c;

    public o4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, long j17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        this.f247426c = imagePreviewUI;
        this.f247424a = j17;
        this.f247425b = galleryItem$MediaItem;
    }

    @Override // t23.q2
    public void a(t23.r2 r2Var) {
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247426c;
        if (r2Var.equals(imagePreviewUI.X.getTag())) {
            imagePreviewUI.X.setTag(null);
        }
        if (r2Var.f415256e != imagePreviewUI.f138593o.intValue()) {
            return;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = r2Var.f415259h;
        boolean isEmpty = android.text.TextUtils.isEmpty(galleryItem$VideoMediaItem.f138444v);
        int i17 = com.tencent.mm.R.color.f479550ab1;
        if (isEmpty) {
            java.lang.String string = imagePreviewUI.getString(com.tencent.mm.R.string.f492187fj5);
            android.view.View view = imagePreviewUI.V;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imagePreviewUI.U.setText(string);
            imagePreviewUI.F.setEnabled(false);
            imagePreviewUI.D.setEnabled(false);
            imagePreviewUI.F.setTextColor(imagePreviewUI.getResources().getColor(com.tencent.mm.R.color.f479550ab1));
            if (imagePreviewUI.f138591m.size() == 0) {
                imagePreviewUI.X6(false);
                return;
            }
            return;
        }
        int i18 = galleryItem$VideoMediaItem.f138446x;
        if (i18 >= imagePreviewUI.f138582f2 || (i18 > 0 && i18 < imagePreviewUI.f138586h2)) {
            android.view.View view2 = imagePreviewUI.V;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imagePreviewUI.U.setText(galleryItem$VideoMediaItem.f138446x >= imagePreviewUI.f138582f2 ? imagePreviewUI.f138584g2 : imagePreviewUI.f138588i2);
            imagePreviewUI.F.setEnabled(false);
            imagePreviewUI.D.setEnabled(false);
            imagePreviewUI.F.setTextColor(imagePreviewUI.getResources().getColor(com.tencent.mm.R.color.f479550ab1));
            if (imagePreviewUI.f138591m.size() == 0) {
                imagePreviewUI.X6(false);
            }
        } else {
            imagePreviewUI.F.setEnabled(true);
            imagePreviewUI.D.setEnabled(true);
            imagePreviewUI.F.setTextColor(imagePreviewUI.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            android.view.View view3 = imagePreviewUI.V;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (t21.d3.s() && imagePreviewUI.L == 3 && imagePreviewUI.f138597q && this.f247424a > j33.d0.h()) {
            boolean contains = imagePreviewUI.f138592n.contains(this.f247425b);
            imagePreviewUI.F.setEnabled(contains);
            imagePreviewUI.D.setEnabled(contains);
            android.widget.TextView textView = imagePreviewUI.F;
            android.content.res.Resources resources = imagePreviewUI.getResources();
            if (contains) {
                i17 = com.tencent.mm.R.color.f479549ab0;
            }
            textView.setTextColor(resources.getColor(i17));
            android.view.View view4 = imagePreviewUI.V;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$30", "get", "(Lcom/tencent/mm/plugin/gallery/model/VideoAnalysisTask;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (imagePreviewUI.f138591m.size() == 0) {
                imagePreviewUI.X6(false);
            }
        }
    }
}
