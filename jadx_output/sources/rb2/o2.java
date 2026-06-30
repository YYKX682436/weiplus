package rb2;

/* loaded from: classes10.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f393710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393711e;

    public o2(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, so2.y0 y0Var) {
        this.f393710d = nPresenter;
        this.f393711e = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        this.f393710d.H(view, this.f393711e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentImage$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
