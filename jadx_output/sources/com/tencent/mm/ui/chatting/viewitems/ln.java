package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ln implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ao f204496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f204497c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f204498d;

    public ln(com.tencent.mm.ui.chatting.viewitems.gn gnVar, android.content.Context context, com.tencent.mm.ui.chatting.viewitems.ao aoVar, boolean z17, boolean z18) {
        this.f204495a = context;
        this.f204496b = aoVar;
        this.f204497c = z17;
        this.f204498d = z18;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        android.content.Context context = this.f204495a;
        g4Var.c(0, 0, 0, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        com.tencent.mm.ui.chatting.viewitems.ao aoVar = this.f204496b;
        java.lang.CharSequence a17 = aoVar.f203379b.a();
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) aoVar.f203379b.getTag();
        int i17 = erVar != null ? c01.ia.i(erVar.c()) : 0;
        if (i17 <= 0 || i17 >= a17.length()) {
            g4Var.c(0, 1, 0, context.getResources().getString(com.tencent.mm.R.string.f492532gv1), com.tencent.mm.R.raw.icons_filled_allselect);
        }
        g4Var.c(0, 2, 0, context.getResources().getString(com.tencent.mm.R.string.guy), com.tencent.mm.R.raw.icons_filled_share);
        g4Var.c(0, 3, 0, context.getResources().getString(com.tencent.mm.R.string.c__), com.tencent.mm.R.raw.icons_filled_favorites);
        if (!this.f204497c) {
            g4Var.c(0, 4, 0, context.getResources().getString(com.tencent.mm.R.string.f490873b44), com.tencent.mm.R.raw.icons_filled_search_logo);
        }
        if (this.f204498d) {
            g4Var.c(0, 136, 0, view.getContext().getString(com.tencent.mm.R.string.b3v), com.tencent.mm.R.raw.icons_filled_quote);
        }
        aoVar.f203385h.Y = null;
    }
}
