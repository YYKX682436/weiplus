package hd2;

/* loaded from: classes8.dex */
public final class p implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280510c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280512e;

    public p(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, java.lang.String str, android.content.Context context, java.lang.String str2, int i17) {
        this.f280508a = finderCommentShareDialogFragment;
        this.f280509b = str;
        this.f280510c = context;
        this.f280511d = str2;
        this.f280512e = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        int i18 = this.f280512e;
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        java.lang.String str2 = this.f280509b;
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment = this.f280508a;
        if (!z17) {
            com.tencent.mm.plugin.finder.report.d2.g(d2Var, this.f280510c, "share_comment", false, finderCommentShareDialogFragment.o0(1, str2, i18), 4, null);
            finderCommentShareDialogFragment.dismiss();
            return;
        }
        finderCommentShareDialogFragment.dismiss();
        g45.a aVar = g45.b.f268846a;
        kotlin.jvm.internal.o.d(str2);
        aVar.a(str2, str, 0);
        tg3.a1 a17 = tg3.t1.a();
        android.content.Context context = this.f280510c;
        java.lang.String str3 = this.f280509b;
        java.lang.String str4 = this.f280511d;
        int i19 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n;
        ((dk5.s5) a17).aj(context, str3, str4, 0, "", "", null, null, finderCommentShareDialogFragment.n0());
        com.tencent.mm.ui.widget.snackbar.j.c(this.f280510c.getString(com.tencent.mm.R.string.fw6), null, finderCommentShareDialogFragment.getActivity(), null, null);
        com.tencent.mm.plugin.finder.report.d2.g(d2Var, this.f280510c, "share_comment", false, finderCommentShareDialogFragment.o0(0, str2, i18), 4, null);
    }
}
