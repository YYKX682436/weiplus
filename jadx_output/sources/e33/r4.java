package e33;

/* loaded from: classes3.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f247450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247451e;

    public r4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, int i17) {
        this.f247451e = imagePreviewUI;
        this.f247450d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f247451e.f138581f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f247450d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$33", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/gallery/ui/ImagePreviewUI$33", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
