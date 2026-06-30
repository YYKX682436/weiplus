package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class td implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f205575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.od f205576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f205577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f205578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.pd f205580f;

    public td(com.tencent.mm.ui.chatting.viewitems.pd pdVar, android.content.Context context, com.tencent.mm.ui.chatting.viewitems.od odVar, boolean z17, boolean z18, com.tencent.mm.storage.f9 f9Var) {
        this.f205580f = pdVar;
        this.f205575a = context;
        this.f205576b = odVar;
        this.f205577c = z17;
        this.f205578d = z18;
        this.f205579e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f205575a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.od odVar = this.f205576b;
        java.lang.CharSequence a17 = odVar.f205179b.a();
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) odVar.f205179b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 == 0) {
            i17 = a17.length();
        }
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        if (!this.f205577c) {
            g4Var.c(0, 4, 0, context.getResources().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
        }
        if (this.f205578d) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.tencent.mm.ui.chatting.viewitems.pd pdVar = this.f205580f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(pdVar.f205252t.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            odVar.f205183f.Y = new com.tencent.mm.ui.chatting.viewitems.b0(pdVar, pdVar.f205251s, Ai);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            odVar.f205183f.Y = null;
        }
        pdVar.D(pdVar.f205251s, this.f205579e, 1, !com.tencent.mm.sdk.platformtools.t8.K0(Ai), pdVar.f205252t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
