package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class lo implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.lp f204499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f204503e;

    public lo(com.tencent.mm.ui.chatting.viewitems.lp lpVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, android.content.Context context, boolean z17) {
        this.f204499a = lpVar;
        this.f204500b = dVar;
        this.f204501c = f9Var;
        this.f204502d = context;
        this.f204503e = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        com.tencent.mm.ui.chatting.viewitems.lp lpVar = this.f204499a;
        int length = lpVar.f204511i.getContentView().a().length();
        sb5.k2 k2Var = (sb5.k2) this.f204500b.f460708c.a(sb5.k2.class);
        com.tencent.mm.storage.f9 f9Var = this.f204501c;
        com.tencent.mm.ui.chatting.component.xm xmVar = (com.tencent.mm.ui.chatting.component.xm) k2Var;
        if (xmVar.t0(f9Var.getMsgId()) == com.tencent.mm.ui.chatting.viewitems.io.Transforming) {
            g4Var.add(0, 121, 0, com.tencent.mm.R.string.f490874b45);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xmVar.s0(f9Var.getMsgId(), f9Var.z0()))) {
            return;
        }
        g4Var.c(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) lpVar.f204511i.getContentView().getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= length) {
            g4Var.c(0, 1, 0, this.f204502d.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        j45.l.g("favorite");
        g4Var.c(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (this.f204503e) {
            return;
        }
        g4Var.c(0, 4, 0, view.getContext().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
    }
}
