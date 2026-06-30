package ro2;

/* loaded from: classes2.dex */
public final class j implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f398055f;

    public j(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, java.lang.String str, java.util.Map map) {
        this.f398050a = qeVar;
        this.f398051b = s0Var;
        this.f398052c = baseFinderFeed;
        this.f398053d = context;
        this.f398054e = str;
        this.f398055f = map;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        int i17;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter footer;
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398050a;
        in5.s0 s0Var = this.f398051b;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = this.f398052c;
        kotlin.jvm.internal.o.f(item, "$item");
        android.content.Context context = this.f398053d;
        int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, s0Var, item, false, 0L, null, 0, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, false, 0L, (int) (i17 * kx2.a.f313278a.a(context)), 0, 1468, null);
        com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f398050a;
        com.tencent.mm.plugin.finder.view.f5 j27 = qeVar2.f104358f.j2();
        if (j27 != null && (finderCommentDrawer = j27.f132067a) != null && (footer = finderCommentDrawer.getFooter()) != null) {
            int i27 = com.tencent.mm.plugin.finder.view.FinderCommentFooter.N1;
            footer.t(this.f398054e, false, null);
        }
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        kotlin.jvm.internal.o.f(context, "$context");
        d2Var.h(context, "poster_send_to_cmt", "view_clk", false, this.f398055f);
        al5.u4 u4Var = qeVar2.F;
        if (u4Var != null) {
            u4Var.dismiss();
        }
    }
}
