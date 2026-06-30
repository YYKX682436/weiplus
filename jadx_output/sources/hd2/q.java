package hd2;

/* loaded from: classes8.dex */
public final class q implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280517b;

    public q(android.content.Context context, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment) {
        this.f280516a = context;
        this.f280517b = finderCommentShareDialogFragment;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.report.d2.g(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f280516a, "share_comment", false, this.f280517b.o0(0, null, 4), 4, null);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f280516a);
        e4Var.d(com.tencent.mm.R.string.mrk);
        e4Var.c();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        kotlin.jvm.internal.o.g(srcPath, "srcPath");
        kotlin.jvm.internal.o.g(destPath, "destPath");
        com.tencent.mm.plugin.finder.report.d2.g(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f280516a, "share_comment", false, this.f280517b.o0(1, null, 4), 4, null);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f280516a);
        e4Var.d(com.tencent.mm.R.string.mrj);
        e4Var.c();
    }
}
