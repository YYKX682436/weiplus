package cu2;

/* loaded from: classes2.dex */
public final class d implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f222379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f222380e;

    public d(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context) {
        this.f222379d = baseFinderFeed;
        this.f222380e = context;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        android.content.Context context = this.f222380e;
        if (integer != 0) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.nla);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            com.tencent.mars.xlog.Log.i("Finder.FinderCommentLogic", "anchorModifyFeedComment finder_feed_select_comment_no_ok " + ret.getInteger(1));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorModifyFeedComment suc FinderItem:");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f222379d;
        sb6.append(java.lang.System.identityHashCode(baseFinderFeed.getFeedObject()));
        sb6.append(" FinderObject:");
        sb6.append(java.lang.System.identityHashCode(baseFinderFeed.getFeedObject().getFeedObject()));
        sb6.append(",funcFlag:");
        sb6.append(baseFinderFeed.getFeedObject().getFeedObject().getFunc_flag());
        sb6.append(",isChoose:");
        sb6.append(baseFinderFeed.getFeedObject().isChosenComment());
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentLogic", sb6.toString());
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var2.d(com.tencent.mm.R.string.nld);
        e4Var2.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var2.c();
    }
}
