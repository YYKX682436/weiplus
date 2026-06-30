package sm3;

/* loaded from: classes10.dex */
public final class r extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409904d;

    public r(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView) {
        this.f409904d = mvTracksEditView;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int u07 = parent.u0(view);
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f409904d;
        mvTracksEditView.f152014g.getClass();
        int i17 = u07 - 1;
        if (i17 >= 0 && i17 < mvTracksEditView.getTracks().size()) {
            if (i17 < mvTracksEditView.getTracks().size() - 1 || mvTracksEditView.getFillingWidth() > 0) {
                outRect.set(0, 0, mvTracksEditView.getSpaceSize(), 0);
            }
        }
    }
}
