package e33;

/* loaded from: classes5.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f247253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f247254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.ImagePreviewUI f247255f;

    public h4(com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI, java.util.List list, java.util.List list2) {
        this.f247255f = imagePreviewUI;
        this.f247253d = list;
        this.f247254e = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
        com.tencent.mm.plugin.gallery.ui.ImagePreviewUI imagePreviewUI = this.f247255f;
        imagePreviewUI.runOnUiThread(new e33.g4(this, (java.lang.String) imagePreviewUI.b7(this.f247253d, this.f247254e).f302833d));
    }
}
