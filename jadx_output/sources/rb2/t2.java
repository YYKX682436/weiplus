package rb2;

/* loaded from: classes10.dex */
public final class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f393772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f393773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393774f;

    public t2(rb2.z2 z2Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f393772d = z2Var;
        this.f393773e = textView;
        this.f393774f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshPostState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = this.f393772d.f393686e;
        android.widget.TextView commentFailTV = this.f393773e;
        kotlin.jvm.internal.o.f(commentFailTV, "$commentFailTV");
        nPresenter.E(commentFailTV, this.f393774f.getAdapterPosition());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshPostState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
