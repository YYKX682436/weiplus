package e33;

/* loaded from: classes3.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f247445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247446e;

    public q4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, int i17) {
        this.f247446e = imagePreviewUI;
        this.f247445d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f247446e.f138581f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f247445d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$32", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$32", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
