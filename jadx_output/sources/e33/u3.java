package e33;

/* loaded from: classes3.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247489d;

    public u3(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI) {
        this.f247489d = imagePreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int dimension = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479866hf);
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247489d;
        imagePreviewUI.f138581f.getLayoutParams().height = (dimension * 2) + (imagePreviewUI.getResources().getDisplayMetrics().widthPixels / 7);
        androidx.recyclerview.widget.RecyclerView recyclerView = imagePreviewUI.f138581f;
        int intValue = imagePreviewUI.f138593o.intValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$16", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
