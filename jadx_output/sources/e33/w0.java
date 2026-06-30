package e33;

/* loaded from: classes10.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f247521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247522e;

    public w0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, java.util.List list) {
        this.f247522e = albumPreviewUI;
        this.f247521d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.f138509t2;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247522e;
        albumPreviewUI.runOnUiThread(new e33.v0(this, (java.lang.String) albumPreviewUI.w7(this.f247521d).f302833d));
    }
}
