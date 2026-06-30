package i33;

/* loaded from: classes10.dex */
public final class h extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = activity instanceof com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI ? (com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) activity : null;
        if (albumPreviewUI != null) {
            e33.b0 b0Var = albumPreviewUI.f138528m;
            androidx.recyclerview.widget.RecyclerView recyclerView = albumPreviewUI.f138516f;
            b0Var.D = true;
            recyclerView.P(b0Var.F);
        }
    }
}
