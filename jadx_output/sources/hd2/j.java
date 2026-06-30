package hd2;

/* loaded from: classes8.dex */
public final class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment f280483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f280485f;

    public j(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment finderCommentShareDialogFragment, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f280483d = finderCommentShareDialogFragment;
        this.f280484e = context;
        this.f280485f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        o25.y1 y1Var = this.f280483d.f110041m;
        if (y1Var != null) {
            kotlin.jvm.internal.o.d(g4Var);
            ((com.tencent.mm.pluginsdk.forward.m) y1Var).wi(this.f280484e, g4Var, this.f280485f);
        }
    }
}
