package rb2;

/* loaded from: classes10.dex */
public final class w2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f393813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f393815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f393816g;

    public w2(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, so2.y0 y0Var, boolean z17, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f393813d = nPresenter;
        this.f393814e = y0Var;
        this.f393815f = z17;
        this.f393816g = weImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshRecommendLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f393815f;
        this.f393813d.l(this.f393814e, !z17);
        if (!z17 && (weImageView = this.f393816g) != null) {
            hc2.f1.d(weImageView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshRecommendLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
