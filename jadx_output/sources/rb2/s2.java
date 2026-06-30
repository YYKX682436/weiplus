package rb2;

/* loaded from: classes10.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393758f;

    public s2(rb2.z2 z2Var, in5.s0 s0Var, so2.y0 y0Var) {
        this.f393756d = z2Var;
        this.f393757e = s0Var;
        this.f393758f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshMoreIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393756d.f393686e;
        android.view.View itemView = this.f393757e.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        nPresenter.u(itemView, this.f393758f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshMoreIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
