package cu2;

/* loaded from: classes.dex */
public final class f implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222390d;

    public f(android.content.Context context) {
        this.f222390d = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        android.content.Context context = this.f222390d;
        if (integer == 0) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.cv6);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            return;
        }
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var2.d(com.tencent.mm.R.string.f491364cv5);
        e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var2.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentLogic", "anchorModifyFeedComment finder_feed_close_comment_no_ok " + ret.getInteger(1));
    }
}
