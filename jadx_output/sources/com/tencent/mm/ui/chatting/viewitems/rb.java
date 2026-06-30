package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class rb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f205416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f205417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lb f205420f;

    public rb(com.tencent.mm.ui.chatting.viewitems.lb lbVar, android.content.Context context, boolean z17, com.tencent.mm.ui.chatting.viewitems.ya yaVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f205420f = lbVar;
        this.f205415a = context;
        this.f205416b = z17;
        this.f205417c = yaVar;
        this.f205418d = dVar;
        this.f205419e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f205415a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        g4Var.c(0, 4, 0, context.getResources().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
        if (this.f205416b) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.tencent.mm.ui.chatting.viewitems.lb lbVar = this.f205420f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(lbVar.f204413t.toString());
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(Ai);
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f205417c;
        if (!K0) {
            yaVar.f206058i.Y = new com.tencent.mm.ui.chatting.viewitems.b0(lbVar, this.f205418d, Ai);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            yaVar.f206058i.Y = null;
        }
        this.f205420f.D(this.f205418d, this.f205419e, 1, !com.tencent.mm.sdk.platformtools.t8.K0(Ai), lbVar.f204413t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
