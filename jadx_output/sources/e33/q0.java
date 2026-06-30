package e33;

/* loaded from: classes10.dex */
public class q0 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI f247438c;

    public q0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI) {
        this.f247438c = albumPreviewUI;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        int itemViewType = this.f247438c.f138528m.getItemViewType(i17);
        return (itemViewType == 2 || itemViewType == 3) ? 4 : 1;
    }
}
