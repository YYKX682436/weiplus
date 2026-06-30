package mo2;

/* loaded from: classes2.dex */
public final class b implements com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f330354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mo2.q f330356c;

    public b(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, mo2.q qVar) {
        this.f330354a = baseFinderFeed;
        this.f330355b = s0Var;
        this.f330356c = qVar;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback
    public void a(int i17, java.util.List data, boolean z17) {
        int commentCount;
        kotlin.jvm.internal.o.g(data, "data");
        boolean z18 = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.w0().r()).intValue() == 1;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f330354a;
        if (z18) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(baseFinderFeed.getItemId());
            commentCount = h17 != null ? h17.getCommentCount() : baseFinderFeed.getFeedObject().getCommentCount();
        } else {
            commentCount = baseFinderFeed.getFeedObject().getCommentCount();
        }
        int i18 = commentCount;
        in5.s0 s0Var = this.f330355b;
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.c6s);
        if (i18 > 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(com.tencent.mm.plugin.finder.assist.w2.g(hc2.b0.j(baseFinderFeed, context) ? 1 : 2, i18));
        mo2.q qVar = this.f330356c;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f330354a;
        in5.s0 s0Var2 = this.f330355b;
        android.view.View p17 = s0Var2.p(com.tencent.mm.R.id.qhs);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.qku);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        qVar.v(baseFinderFeed2, s0Var2, (android.widget.TextView) p17, p18, i18);
    }
}
