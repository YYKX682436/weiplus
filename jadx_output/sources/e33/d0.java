package e33;

/* loaded from: classes10.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247195d;

    public d0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247195d = albumPreviewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = this.f247195d;
        viewGroup = ((com.tencent.mm.ui.MMActivity) albumPreviewUI).mWrappingFrame;
        if (viewGroup instanceof com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) {
            viewGroup2 = ((com.tencent.mm.ui.MMActivity) albumPreviewUI).mWrappingFrame;
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) viewGroup2).setNavigationBarStrategy(al5.q.f5991g);
            viewGroup3 = ((com.tencent.mm.ui.MMActivity) albumPreviewUI).mWrappingFrame;
            ((com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout) viewGroup3).M();
        }
    }
}
