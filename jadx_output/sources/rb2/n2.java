package rb2;

/* loaded from: classes10.dex */
public final class n2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f393698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f393700g;

    public n2(so2.y0 y0Var, com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, in5.s0 s0Var, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter) {
        this.f393697d = y0Var;
        this.f393698e = finderEmojiView;
        this.f393699f = s0Var;
        this.f393700g = nPresenter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f393697d.f410714r;
        java.lang.String md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
        if (md52 == null) {
            md52 = "";
        }
        objArr[0] = md52;
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f393698e;
        objArr[1] = java.lang.Integer.valueOf(finderEmojiView.getStatus());
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "emoji longClick %s emojiStatus:%d", objArr);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f393699f.f293121e, 1, false);
        k0Var.f211872n = new rb2.k2(finderEmojiView, 0, 1);
        so2.y0 y0Var = this.f393697d;
        k0Var.f211881s = new rb2.l2(0, y0Var, this.f393699f, 1, this.f393700g);
        k0Var.f211892z = new rb2.m2(0, y0Var);
        k0Var.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
