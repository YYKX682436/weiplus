package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class an implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f203374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f203378e;

    public an(com.tencent.mm.ui.chatting.viewitems.ao aoVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, android.content.Context context, boolean z17) {
        this.f203374a = aoVar;
        this.f203375b = dVar;
        this.f203376c = f9Var;
        this.f203377d = context;
        this.f203378e = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f203374a;
        int length = aoVar.f203382e.getContentView().a().length();
        if (((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) this.f203375b.f460708c.a(sb5.k2.class))).t0(this.f203376c.getMsgId()) == com.tencent.mm.ui.chatting.viewitems.io.Transforming) {
            g4Var.add(0, 121, 0, com.tencent.mm.R.string.f490874b45);
            return;
        }
        g4Var.c(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203382e.getContentView().getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= length) {
            g4Var.c(0, 1, 0, this.f203377d.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        j45.l.g("favorite");
        g4Var.c(0, 3, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        if (this.f203378e) {
            return;
        }
        g4Var.c(0, 4, 0, view.getContext().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
    }
}
