package rb2;

/* loaded from: classes10.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f393663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f393664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393665f;

    public j2(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, so2.y0 y0Var) {
        this.f393663d = nPresenter;
        this.f393664e = finderEmojiView;
        this.f393665f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderEmojiView emojiView = this.f393664e;
        kotlin.jvm.internal.o.f(emojiView, "$emojiView");
        this.f393663d.n(emojiView, this.f393665f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
