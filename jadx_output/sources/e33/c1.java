package e33;

/* loaded from: classes10.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247182d;

    public c1(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247182d = albumPreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f247182d.f138523i2.name();
        if (e33.o1.SKIP != this.f247182d.f138523i2) {
            this.f247182d.Z7();
        }
    }
}
