package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class gb implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ya f204026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f204027c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ab f204030f;

    public gb(com.tencent.mm.ui.chatting.viewitems.ab abVar, android.content.Context context, com.tencent.mm.ui.chatting.viewitems.ya yaVar, boolean z17, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        this.f204030f = abVar;
        this.f204025a = context;
        this.f204026b = yaVar;
        this.f204027c = z17;
        this.f204028d = dVar;
        this.f204029e = f9Var;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f204025a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.ya yaVar = this.f204026b;
        java.lang.CharSequence a17 = yaVar.f206051b.a();
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) yaVar.f206051b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        g4Var.c(0, 4, 0, context.getResources().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
        if (this.f204027c) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        rq1.l0 l0Var = (rq1.l0) i95.n0.c(rq1.l0.class);
        com.tencent.mm.ui.chatting.viewitems.ab abVar = this.f204030f;
        java.lang.String Ai = ((rq1.m0) l0Var).Ai(abVar.f203293t.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            yaVar.f206058i.Y = new com.tencent.mm.ui.chatting.viewitems.b0(abVar, this.f204028d, Ai);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            yaVar.f206058i.Y = null;
        }
        this.f204030f.D(this.f204028d, this.f204029e, 1, !com.tencent.mm.sdk.platformtools.t8.K0(Ai), abVar.f203293t.toString(), true, "65_" + c01.id.c(), 3);
    }
}
