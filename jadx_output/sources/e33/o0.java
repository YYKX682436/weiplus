package e33;

/* loaded from: classes10.dex */
public class o0 extends com.tencent.mm.view.recyclerview.ObservableGridLayoutManager {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI, android.content.Context context, int i17, int i18) {
        super(context, i17);
        this.E = i18;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int G(androidx.recyclerview.widget.h3 h3Var) {
        int i17 = this.E;
        return i17 != 0 ? i17 : super.G(h3Var);
    }
}
