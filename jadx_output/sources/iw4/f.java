package iw4;

/* loaded from: classes15.dex */
public final class f extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.GridLayoutManager f295254d;

    public f(com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI, androidx.recyclerview.widget.GridLayoutManager gridLayoutManager) {
        this.f295253c = sosSimilarUI;
        this.f295254d = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        int itemViewType = ((a85.a) this.f295253c.f182051e).getItemViewType(i17);
        if (itemViewType != 100) {
            switch (itemViewType) {
                case 104:
                case 105:
                case 106:
                case 107:
                    break;
                default:
                    return 1;
            }
        }
        return this.f295254d.f11861w;
    }
}
