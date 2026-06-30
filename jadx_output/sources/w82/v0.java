package w82;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f443938e;

    public v0(com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f443937d = favTopTagPanel;
        this.f443938e = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f443937d;
        int f17 = i65.a.f(favTopTagPanel.getContext(), com.tencent.mm.R.dimen.f479738dv);
        favTopTagPanel.getClass();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f443938e;
        java.lang.Object parent = weImageView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) parent;
        view.post(new w82.w0(weImageView, f17, view));
    }
}
